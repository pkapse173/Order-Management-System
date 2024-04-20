/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminUI;

import deliveryPartner.deliveryPartner;
import deliveryPartner.deliveryPartnerDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kaush
 */
public class AdminmanagedeliveryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminmanagedeliveryJPanel
     */
    JPanel CardContainer;
    deliveryPartnerDirectory deliveryPartnerList;
    
    public AdminmanagedeliveryJPanel(JPanel CardContainer, deliveryPartnerDirectory deliveryPartnerList) {
        initComponents();
        this.CardContainer = CardContainer;
        this.deliveryPartnerList = deliveryPartnerList;
        
        populateDeliveryPartnerTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryPartners = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemove.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRemove.setText("Remove ");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 100, 40));

        tblDeliveryPartners.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Delivery Partner Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDeliveryPartners);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 145, -1, 180));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Delivery Partners");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 688, 45));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/left-arrow (2).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminUI/admin.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -3, 1440, 1020));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblDeliveryPartners.getSelectedRow();
        deliveryPartner selectedDeliveryPartner = null;
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select delivery partner");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblDeliveryPartners.getModel();
        int deliveryPartnerID = (int) model.getValueAt(selectedRowIndex, 0);
        
        for (deliveryPartner dp : deliveryPartnerList.getDeliveryPartnerList()){
            if (dp.getDeliveryPartnerID() == deliveryPartnerID){
                selectedDeliveryPartner = dp;
                break;
            }
        }
        
        if (selectedDeliveryPartner.getPendingOrders().size() > 0){
            JOptionPane.showMessageDialog(this, "This delivery partner has some pending orders");
            return;
        }
        
        deliveryPartnerList.removeDeliveryPartner(selectedDeliveryPartner);
        
        JOptionPane.showMessageDialog(this, "Delivery partner deleted");
        
        populateDeliveryPartnerTable();
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardContainer.remove(this);
        CardLayout layout = (CardLayout) CardContainer.getLayout();
        layout.previous(CardContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeliveryPartners;
    // End of variables declaration//GEN-END:variables

    private void populateDeliveryPartnerTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblDeliveryPartners.getModel();
        model.setRowCount(0);

        for (deliveryPartner dp : deliveryPartnerList.getDeliveryPartnerList()){
            Object[] row = new Object[2];
            row[0] = dp.getDeliveryPartnerID();
            row[1] = dp.getName();
            
            model.addRow(row);
            
        }
    }
}
