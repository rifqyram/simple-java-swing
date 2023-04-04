/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.unindra.simple_project.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import org.unindra.simple_project.swing.ImagePanel;

/**
 *
 * @author user
 */
public class GradingFormView extends javax.swing.JFrame {

    /**
     * Creates new form GradingFormView
     */
    public GradingFormView() {
        initComponents();
        clearResult();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formPanel = new JPanel();
        taskGradeLabel = new JLabel();
        midtermGradeLabel = new JLabel();
        examGradeLabel = new JLabel();
        tfTaskGrade = new JTextField();
        tfMidtermGrade = new JTextField();
        tfExamGrade = new JTextField();
        calcBtn = new JButton();
        clearBtn = new JButton();
        jPanel1 = new JPanel();
        resultValueLabel = new JLabel();
        resultGradeLabel = new JLabel();
        imageResult = new ImagePanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(640, 480));
        setPreferredSize(new Dimension(640, 480));
        setSize(new Dimension(640, 480));
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        taskGradeLabel.setText("Nilai Tugas");

        midtermGradeLabel.setText("Nilai UTS");

        examGradeLabel.setText("Nilai UAS");

        tfTaskGrade.setText("0");

        tfMidtermGrade.setText("0");

        tfExamGrade.setText("0");

        calcBtn.setText("Hitung Nilai");
        calcBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calcBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        GroupLayout formPanelLayout = new GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(formPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(formPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(taskGradeLabel)
                    .addComponent(midtermGradeLabel)
                    .addComponent(examGradeLabel)
                    .addComponent(calcBtn))
                .addGap(20, 20, 20)
                .addGroup(formPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(clearBtn)
                    .addComponent(tfExamGrade, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMidtermGrade, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTaskGrade, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formPanelLayout.setVerticalGroup(formPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(formPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(taskGradeLabel)
                    .addComponent(tfTaskGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(midtermGradeLabel)
                    .addComponent(tfMidtermGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(examGradeLabel)
                    .addComponent(tfExamGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(formPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(calcBtn)
                    .addComponent(clearBtn))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        resultValueLabel.setText("Nilai: 0.0");

        resultGradeLabel.setText("Grade: S");

        imageResult.setImage("/images/happy.png");

        GroupLayout imageResultLayout = new GroupLayout(imageResult);
        imageResult.setLayout(imageResultLayout);
        imageResultLayout.setHorizontalGroup(imageResultLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imageResultLayout.setVerticalGroup(imageResultLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(resultValueLabel)
                            .addComponent(resultGradeLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(imageResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(resultValueLabel)
                .addGap(28, 28, 28)
                .addComponent(resultGradeLabel)
                .addGap(18, 18, 18)
                .addComponent(imageResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(formPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(formPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_calcBtnActionPerformed
        calculateGrade();
    }//GEN-LAST:event_calcBtnActionPerformed

    private void clearBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearForm();
        clearResult();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void formKeyPressed(KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfTaskGrade.requestFocus();
        }
    }//GEN-LAST:event_formKeyPressed

    private void clearResult() {
        resultValueLabel.setVisible(false);
        resultGradeLabel.setVisible(false);
        imageResult.setVisible(false);
    }

    private void clearForm() {
        tfTaskGrade.setText("0");
        tfMidtermGrade.setText("0");
        tfExamGrade.setText("0");
    }

    private void calculateGrade() {
        int task = Integer.parseInt(tfTaskGrade.getText());
        int midterm = Integer.parseInt(tfMidtermGrade.getText());
        int finalExam = Integer.parseInt(tfExamGrade.getText());

        double result = 0.2 * task + 0.3 * midterm + 0.5 * finalExam;
        setGrade(result);
    }
    
    private void setGrade(double result) {
        resultValueLabel.setText("Nilai : " + result);

        String passedImageSource = "/images/happy.png";
        String failedImageSource = "/images/shocked.jpeg";

        resultValueLabel.setVisible(true);
        resultGradeLabel.setVisible(true);
        imageResult.setVisible(true);

        if (result > 88) {
            resultGradeLabel.setText("Grade A");
            imageResult.setImage(passedImageSource);
        } else if (result > 74) {
            resultGradeLabel.setText("Grade B");
            imageResult.setImage(passedImageSource);
        } else if (result > 56) {
            resultGradeLabel.setText("Grade C");
            imageResult.setImage(passedImageSource);
        } else if (result > 45) {
            resultGradeLabel.setText("Grade D");
            imageResult.setImage(failedImageSource);
        } else {
            resultGradeLabel.setText("Grade E");
            imageResult.setImage(failedImageSource);
        }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GradingFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradingFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradingFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradingFormView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GradingFormView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton calcBtn;
    private JButton clearBtn;
    private JLabel examGradeLabel;
    private JPanel formPanel;
    private ImagePanel imageResult;
    private JPanel jPanel1;
    private JLabel midtermGradeLabel;
    private JLabel resultGradeLabel;
    private JLabel resultValueLabel;
    private JLabel taskGradeLabel;
    private JTextField tfExamGrade;
    private JTextField tfMidtermGrade;
    private JTextField tfTaskGrade;
    // End of variables declaration//GEN-END:variables

    
}