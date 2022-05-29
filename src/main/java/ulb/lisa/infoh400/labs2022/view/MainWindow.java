/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulb.lisa.infoh400.labs2022.view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ulb.lisa.infoh400.labs2022.controller.DoctorJpaController;
import ulb.lisa.infoh400.labs2022.controller.PatientJpaController;
import ulb.lisa.infoh400.labs2022.controller.exceptions.IllegalOrphanException;
import ulb.lisa.infoh400.labs2022.controller.exceptions.NonexistentEntityException;
import ulb.lisa.infoh400.labs2022.model.Doctor;
import ulb.lisa.infoh400.labs2022.model.Patient;

/**
 *
 * @author Adrien Foucart
 */
public class MainWindow extends javax.swing.JFrame {
    
    private final EntityManagerFactory emfac = Persistence.createEntityManagerFactory("infoh400_PU");
    private final PatientJpaController patientCtrl = new PatientJpaController(emfac);
    private final DoctorJpaController doctorCtrl = new DoctorJpaController(emfac);
    
    private static final Logger LOGGER = LogManager.getLogger(MainWindow.class.getName());
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        LOGGER.info("Displaying main window");
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

        doctorTextLabel1 = new javax.swing.JLabel();
        doctorImageLabel1 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        patientImageLabel = new javax.swing.JLabel();
        patientTextLabel = new javax.swing.JLabel();
        doctorTextLabel = new javax.swing.JLabel();
        doctorImageLabel = new javax.swing.JLabel();
        logInPatientButton = new javax.swing.JButton();
        registerPatientButton = new javax.swing.JButton();
        logInDoctorButton = new javax.swing.JButton();
        registerDoctorButton = new javax.swing.JButton();
        emergencyButton = new javax.swing.JButton();

        doctorTextLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctorTextLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctorTextLabel1.setText("Doctors");

        doctorImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/noun_Doctor_575955.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        titleLabel.setBackground(new java.awt.Color(0, 0, 153));
        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("    Health Information System");
        titleLabel.setOpaque(true);

        patientImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/noun_Patient_287071.png"))); // NOI18N

        patientTextLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patientTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientTextLabel.setText("Patients");

        doctorTextLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctorTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctorTextLabel.setText("Doctors");

        doctorImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/noun_Doctor_575955.png"))); // NOI18N

        logInPatientButton.setText("Log in");
        logInPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInPatientButtonActionPerformed(evt);
            }
        });

        registerPatientButton.setText("Register");
        registerPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPatientButtonActionPerformed(evt);
            }
        });

        logInDoctorButton.setText("Log in");
        logInDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInDoctorButtonActionPerformed(evt);
            }
        });

        registerDoctorButton.setText("Register");
        registerDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerDoctorButtonActionPerformed(evt);
            }
        });

        emergencyButton.setText("Emergency");
        emergencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emergencyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(logInPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patientTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patientImageLabel))
                            .addComponent(registerPatientButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(doctorImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(doctorTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(logInDoctorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registerDoctorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(patientTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patientImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(doctorTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doctorImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logInDoctorButton)
                    .addComponent(logInPatientButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerPatientButton)
                    .addComponent(registerDoctorButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emergencyButton)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInPatientButtonActionPerformed
        LoginWindow loginPopup = new LoginWindow();
        loginPopup.setVisible(true);
    }//GEN-LAST:event_logInPatientButtonActionPerformed

    private void registerPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPatientButtonActionPerformed
        AddPatientWindow patientAddPopup = new AddPatientWindow();
        patientAddPopup.setVisible(true);
    }//GEN-LAST:event_registerPatientButtonActionPerformed

    private void registerDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerDoctorButtonActionPerformed
        AddDoctorWindow doctorAddPopup = new AddDoctorWindow();
        doctorAddPopup.setVisible(true);
    }//GEN-LAST:event_registerDoctorButtonActionPerformed

    private void logInDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInDoctorButtonActionPerformed
        LoginWindow loginPopup = new LoginWindow();
        loginPopup.setVisible(true);
    }//GEN-LAST:event_logInDoctorButtonActionPerformed

    private void emergencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyButtonActionPerformed
        EmergencyWindow emergencyPopup = new EmergencyWindow();
        emergencyPopup.setVisible(true);
    }//GEN-LAST:event_emergencyButtonActionPerformed

 
           
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        LOGGER.info("Displaying main window");
                
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel doctorImageLabel;
    private javax.swing.JLabel doctorImageLabel1;
    private javax.swing.JLabel doctorTextLabel;
    private javax.swing.JLabel doctorTextLabel1;
    private javax.swing.JButton emergencyButton;
    private javax.swing.JButton logInDoctorButton;
    private javax.swing.JButton logInPatientButton;
    private javax.swing.JLabel patientImageLabel;
    private javax.swing.JLabel patientTextLabel;
    private javax.swing.JButton registerDoctorButton;
    private javax.swing.JButton registerPatientButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}