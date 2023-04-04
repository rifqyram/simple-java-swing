package org.unindra.simple_project.utils;

import org.unindra.simple_project.annotation.Column;
import org.unindra.simple_project.annotation.Id;
import org.unindra.simple_project.annotation.Table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReflectionUtil {

    public static <T> List<String> getAnnotationFields(Class<T> tClass) {
        List<String> names = new ArrayList<>();
        for (Field field : tClass.getDeclaredFields()) {
            Column annotation = field.getAnnotation(Column.class);
            names.add(annotation.name());
        }
        return names;
    }

    public static <T> List<String> getAnnotationFieldWithoutId(Class<T> tClass) {
        List<String> names = new ArrayList<>();
        for (Field field : tClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(Id.class)) continue;
            Column annotation = field.getAnnotation(Column.class);
            names.add(annotation.name());
        }
        return names;
    }

    public static <T> String getTableName(Class<T> tClass) {
        Table annotation = tClass.getAnnotation(Table.class);
        return annotation.name();
    }

    public static <T> String getAnnotationId(Class<T> tClass) {
        for (Field declaredField : tClass.getDeclaredFields()) {
            if (declaredField.isAnnotationPresent(Id.class)) {
                return declaredField.getName();
            }
        }

        throw new RuntimeException("Entity Class must have an Id");
    }

}
