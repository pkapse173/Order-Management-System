/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminUI;

import enterprise.enterprise;
import enterprise.enterpriseDirectory;
import java.awt.CardLayout;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pranavkapse
 */
public class AddEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddEnterpriseJPanel
     */
    JPanel CardContainer;
    enterpriseDirectory enterpriseList;
    
    public AddEnterpriseJPanel(JPanel CardContainer, enterpriseDirectory enterpriseList) {
        initComponents();
        this.CardContainer = CardContainer;
        this.enterpriseList = enterpriseList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEnterpriseName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Add New Enterprise");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Enterprise Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 36));

        txtEnterpriseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterpriseNameActionPerformed(evt);
            }
        });
        add(txtEnterpriseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 160, 46));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 160, 46));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Username:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 36));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 170, 46));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Password:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, 36));

        btnAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, 36));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/left-arrow (2).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 32, 102, 45));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Email:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 170, 40));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("Address:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 170, 40));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("Phone Number:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 160, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminUI/admin.jpg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 0, 1550, 1250));
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnterpriseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterpriseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterpriseNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardContainer.remove(this);
        CardLayout layout = (CardLayout) CardContainer.getLayout();
        layout.previous(CardContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String enterpriseName = txtEnterpriseName.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        // Check if any of the fields are empty
        if (enterpriseName.isEmpty() || username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }

        // Check if the username is unique
        if (!enterpriseList.isEnterpriseUsernameUnique(enterpriseName)) {
        JOptionPane.showMessageDialog(null, "This username already exists");
        return;
        }
        
        password = hashedPassword(password);

        enterprise newEnterprise = enterpriseList.addEnterprise();
        newEnterprise.setName(enterpriseName);
        newEnterprise.setUsername(username);
        newEnterprise.setPassword(password);
        newEnterprise.setAddress(txtAddress.getText());
        newEnterprise.setEmail(txtEmail.getText());
        
        try{
            Integer.parseInt(txtPhoneNo.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please enter valid phone number");
            return;
        }
       
        newEnterprise.setPhoneNumber(txtPhoneNo.getText());

        JOptionPane.showMessageDialog(this, "Enterprise added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

        txtEnterpriseName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtAddress.setText("");
        txtPhoneNo.setText("");
        txtEmail.setText("");
        
    }//GEN-LAST:event_btnAddActionPerformed

    private String hashedPassword(String password) {
        try {
 
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(password.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }

        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnterpriseName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}


