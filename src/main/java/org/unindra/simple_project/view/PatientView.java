package org.unindra.simple_project.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PatientView extends javax.swing.JFrame {

    public JLabel getAddressLabel() {
        return addressLabel;
    }

    public void setAddressLabel(JLabel addressLabel) {
        this.addressLabel = addressLabel;
    }

    public JLabel getBloodTypeLabel() {
        return bloodTypeLabel;
    }

    public void setBloodTypeLabel(JLabel bloodTypeLabel) {
        this.bloodTypeLabel = bloodTypeLabel;
    }

    public JButton getClearBtn() {
        return clearBtn;
    }

    public void setClearBtn(JButton clearBtn) {
        this.clearBtn = clearBtn;
    }

    public JComboBox<String> getComboBoxBloodType() {
        return comboBoxBloodType;
    }

    public void setComboBoxBloodType(JComboBox<String> comboBoxBloodType) {
        this.comboBoxBloodType = comboBoxBloodType;
    }

    public JButton getDeleteBtn() {
        return deleteBtn;
    }

    public void setDeleteBtn(JButton deleteBtn) {
        this.deleteBtn = deleteBtn;
    }

    public JButton getEditBtn() {
        return editBtn;
    }

    public void setEditBtn(JButton editBtn) {
        this.editBtn = editBtn;
    }

    public JButton getExitBtn() {
        return exitBtn;
    }

    public void setExitBtn(JButton exitBtn) {
        this.exitBtn = exitBtn;
    }

    public JRadioButton getFemaleRadioBtn() {
        return femaleRadioBtn;
    }

    public void setFemaleRadioBtn(JRadioButton femaleRadioBtn) {
        this.femaleRadioBtn = femaleRadioBtn;
    }

    public ButtonGroup getGenderBtnGroup() {
        return genderBtnGroup;
    }

    public void setGenderBtnGroup(ButtonGroup genderBtnGroup) {
        this.genderBtnGroup = genderBtnGroup;
    }

    public JLabel getGenderLabel() {
        return genderLabel;
    }

    public void setGenderLabel(JLabel genderLabel) {
        this.genderLabel = genderLabel;
    }

    public JLabel getIdLabel() {
        return idLabel;
    }

    public void setIdLabel(JLabel idLabel) {
        this.idLabel = idLabel;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JRadioButton getMaleRadioBtn() {
        return maleRadioBtn;
    }

    public void setMaleRadioBtn(JRadioButton maleRadioBtn) {
        this.maleRadioBtn = maleRadioBtn;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public JTable getPatientTable() {
        return patientTable;
    }

    public void setPatientTable(JTable patientTable) {
        this.patientTable = patientTable;
    }

    public JButton getSaveBtn() {
        return saveBtn;
    }

    public void setSaveBtn(JButton saveBtn) {
        this.saveBtn = saveBtn;
    }

    public JButton getSearchBtn() {
        return searchBtn;
    }

    public void setSearchBtn(JButton searchBtn) {
        this.searchBtn = searchBtn;
    }

    public JLabel getSearchLabel() {
        return searchLabel;
    }

    public void setSearchLabel(JLabel searchLabel) {
        this.searchLabel = searchLabel;
    }

    public JTextArea getTaAddress() {
        return taAddress;
    }

    public void setTaAddress(JTextArea taAddress) {
        this.taAddress = taAddress;
    }

    public JTextField getTfId() {
        return tfId;
    }

    public void setTfId(JTextField tfId) {
        this.tfId = tfId;
    }

    public JTextField getTfName() {
        return tfName;
    }

    public void setTfName(JTextField tfName) {
        this.tfName = tfName;
    }

    public JTextField getTfSearch() {
        return tfSearch;
    }

    public void setTfSearch(JTextField tfSearch) {
        this.tfSearch = tfSearch;
    }

    public JButton getGenerateIdBtn() {
        return generateIdBtn;
    }

    public void setGenerateIdBtn(JButton generateIdBtn) {
        this.generateIdBtn = generateIdBtn;
    }

    public PatientView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBtnGroup = new ButtonGroup();
        idLabel = new JLabel();
        nameLabel = new JLabel();
        genderLabel = new JLabel();
        addressLabel = new JLabel();
        bloodTypeLabel = new JLabel();
        tfId = new JTextField();
        tfName = new JTextField();
        comboBoxBloodType = new JComboBox<>();
        saveBtn = new JButton();
        editBtn = new JButton();
        deleteBtn = new JButton();
        clearBtn = new JButton();
        exitBtn = new JButton();
        maleRadioBtn = new JRadioButton();
        femaleRadioBtn = new JRadioButton();
        searchLabel = new JLabel();
        tfSearch = new JTextField();
        searchBtn = new JButton();
        generateIdBtn = new JButton();
        jScrollPane1 = new JScrollPane();
        taAddress = new JTextArea();
        jScrollPane3 = new JScrollPane();
        patientTable = new JTable();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800, 800));
        setPreferredSize(new Dimension(800, 800));
        setSize(new Dimension(800, 800));

        idLabel.setFont(new Font("Helvetica Neue", 0, 14)); // NOI18N
        idLabel.setText("No. Identitas");

        nameLabel.setFont(new Font("Helvetica Neue", 0, 14)); // NOI18N
        nameLabel.setText("Nama Pasien");

        genderLabel.setFont(new Font("Helvetica Neue", 0, 14)); // NOI18N
        genderLabel.setText("Jenis Kelamin");

        addressLabel.setFont(new Font("Helvetica Neue", 0, 14)); // NOI18N
        addressLabel.setText("Alamat");

        bloodTypeLabel.setFont(new Font("Helvetica Neue", 0, 14)); // NOI18N
        bloodTypeLabel.setText("Golongan Darah");

        comboBoxBloodType.setModel(new DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O" }));

        saveBtn.setText("Save");

        editBtn.setText("Edit");

        deleteBtn.setText("Delete");

        clearBtn.setText("Clear");

        exitBtn.setText("Exit");

        genderBtnGroup.add(maleRadioBtn);
        maleRadioBtn.setText("M");

        genderBtnGroup.add(femaleRadioBtn);
        femaleRadioBtn.setText("F");

        searchLabel.setFont(new Font("Helvetica Neue", 0, 14)); // NOI18N
        searchLabel.setText("Kata Kunci Pencarian");

        searchBtn.setText("Cari");

        generateIdBtn.setText("Generate Id");

        taAddress.setColumns(20);
        taAddress.setRows(5);
        jScrollPane1.setViewportView(taAddress);

        patientTable.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Identitas", "Nama", "Jenis Kelamin", "Alamat", "Golongan Darah"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(patientTable);

        jLabel1.setFont(new Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Form Data Pasien");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(idLabel)
                                            .addComponent(nameLabel)
                                            .addComponent(genderLabel)
                                            .addComponent(addressLabel)
                                            .addComponent(bloodTypeLabel))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(comboBoxBloodType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING)
                                                .addComponent(tfName, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                                                .addComponent(tfId)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(maleRadioBtn)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(femaleRadioBtn)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(saveBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(editBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(clearBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(searchLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfSearch, GroupLayout.PREFERRED_SIZE, 453, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(generateIdBtn, GroupLayout.Alignment.TRAILING)
                                    .addComponent(searchBtn, GroupLayout.Alignment.TRAILING)
                                    .addComponent(exitBtn, GroupLayout.Alignment.TRAILING))))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(tfId, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel)
                    .addComponent(generateIdBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(tfName, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadioBtn)
                    .addComponent(femaleRadioBtn))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodTypeLabel)
                    .addComponent(comboBoxBloodType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLabel)
                    .addComponent(tfSearch, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel addressLabel;
    private JLabel bloodTypeLabel;
    private JButton clearBtn;
    private JComboBox<String> comboBoxBloodType;
    private JButton deleteBtn;
    private JButton editBtn;
    private JButton exitBtn;
    private JRadioButton femaleRadioBtn;
    private ButtonGroup genderBtnGroup;
    private JLabel genderLabel;
    private JButton generateIdBtn;
    private JLabel idLabel;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JRadioButton maleRadioBtn;
    private JLabel nameLabel;
    private JTable patientTable;
    private JButton saveBtn;
    private JButton searchBtn;
    private JLabel searchLabel;
    private JTextArea taAddress;
    private JTextField tfId;
    private JTextField tfName;
    private JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
