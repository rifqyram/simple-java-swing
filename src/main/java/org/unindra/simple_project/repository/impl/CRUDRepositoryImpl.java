package org.unindra.simple_project.repository.impl;

import org.unindra.simple_project.annotation.Column;
import org.unindra.simple_project.annotation.Id;
import org.unindra.simple_project.config.DbConfig;
import org.unindra.simple_project.repository.CRUDRepository;
import org.unindra.simple_project.utils.ReflectionUtil;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class CRUDRepositoryImpl<T, ID> implements CRUDRepository<T, ID> {

    private final Class<T> tClass;

    protected CRUDRepositoryImpl(Class<T> tClass) {
        this.tClass = tClass;
    }

    @Override
    public T save(T entity) {
        try (Connection connection = DbConfig.getConnection()) {
            String tableName = ReflectionUtil.getTableName(entity.getClass());
            List<String> annotationFields = ReflectionUtil.getAnnotationFields(entity.getClass());
            String columns = String.join(", ", annotationFields);
            String params = annotationFields.stream().map(s -> new StringBuilder("?")).collect(Collectors.joining(", "));
            String sql = String.format("INSERT INTO %s (%s) VALUES (%s)", tableName, columns, params);
            PreparedStatement statement = connection.prepareStatement(sql);

            int counter = 1;
            for (Field declaredField : entity.getClass().getDeclaredFields()) {
                declaredField.setAccessible(true);
                Object o = declaredField.get(entity);
                statement.setObject(counter, o);
                counter++;
            }

            statement.executeUpdate();
            statement.close();

            return entity;
        } catch (SQLException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<T> findById(ID id) {
        try (Connection connection = DbConfig.getConnection()) {
            String tableName = ReflectionUtil.getTableName(tClass);
            String annotationId = ReflectionUtil.getAnnotationId(tClass);
            List<String> annotationFields = ReflectionUtil.getAnnotationFields(tClass);
            String columns = String.join(", ", annotationFields);
            String sql = String.format("SELECT %s FROM %s WHERE %s = ?", columns, tableName, annotationId);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setObject(1, id);

            ResultSet resultSet = statement.executeQuery();
            T t = tClass.newInstance();

            if (resultSet.next()) {
                for (Field declaredField : t.getClass().getDeclaredFields()) {
                    declaredField.setAccessible(true);
                    Column annotation = declaredField.getAnnotation(Column.class);
                    Object value = resultSet.getObject(annotation.name());
                    declaredField.set(t, value);
                }
            }

            statement.close();

            return Optional.of(t);
        } catch (SQLException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<T> findAll() {
        try (Connection connection = DbConfig.getConnection()) {
            String tableName = ReflectionUtil.getTableName(tClass);
            List<String> annotationFields = ReflectionUtil.getAnnotationFields(tClass);
            String columns = String.join(", ", annotationFields);
            String sql = String.format("SELECT %s FROM %s", columns, tableName);
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            List<T> tList = new ArrayList<>();

            while (resultSet.next()) {
                T t = tClass.newInstance();
                for (Field declaredField : t.getClass().getDeclaredFields()) {
                    declaredField.setAccessible(true);
                    Column annotation = declaredField.getAnnotation(Column.class);
                    Object value = resultSet.getObject(annotation.name());
                    declaredField.set(t, value);
                }
                tList.add(t);
            }

            statement.close();

            return tList;
        } catch (SQLException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public T update(T entity) {
        try (Connection connection = DbConfig.getConnection()) {
            String annotationId = ReflectionUtil.getAnnotationId(entity.getClass());
            String tableName = ReflectionUtil.getTableName(entity.getClass());
            List<String> annotationFields = ReflectionUtil.getAnnotationFieldWithoutId(entity.getClass());

            StringBuilder params = new StringBuilder(annotationFields.size());
            for (String annotationField : annotationFields) {
                params.append(annotationField).append(" = ?, ");
            }

            String substringParams = params.substring(0, params.length() - 2);
            String sql = String.format("UPDATE %s SET %s WHERE %s = ?", tableName, substringParams, annotationId);

            PreparedStatement statement = connection.prepareStatement(sql);
            Object id = null;

            int counter = 1;
            for (Field declaredField : entity.getClass().getDeclaredFields()) {
                declaredField.setAccessible(true);
                if (declaredField.isAnnotationPresent(Id.class)) {
                    id = declaredField.get(entity);
                    continue;
                }
                Object value = declaredField.get(entity);
                statement.setObject(counter, value);
                counter++;
            }

            statement.setObject(counter, id);

            if (id == null) throw new RuntimeException("Id not found");

            statement.executeUpdate();
            statement.close();

            return entity;
        } catch (SQLException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteById(ID id) {
        try (Connection connection = DbConfig.getConnection()) {
            String annotationId = ReflectionUtil.getAnnotationId(tClass);
            String tableName = ReflectionUtil.getTableName(tClass);
            String sql = String.format("DELETE FROM %s WHERE %s = ?", tableName, annotationId);

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setObject(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
