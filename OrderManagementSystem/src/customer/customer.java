/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

import order.order;
import java.util.ArrayList;
import java.util.HashMap;
import product.product;

/**
 *
 * @author User
 */
public class customer {
    
    private String name;
    private int customerID;
    private String emailID;
    private String phonenumber;
    private String address;
    private String username;
    private String password;
    private ArrayList<order> completedOrders;
    private ArrayList<order> pendingOrders;
    private order currentOrder;
    
    private static int count = 0;
    
    public customer(){
        count++;
        customerID = count;
        this.completedOrders = new ArrayList<order>();
        this.pendingOrders = new ArrayList<order>();
        currentOrder = new order();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public order getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(order currentOrder) {
        this.currentOrder = currentOrder;
    }
    
    public void addToCompletedOrders(order Order){
        this.completedOrders.add(Order);
        this.pendingOrders.remove(Order);
    }
    
    public void addToPendingOrders(order Order){
        this.pendingOrders.add(Order);
    }
    
    public void removeFromPendingOrders(order Order){
        this.pendingOrders.remove(Order);
    }
    
    public void addProductToCurrentOrder(product Product, int Quantity){
        this.currentOrder.getOrderProductMap().put(Product, Quantity);
    }
    
    public int calculateCustomerRevenue(customer c){
        int revenue = 0;
        for (order Order : c.getCompletedOrders()){  
            if(Order.getStatus().equals("Rejected")){
                continue;
            }else{
                revenue += Order.calculateOrderTotal(Order);
            } 
        }
        return revenue;
    }
    
    
}
