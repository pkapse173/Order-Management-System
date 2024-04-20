/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class orderDirectory {
    
    private ArrayList<order> orderList;
    
    public orderDirectory(){
        this.orderList = new ArrayList<order>();
    }

    public ArrayList<order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<order> orderList) {
        this.orderList = orderList;
    }
    
    public order addOrder(){
        order newOrder = new order();
        orderList.add(newOrder);
        return newOrder;
    }
    
}
