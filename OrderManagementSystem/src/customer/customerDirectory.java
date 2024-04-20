/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class customerDirectory {
    
    private ArrayList<customer> customerList;
    
    public customerDirectory(){
        this.customerList = new ArrayList<customer>();
    }

    public ArrayList<customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<customer> customerList) {
        this.customerList = customerList;
    }
    
    public customer addCustomer(){
        customer newCustomer = new customer();
        customerList.add(newCustomer);
        return newCustomer;
    }
    
    public boolean isCustomerUsernameUnique(String enteredUsername){
        
        for (customer Customer : customerList){
            String username = Customer.getUsername();
            if (username.equals(enteredUsername)){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isCustomerIDUnique(int enteredID){
        
        for (customer Customer : customerList){
            int ID = Customer.getCustomerID();
            if (ID == (enteredID)){
                return false;
            }
        }
        
        return true;
    }
    
}
