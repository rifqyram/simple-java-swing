package org.unindra.simple_project.controller;

import org.unindra.simple_project.entity.Patient;
import org.unindra.simple_project.service.PatientService;
import org.unindra.simple_project.utils.RandomGenerator;
import org.unindra.simple_project.view.PatientView;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.AbstractTableModel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class PatientController {

    private final PatientService patientService;
    private final PatientView patientView;
    private final PatientModel patientModel;
    private List<Patient> patients;
    private Patient selectedPatient;

    public PatientController(PatientService patientService, PatientView patientView) {
        this.patientService = patientService;
        this.patientView = patientView;
        this.patientModel = new PatientModel();
        this.patients = loadPatient();

        patientView.getSaveBtn().setEnabled(false);

        initEventController();
        setBtnIfNotSelected();

        patientView.setVisible(true);
    }

    private void initEventController() {
        patientView.getSaveBtn().addActionListener(this::savePatient);
        patientView.getEditBtn().addActionListener(this::editPatient);
        patientView.getDeleteBtn().addActionListener(this::deletePatient);
        patientView.getClearBtn().addActionListener(this::clearForm);
        patientView.getGenerateIdBtn().addActionListener(e -> {
            patientView.getSaveBtn().setEnabled(true);
            patientView.getTfId().setText(RandomGenerator.generateUUID());
        });
        patientView.getPatientTable().getSelectionModel().addListSelectionListener(this::getSelectedPatient);
        patientView.getSearchBtn().addActionListener(this::searchByPatientName);
        patientView.getExitBtn().addActionListener(this::exitApp);
    }

    private void exitApp(ActionEvent actionEvent) {
        System.exit(0);
    }

    private void getSelectedPatient(ListSelectionEvent e) {
        if (!patientView.getPatientTable().getSelectionModel().isSelectionEmpty()) {
            setBtnIfSelected();
            setForm();
            int idx = patientView.getPatientTable().convertRowIndexToModel(patientView.getPatientTable().getSelectedRow());
            selectedPatient = patients.get(idx);
        }
    }

    private List<Patient> loadPatient() {
        patientView.getPatientTable().setModel(patientModel);
        try {
            return patientService.getAll();
        } catch (RuntimeException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
            return new ArrayList<>();
        }
    }

    private void searchByPatientName(ActionEvent actionEvent) {
        String filter = patientView.getTfSearch().getText();

        if (filter.length() == 0) {
            patients = loadPatient();
        } else {
            patients = patientService.getByName(filter);
        }

        patientModel.fireTableDataChanged();
    }

    private void savePatient(ActionEvent e) {
        try {
            Patient patient = new Patient(patientView.getTfId().getText(),
                    patientView.getTfName().getText(),
                    getRadioValue(),
                    patientView.getTaAddress().getText(),
                    String.valueOf(patientView.getComboBoxBloodType().getSelectedItem()));
            Patient savedPatient = patientService.create(patient);
            patients.add(savedPatient);
            patientModel.fireTableDataChanged();
            JOptionPane.showMessageDialog(null, "Successfully save new patient");
            clearForm(e);
        } catch (RuntimeException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
    }

    private void editPatient(ActionEvent e) {
        try {
            if (selectedPatient != null) {
                PatientView pv = patientView;
                int i = patients.indexOf(selectedPatient);
                selectedPatient.setName(pv.getTfName().getText());
                selectedPatient.setGender(getRadioValue());
                selectedPatient.setBloodType(String.valueOf(pv.getComboBoxBloodType().getSelectedItem()));
                patientService.update(selectedPatient);
                JOptionPane.showMessageDialog(null, "Successfully update patient");
                patients.set(i, selectedPatient);
                patientModel.fireTableDataChanged();
                clearForm(e);
            }
        } catch (RuntimeException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
    }

    private void deletePatient(ActionEvent e) {
        try {
            if (selectedPatient == null) return;

            int i = JOptionPane.showConfirmDialog(null, "Are you sure wanna remove this patient?", "Warning!", JOptionPane.YES_NO_CANCEL_OPTION);

            if (i == 0) {
                patientService.deleteById(selectedPatient.getId());
                JOptionPane.showMessageDialog(null, "Successfully remove patient");
                patients.remove(selectedPatient);
                patientModel.fireTableDataChanged();
                clearForm(e);
            }
        } catch (RuntimeException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
    }

    private void setForm() {
        if (selectedPatient != null) {
            PatientView pv = patientView;
            pv.getTfId().setEnabled(false);
            pv.getTfId().setText(selectedPatient.getId());
            pv.getTfName().setText(selectedPatient.getName());
            pv.getTaAddress().setText(selectedPatient.getAddress());
            setSelectedRadio(selectedPatient.getGender());
            setSelectedBloodType(selectedPatient.getBloodType());
        }
    }

    private void clearForm(ActionEvent e) {
        patientView.getTfId().setText("");
        patientView.getTfName().setText("");
        patientView.getGenderBtnGroup().clearSelection();
        patientView.getTaAddress().setText("");
        patientView.getComboBoxBloodType().setSelectedIndex(0);
        patientView.getTfSearch().setText("");
        patientView.getPatientTable().clearSelection();
        patientView.getTfSearch().setText("");
        patientView.getTfName().requestFocus();
        setBtnIfNotSelected();

        if (patientView.getTfId().getText().isEmpty() || patientView.getTfId().getText().equals("")) {
            patientView.getSaveBtn().setEnabled(false);
        } else {
            patientView.getSaveBtn().setEnabled(true);
        }

        patients = loadPatient();
    }

    private void setBtnIfNotSelected() {
        patientView.getEditBtn().setEnabled(false);
        patientView.getDeleteBtn().setEnabled(false);
        patientView.getTfId().setEnabled(false);
        patientView.getGenerateIdBtn().setEnabled(true);
    }

    private void setBtnIfSelected() {
        patientView.getEditBtn().setEnabled(true);
        patientView.getDeleteBtn().setEnabled(true);
        patientView.getSaveBtn().setEnabled(false);
        patientView.getGenerateIdBtn().setEnabled(false);
    }

    private String getRadioValue() {
        Enumeration<AbstractButton> elements = patientView.getGenderBtnGroup().getElements();
        while (elements.hasMoreElements()) {
            AbstractButton abstractButton = elements.nextElement();
            if (abstractButton.isSelected()) {
                return abstractButton.getText();
            }
        }

        return null;
    }

    private void setSelectedRadio(String value) {
        switch (value) {
            case "M":
                patientView.getMaleRadioBtn().setSelected(true);
                patientView.getGenderBtnGroup().setSelected(patientView.getMaleRadioBtn().getModel(), true);
                break;
            case "F":
                patientView.getFemaleRadioBtn().setSelected(true);
                patientView.getGenderBtnGroup().setSelected(patientView.getFemaleRadioBtn().getModel(), true);
                break;
            default:
                throw new RuntimeException("Radio not match");
        }
    }

    private void setSelectedBloodType(String value) {
        switch (value) {
            case "A":
                patientView.getComboBoxBloodType().setSelectedItem(value);
            case "B":
                patientView.getComboBoxBloodType().setSelectedItem(value);
            case "AB":
                patientView.getComboBoxBloodType().setSelectedItem(value);
            case "O":
                patientView.getComboBoxBloodType().setSelectedItem(value);
                break;
            default:
                throw new RuntimeException("Value not match");
        }
    }

    private class PatientModel extends AbstractTableModel {
        protected final String[] COLUMNS = {"No. Identitas", "Nama Pasien", "Jenis Kelamin", "Alamat", "Golongan Darah"};

        @Override
        public int getRowCount() {
            return patients.size();
        }

        @Override
        public int getColumnCount() {
            return COLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return patients.get(rowIndex).getId();
                case 1:
                    return patients.get(rowIndex).getName();
                case 2:
                    return patients.get(rowIndex).getGender();
                case 3:
                    return patients.get(rowIndex).getAddress();
                case 4:
                    return patients.get(rowIndex).getBloodType();
                default:
                    return "-";
            }
        }

        @Override
        public String getColumnName(int column) {
            return COLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (getValueAt(0, columnIndex) != null) {
                return getValueAt(0, columnIndex).getClass();
            } else {
                return Object.class;
            }
        }
    }

}
