package org.unindra.simple_project.repository;

import org.unindra.simple_project.entity.Patient;

import java.util.List;

public interface PatientRepository {

    List<Patient> findByName(String name);

}
