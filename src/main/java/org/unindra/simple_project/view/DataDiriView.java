/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.unindra.simple_project.view;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * @author user
 */
public class DataDiriView extends javax.swing.JFrame {

    /**
     * Creates new form DataDiriView
     */
    public DataDiriView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new ButtonGroup();
        nameLabel = new JLabel();
        genderLabel = new JLabel();
        addressLabel = new JLabel();
        statusLabel = new JLabel();
        tfName = new JTextField();
        genderMaleRadio = new JRadioButton();
        genderFemaleRadio = new JRadioButton();
        tfAddress = new JTextField();
        statusComboBox = new JComboBox<>();
        printBtn = new JButton();
        cancelBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Data Diri");

        nameLabel.setFont(new Font("Helvetica Neue", 1, 13)); // NOI18N
        nameLabel.setForeground(new Color(49, 53, 59));
        nameLabel.setText("Nama");

        genderLabel.setFont(new Font("Helvetica Neue", 1, 13)); // NOI18N
        genderLabel.setForeground(new Color(49, 53, 59));
        genderLabel.setText("Jenis Kelamin");

        addressLabel.setFont(new Font("Helvetica Neue", 1, 13)); // NOI18N
        addressLabel.setForeground(new Color(49, 53, 59));
        addressLabel.setText("Alamat");

        statusLabel.setFont(new Font("Helvetica Neue", 1, 13)); // NOI18N
        statusLabel.setForeground(new Color(49, 53, 59));
        statusLabel.setText("Status");

        genderButtonGroup.add(genderMaleRadio);
        genderMaleRadio.setText("Laki-Laki");

        genderButtonGroup.add(genderFemaleRadio);
        genderFemaleRadio.setText("Perempuan");

        statusComboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Menikah", "Belum Menikah"}));

        printBtn.setText("Print");
        printBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(nameLabel)
                                                .addComponent(genderLabel)
                                                .addComponent(addressLabel)
                                                .addComponent(statusLabel))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(genderMaleRadio)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(genderFemaleRadio))
                                                .addComponent(statusComboBox, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfName, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(tfAddress)))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(printBtn)
                                        .addGap(52, 52, 52)
                                        .addComponent(cancelBtn)))
                        .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(nameLabel)
                                .addComponent(tfName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(genderLabel)
                                .addComponent(genderMaleRadio)
                                .addComponent(genderFemaleRadio))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(addressLabel)
                                .addComponent(tfAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(statusLabel)
                                .addComponent(statusComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(printBtn)
                                .addComponent(cancelBtn))
                        .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        String message = getMessage();
        JOptionPane.showMessageDialog(null, message);
        clearForm();
    }//GEN-LAST:event_printBtnActionPerformed

    private String getMessage() {
        String buttonValue = getRadioValue();

        String status = "";
        if (statusComboBox.getSelectedItem() != null) {
            status = statusComboBox.getSelectedItem().toString();
        }
        
        return String.format("Nama Anda: %s\n" +
                        "Jenis Kelamin: %s\n" +
                        "Alamat: %s\n" +
                        "Status: %s\n",
                tfName.getText(),
                buttonValue,
                tfAddress.getText(),
                status
        );
    }

    private void cancelBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        clearForm();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private String getRadioValue() {
        Enumeration<AbstractButton> elements = genderButtonGroup.getElements();
        String buttonValue = "";

        while (elements.hasMoreElements()) {
            AbstractButton abstractButton = elements.nextElement();
            if (abstractButton.isSelected()) {
                buttonValue = abstractButton.getText();
                break;
            }
        }
        return buttonValue;
    }

    private void clearForm() {
        tfName.setText("");
        tfAddress.setText("");
        genderButtonGroup.clearSelection();
        statusComboBox.setSelectedIndex(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            Logger.getLogger(DataDiriView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new DataDiriView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel addressLabel;
    private JButton cancelBtn;
    private ButtonGroup genderButtonGroup;
    private JRadioButton genderFemaleRadio;
    private JLabel genderLabel;
    private JRadioButton genderMaleRadio;
    private JLabel nameLabel;
    private JButton printBtn;
    private JComboBox<String> statusComboBox;
    private JLabel statusLabel;
    private JTextField tfAddress;
    private JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
