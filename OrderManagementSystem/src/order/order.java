/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

import customer.customer;
import deliveryPartner.deliveryPartner;
import enterprise.enterprise;
import java.util.ArrayList;
import java.util.HashMap;
import product.product;
import java.time.LocalDateTime;
import organization.organization;

/**
 *
 * @author User
 */
public class order {
    
    private int orderID;
    private customer customerProfile;
    private organization organizationProfile;
    private enterprise enterpriseProfile;
    private String status;
    private ArrayList<product> orderProductList;
    HashMap<product, Integer> orderProductMap = new HashMap<product, Integer>();
    //private int totalOrderPrice = this.calculateOrderTotal();
    private LocalDateTime deliveryDateTime;
    private deliveryPartner deliveryPartner;
    
    private static int count = 0;
    
    public order(){
        count++;
        orderID = count;
        this.orderProductList = new ArrayList<product>();
    }

    public ArrayList<product> getOrderProductList() {
        return orderProductList;
    }

    public void setOrderProductList(ArrayList<product> orderProductList) {
        this.orderProductList = orderProductList;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public customer getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(customer customerProfile) {
        this.customerProfile = customerProfile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HashMap<product, Integer> getOrderProductMap() {
        return orderProductMap;
    }

    public void setOrderProductMap(HashMap<product, Integer> orderProductMap) {
        this.orderProductMap = orderProductMap;
    }

    /*
    public int getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public void setTotalOrderPrice(int totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }
    */

    public LocalDateTime getDeliveryDateTime() {
        return deliveryDateTime;
    }

    public void setDeliveryDateTime(LocalDateTime deliveryDateTime) {
        this.deliveryDateTime = deliveryDateTime;
    }

    public deliveryPartner getDeliveryPartner() {
        return deliveryPartner;
    }

    public void setDeliveryPartner(deliveryPartner deliveryPartner) {
        this.deliveryPartner = deliveryPartner;
    }

    public organization getOrganizationProfile() {
        return organizationProfile;
    }

    public void setOrganizationProfile(organization organizationProfile) {
        this.organizationProfile = organizationProfile;
    }

    public enterprise getEnterpriseProfile() {
        return enterpriseProfile;
    }

    public void setEnterpriseProfile(enterprise enterpriseProfile) {
        this.enterpriseProfile = enterpriseProfile;
    }
    
    
    
    
    
    
    
    
    
    
    public void addProductToOrder(product Product, int quantity){
        if (orderProductMap.containsKey(Product)){
                orderProductMap.put(Product, orderProductMap.get(Product) + quantity);
            }
            else{
                orderProductMap.put(Product, quantity);
            }
        orderProductList.add(Product);
    }
    
    public void removeProductFromOrder(product Product){
        orderProductMap.remove(Product);
        orderProductList.remove(Product);
    }
    
    public int calculateOrderTotal(order Order){
        int total = 0;
        for (product Product : Order.getOrderProductMap().keySet()){
            total += Product.getPrice() * Order.getOrderProductMap().get(Product);
        }
        return total;
    }
    
}
