/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ulb.lisa.infoh400.labs2022.view;

import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ulb.lisa.infoh400.labs2022.controller.DoctorJpaController;
import ulb.lisa.infoh400.labs2022.controller.PatientJpaController;
import ulb.lisa.infoh400.labs2022.model.Doctor;
import ulb.lisa.infoh400.labs2022.model.Patient;

/**
 *
 * @author renau
 */
public class EmergencyWindow extends javax.swing.JFrame {

    private final EntityManagerFactory emfac = Persistence.createEntityManagerFactory("infoh400_PU");
    private final PatientJpaController patientCtrl = new PatientJpaController(emfac);
    /**
     * Creates new form emergencyWindow
     */
    public EmergencyWindow() {
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

        emergencyWindowLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPatient = new javax.swing.JList<>();
        paitentListLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientTextArea = new javax.swing.JTextArea();
        patientInfoLabel = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        emergencyWindowLabel.setBackground(new java.awt.Color(255, 255, 255));
        emergencyWindowLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emergencyWindowLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emergencyWindowLabel.setText("Emergency");

        listPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPatientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listPatient);

        paitentListLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paitentListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paitentListLabel.setText("Patient List");

        patientTextArea.setColumns(20);
        patientTextArea.setRows(5);
        jScrollPane2.setViewportView(patientTextArea);

        patientInfoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patientInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientInfoLabel.setText("Patient Informations");

        refreshButton.setText("Refresh list");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(emergencyWindowLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(paitentListLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(patientInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(emergencyWindowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paitentListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshButton)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
       refreshPatientList();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void listPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPatientMouseClicked
        String out = "";
        
        if (evt.getClickCount() == 2 && evt.getButton() == MouseEvent.BUTTON1 && listPatient.getSelectedIndex() >= 0) {
            
            EntityListModel model = (EntityListModel) listPatient.getModel();
                
            Patient selected = (Patient) model.getList().get(listPatient.getSelectedIndex());
            
            String phone = selected.getPhonenumber();
            String status = selected.getStatus();
            Integer id = selected.getIdpatient();
            int nbrImage = selected.getImageList().size();
            
            out = "Phone number : " + phone + "\n"
                + "Status : " +status + "\n"
                + "Id patient : " + id.toString() + "\n"
                + "Available image(s) : " + nbrImage + "\n";
            
         }
        patientTextArea.setText(out);
    }//GEN-LAST:event_listPatientMouseClicked
    
    private void refreshPatientList(){
        List patients = patientCtrl.findPatientEntities();
        EntityListModel<Patient> model = new EntityListModel(patients);
        listPatient.setModel(model);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emergencyWindowLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listPatient;
    private javax.swing.JLabel paitentListLabel;
    private javax.swing.JLabel patientInfoLabel;
    private javax.swing.JTextArea patientTextArea;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}
