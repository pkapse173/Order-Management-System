/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package OrganizationUI;


import customer.customer;
import deliveryPartner.deliveryPartnerDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import order.order;
import organization.organization;
import product.product;

/**
 *
 * @author pranavkapse
 */
public class ViewPendingOrdersFirstJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewStudentRequestJPanel
     */
    
    JPanel CardContainer;
    organization userOrganization;
    deliveryPartnerDirectory deliveryPartnerList;
    
    public ViewPendingOrdersFirstJPanel(JPanel CardContainer, organization userOrganization, deliveryPartnerDirectory deliveryPartnerList) {
        initComponents();
        this.CardContainer = CardContainer;
        this.userOrganization = userOrganization;
        this.deliveryPartnerList = deliveryPartnerList;
        populatePendingOrders();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        previousOrdersPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPreviousOrders = new javax.swing.JTable();
        btnViewOrder = new javax.swing.JButton();
        btnDeclineOrder = new javax.swing.JButton();
        btnBackcourse = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        previousOrdersPanel.setBackground(new java.awt.Color(255, 255, 255));
        previousOrdersPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPreviousOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer Name", "Order ID", "Order Status"
            }
        ));
        jScrollPane1.setViewportView(tblPreviousOrders);
        if (tblPreviousOrders.getColumnModel().getColumnCount() > 0) {
            tblPreviousOrders.getColumnModel().getColumn(0).setResizable(false);
            tblPreviousOrders.getColumnModel().getColumn(1).setResizable(false);
        }

        previousOrdersPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 630, 260));

        btnViewOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewOrder.setText("View Order");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });
        previousOrdersPanel.add(btnViewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 140, 31));

        btnDeclineOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeclineOrder.setText("Decline Order");
        btnDeclineOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineOrderActionPerformed(evt);
            }
        });
        previousOrdersPanel.add(btnDeclineOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, 31));

        btnBackcourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/left-arrow (2).png"))); // NOI18N
        btnBackcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackcourseActionPerformed(evt);
            }
        });
        previousOrdersPanel.add(btnBackcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 40));

        btnRefresh.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        previousOrdersPanel.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OrganizationUI/org.png"))); // NOI18N
        previousOrdersPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -230, 1450, 1370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(previousOrdersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(previousOrdersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblPreviousOrders.getSelectedRow();
        order selectedOrder = null;
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the order");
            return;
        }
        
        ArrayList<order> pendingOrderList = userOrganization.getPendingOrders();
        
        DefaultTableModel model = (DefaultTableModel) tblPreviousOrders.getModel();
        int orderID = (int) model.getValueAt(selectedRowIndex, 1);
        
        for (order Order : pendingOrderList){
            if (Order.getOrderID() == orderID){
                selectedOrder = Order;
                break;
                }
        }
        
        ViewPendingOrdersJPanel viewPendingOrdersJPanel = new ViewPendingOrdersJPanel(CardContainer, userOrganization, selectedOrder, deliveryPartnerList);
        CardContainer.add("ViewPendingOrdersJPanel", viewPendingOrdersJPanel);
        CardLayout layout = (CardLayout) CardContainer.getLayout();
        layout.next(CardContainer);
  
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnDeclineOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineOrderActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblPreviousOrders.getSelectedRow();
        order selectedOrder = null;
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select the order");
            return;
        }
        
        ArrayList<order> pendingOrderList = userOrganization.getPendingOrders();
        
        DefaultTableModel model = (DefaultTableModel) tblPreviousOrders.getModel();
        int orderID = (int) model.getValueAt(selectedRowIndex, 1);
        
        for (order Order : pendingOrderList){
            if (Order.getOrderID() == orderID){
                selectedOrder = Order;
                break;
                }
        }
        
        selectedOrder.setStatus("Rejected");
        
        //juserOrganization.removePendingOrder(selectedOrder);
        userOrganization.addCompletedOrder(selectedOrder);
        
        customer customerProfile = selectedOrder.getCustomerProfile();
        //customerProfile.removeFromPendingOrders(selectedOrder);
        customerProfile.addToCompletedOrders(selectedOrder);
        
        for (product Product : selectedOrder.getOrderProductMap().keySet()){
            Product.setAvailibility(Product.getAvailibility() + selectedOrder.getOrderProductMap().get(Product));
        }
        
        JOptionPane.showMessageDialog(this, "Order rejected");
        
        populatePendingOrders();
        
    }//GEN-LAST:event_btnDeclineOrderActionPerformed

    private void btnBackcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackcourseActionPerformed
        // TODO add your handling code here:
        CardContainer.remove(this);
        CardLayout layout = (CardLayout) CardContainer.getLayout();
        layout.previous(CardContainer);

    }//GEN-LAST:event_btnBackcourseActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populatePendingOrders();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackcourse;
    private javax.swing.JButton btnDeclineOrder;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel previousOrdersPanel;
    private javax.swing.JTable tblPreviousOrders;
    // End of variables declaration//GEN-END:variables

    private void populatePendingOrders() {
        
        DefaultTableModel model = (DefaultTableModel) tblPreviousOrders.getModel();
        model.setRowCount(0);
        
        ArrayList<order> pendingOrderList = userOrganization.getPendingOrders();
        
        for (order Order : pendingOrderList){
            Object[] row = new Object[3];
            row[0] = Order.getCustomerProfile().getName();
            row[1] = Order.getOrderID();
            row[2] = Order.getStatus();
            
            model.addRow(row);
            
        }
       
    }
        
}
