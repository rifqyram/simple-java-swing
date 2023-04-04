package org.unindra.simple_project;

import org.unindra.simple_project.controller.PatientController;
import org.unindra.simple_project.entity.Patient;
import org.unindra.simple_project.repository.PatientRepository;
import org.unindra.simple_project.repository.impl.PatientRepositoryImpl;
import org.unindra.simple_project.service.PatientService;
import org.unindra.simple_project.service.impl.PatientServiceImpl;
import org.unindra.simple_project.view.PatientView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        PatientRepository<Patient, String> crudRepository = new PatientRepositoryImpl();
        PatientService patientService = new PatientServiceImpl(crudRepository);
        PatientView patientView = new PatientView();
        SwingUtilities.invokeLater(() -> new PatientController(patientService, patientView));
    }
}
