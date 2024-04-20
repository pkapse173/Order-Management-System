/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliveryPartner;

import order.order;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class deliveryPartner {
    
    private String name;
    private int deliveryPartnerID;
    private String username;
    private String password;
    private ArrayList<order> completedOrders;
    private ArrayList<order> pendingOrders;
    private double revenue = 0;
    private double percentShare;
    
    private static int count = 0;
    
    public deliveryPartner(){
        count++;
        deliveryPartnerID = count;
        this.completedOrders = new ArrayList<order>();
        this.pendingOrders = new ArrayList<order>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeliveryPartnerID() {
        return deliveryPartnerID;
    }

    public void setDeliveryPartnerID(int deliveryPartnerID) {
        this.deliveryPartnerID = deliveryPartnerID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<order> getCompletedOrders() {
        return completedOrders;
    }

    public void setCompletedOrders(ArrayList<order> completedOrders) {
        this.completedOrders = completedOrders;
    }

    public ArrayList<order> getPendingOrders() {
        return pendingOrders;
    }

    public void setPendingOrders(ArrayList<order> pendingOrders) {
        this.pendingOrders = pendingOrders;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    

    public double getPercentShare() {
        return percentShare;
    }

    public void setPercentShare(double percentShare) {
        this.percentShare = percentShare;
    }
    
    public void addPendingOrder(order Order){
        this.pendingOrders.add(Order);
    }
    
    public void removePendingOrder(order Order){
        this.pendingOrders.remove(Order);
    }
    
    public void addCompletedOrder(order Order){
        this.completedOrders.add(Order);
        this.pendingOrders.remove(Order);
    }

    
}
