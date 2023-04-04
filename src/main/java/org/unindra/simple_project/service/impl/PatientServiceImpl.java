package org.unindra.simple_project.service.impl;

import org.unindra.simple_project.entity.Patient;
import org.unindra.simple_project.repository.PatientRepository;
import org.unindra.simple_project.service.PatientService;

import java.util.List;

public class PatientServiceImpl implements PatientService {

    private final PatientRepository<Patient, String> repository;

    public PatientServiceImpl(PatientRepository<Patient, String> repository) {
        this.repository = repository;
    }

    @Override
    public Patient create(Patient patient) {
        return repository.save(patient);
    }

    @Override
    public Patient getById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient Not Found"));
    }

    @Override
    public List<Patient> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Patient> getByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Patient update(Patient patient) {
        getById(patient.getId());
        return repository.update(patient);
    }

    @Override
    public void deleteById(String id) {
        getById(id);
        repository.deleteById(id);
    }
}
