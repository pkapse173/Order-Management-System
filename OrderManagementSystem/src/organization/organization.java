/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import enterprise.enterprise;
import java.util.ArrayList;
import java.util.HashMap;
import order.order;
import product.product;

/**
 *
 * @author User
 */
public class organization {
    
    private String name;
    private int organizationID;
    private String emailID;
    private String phonenumber;
    private String address;
    private String username;
    private String password;
    private ArrayList<order> completedOrders;
    private ArrayList<order> pendingOrders;
    private ArrayList<product> organizationProducts;
    //private ArrayList<organization> organizationList;
    private enterprise enterpriseProfile;

 
    
    private static int count = 0;
    
    public organization(){
        count++;
        organizationID = count;
        this.completedOrders = new ArrayList<order>();
        this.pendingOrders = new ArrayList<order>();
        this.organizationProducts = new ArrayList<product>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
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
    
    public ArrayList<product> getOrganizationProducts() {
        return organizationProducts;
    }
    
    public void setOrganizationProducts(ArrayList<product> organizationProducts) {
        this.organizationProducts = organizationProducts;
    }

    public enterprise getEnterpriseProfile() {
        return enterpriseProfile;
    }

    public void setEnterpriseProfile(enterprise enterpriseProfile) {
        this.enterpriseProfile = enterpriseProfile;
    }
    
    
    
    
 
    public void addProductToOrganization(product Product){
        this.organizationProducts.add(Product);
    }
    
    public void removeProductFromOrganization(product Product){
        this.organizationProducts.remove(Product);
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
    
    public int calculateOrganizationRevenue(organization org){
        int revenue = 0;
        for (order Order : org.getCompletedOrders()){
            if(Order.getStatus().equals("Rejected")){
                continue;
            }else{
                revenue += Order.calculateOrderTotal(Order);
            }            
        }
        return revenue;
    }
    
    
    
}
