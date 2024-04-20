/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliveryPartner;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class deliveryPartnerDirectory {
    
    private ArrayList<deliveryPartner> deliveryPartnerList;
    
    public deliveryPartnerDirectory(){
        this.deliveryPartnerList = new ArrayList<deliveryPartner>();
    }

    public ArrayList<deliveryPartner> getDeliveryPartnerList() {
        return deliveryPartnerList;
    }

    public void setDeliveryPartnerList(ArrayList<deliveryPartner> deliveryPartnerList) {
        this.deliveryPartnerList = deliveryPartnerList;
    }
    
    public deliveryPartner addDeliveryPartner(){
        deliveryPartner newDeliveryPartner = new deliveryPartner();
        deliveryPartnerList.add(newDeliveryPartner);
        return newDeliveryPartner;
    }
    
    public void removeDeliveryPartner(deliveryPartner DeliveryPartner){
        this.deliveryPartnerList.remove(DeliveryPartner);
    }
    
    public boolean isDeliveryPartnerUsernameUnique(String enteredUsername){
        
        for (deliveryPartner DeliveryPartner : deliveryPartnerList){
            String username = DeliveryPartner.getUsername();
            if (username.equals(enteredUsername)){
                return false;
            }
        }
        
        return true;
    }
}
