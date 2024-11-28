/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CarServiceAppointmentManagementSystem;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PaymentGUI extends javax.swing.JFrame {

    double interimCharge = 223.60;
    double majorCharge = 983.98;
    double fullCharge = 550.75;
    String totalTimeServices = "5 hours";
    double SSTCharge = 0.06;
    double currentMilleage = 25000;
    String typepayment;
    /**
     * Creates new form Payment
     */
    private Component frame;

    public PaymentGUI() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblType = new javax.swing.JLabel();
        lblMethod = new javax.swing.JLabel();
        rdCash = new javax.swing.JRadioButton();
        rdDebit = new javax.swing.JRadioButton();
        rdCredit = new javax.swing.JRadioButton();
        btnDisplay = new javax.swing.JButton();
        btnFull = new javax.swing.JButton();
        btnMajor = new javax.swing.JButton();
        btnInterim = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Service Appointment Management System - Payment Details");

        jPanel1.setLayout(null);

        lblType.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblType.setText("Type Of Service:");
        jPanel1.add(lblType);
        lblType.setBounds(260, 170, 170, 22);

        lblMethod.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblMethod.setText("Payment Method:");
        jPanel1.add(lblMethod);
        lblMethod.setBounds(260, 90, 170, 22);

        buttonGroup1.add(rdCash);
        rdCash.setText("CASH");
        jPanel1.add(rdCash);
        rdCash.setBounds(120, 130, 64, 20);

        buttonGroup1.add(rdDebit);
        rdDebit.setText("DEBIT");
        jPanel1.add(rdDebit);
        rdDebit.setBounds(310, 130, 60, 20);

        buttonGroup1.add(rdCredit);
        rdCredit.setText("CREDIT");
        jPanel1.add(rdCredit);
        rdCredit.setBounds(470, 130, 70, 20);

        btnDisplay.setText("MAIN MENU");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        jPanel1.add(btnDisplay);
        btnDisplay.setBounds(550, 460, 100, 22);

        btnFull.setText("Full  Car Service");
        btnFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFullActionPerformed(evt);
            }
        });
        jPanel1.add(btnFull);
        btnFull.setBounds(280, 210, 120, 22);

        btnMajor.setText("Major Car Service");
        btnMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMajorActionPerformed(evt);
            }
        });
        jPanel1.add(btnMajor);
        btnMajor.setBounds(430, 210, 140, 22);

        btnInterim.setText("Interim Car Service");
        btnInterim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterimActionPerformed(evt);
            }
        });
        jPanel1.add(btnInterim);
        btnInterim.setBounds(100, 210, 140, 22);

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);
        btnExit.setBounds(550, 490, 100, 22);

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset);
        btnReset.setBounds(100, 370, 72, 22);

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 240, 473, 120);

        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue modern car rent banner (1066 × 110px) (659 × 553px).png"))); // NOI18N
        jPanel1.add(bgImage);
        bgImage.setBounds(0, 0, 660, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtOutput.setText(null);

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // TODO add your handling code here:
        MainPage mp = new MainPage();
        mp.show();

        dispose();
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(frame, "Do you want to exit?", "Are you sure?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnInterimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterimActionPerformed
        // TODO add your handling code here:
        if (rdCash.isSelected()) {
            typepayment = "Cash";
        }
        if (rdDebit.isSelected()) {
            typepayment = "Debit";
        }
        if (rdCredit.isSelected()) {
            typepayment = "Credit";
        }
        InterimService i = new InterimService(interimCharge,typepayment, totalTimeServices,  SSTCharge,  currentMilleage);
        txtOutput.setText(i.printInterimCharge());
    }//GEN-LAST:event_btnInterimActionPerformed

    private void btnFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFullActionPerformed
        // TODO add your handling code here:       
        if (rdCash.isSelected()) {
            typepayment = "Cash";
        }
        if (rdDebit.isSelected()) {
            typepayment = "Debit";
        }
        if (rdCredit.isSelected()) {
            typepayment = "Credit";
        }
        FullService f = new FullService(fullCharge,typepayment, totalTimeServices,  SSTCharge,  currentMilleage);
        txtOutput.setText(f.printFullCharge());
    }//GEN-LAST:event_btnFullActionPerformed

    private void btnMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMajorActionPerformed
        // TODO add your handling code here:

        if (rdCash.isSelected()) {
            typepayment = "Cash";
        }
        if (rdDebit.isSelected()) {
            typepayment = "Debit";
        }
        if (rdCredit.isSelected()) {
            typepayment = "Credit";
        }
        
        MajorService m = new MajorService(majorCharge,typepayment, totalTimeServices,  SSTCharge,  currentMilleage);
        txtOutput.setText(m.printMajorCharge());
    }//GEN-LAST:event_btnMajorActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFull;
    private javax.swing.JButton btnInterim;
    private javax.swing.JButton btnMajor;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMethod;
    private javax.swing.JLabel lblType;
    private javax.swing.JRadioButton rdCash;
    private javax.swing.JRadioButton rdCredit;
    private javax.swing.JRadioButton rdDebit;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
