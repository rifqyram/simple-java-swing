package org.unindra.simple_project.service;

import org.unindra.simple_project.entity.Patient;

import java.util.List;

public interface PatientService {
    Patient create(Patient patient);
    Patient getById(String id);
    List<Patient> getAll();
    List<Patient> getByName(String name);
    Patient update(Patient patient);
    void deleteById(String id);
}
