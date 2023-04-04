package org.unindra.simple_project.service.impl;

import org.unindra.simple_project.entity.Patient;
import org.unindra.simple_project.repository.PatientRepository;
import org.unindra.simple_project.repository.impl.CRUDRepositoryImpl;
import org.unindra.simple_project.service.PatientService;

import java.util.List;

public class PatientServiceImpl extends CRUDRepositoryImpl<Patient, String> implements PatientService {

    private final PatientRepository repository;

    public PatientServiceImpl(PatientRepository repository) {
        super(Patient.class);
        this.repository = repository;
    }

    @Override
    public Patient create(Patient patient) {
        return super.save(patient);
    }

    @Override
    public Patient getById(String id) {
        return super.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient Not Found"));
    }

    @Override
    public List<Patient> getAll() {
        return super.findAll();
    }

    @Override
    public List<Patient> getByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Patient update(Patient patient) {
        getById(patient.getId());
        return super.update(patient);
    }

    @Override
    public void deleteById(String id) {
        getById(id);
        super.deleteById(id);
    }
}
