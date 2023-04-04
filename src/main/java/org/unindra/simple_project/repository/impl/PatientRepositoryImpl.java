package org.unindra.simple_project.repository.impl;

import org.unindra.simple_project.config.DbConfig;
import org.unindra.simple_project.entity.Patient;
import org.unindra.simple_project.repository.PatientRepository;
import org.unindra.simple_project.utils.ReflectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientRepositoryImpl extends CRUDRepositoryImpl<Patient, String> implements PatientRepository {
    public PatientRepositoryImpl() {
        super(Patient.class);
    }

    @Override
    public List<Patient> findByName(String name) {
        try (Connection connection = DbConfig.getConnection()) {
            String tableName = ReflectionUtil.getTableName(Patient.class);
            String sql = String.format("SELECT id, name, gender, address, blood_type FROM %s WHERE name LIKE ?", tableName);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setObject(1, name + "%");
            ResultSet resultSet = statement.executeQuery();

            List<Patient> patients = new ArrayList<>();

            while (resultSet.next()) {
                Patient patient = new Patient(
                    resultSet.getString("id"),
                    resultSet.getString("name"),
                    resultSet.getString("gender"),
                    resultSet.getString("address"),
                    resultSet.getString("blood_type")
                );
                patients.add(patient);
            }

            return patients;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
