/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class enterpriseDirectory {
    
    private ArrayList<enterprise> enterpriseList;
    
    public enterpriseDirectory(){
        this.enterpriseList = new ArrayList<enterprise>();
    }

    public ArrayList<enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    
    public enterprise addEnterprise(){
        enterprise newEnterprise = new enterprise();
        enterpriseList.add(newEnterprise);
        return newEnterprise;
    }
    
    public boolean isEnterpriseUsernameUnique(String enteredUsername){
        
        for (enterprise Enterprise : enterpriseList){
            String username = Enterprise.getUsername();
            if (username.equals(enteredUsername)){
                return false;
            }
        }
        
        return true;
    }
    
    public void removeEnterprise(enterprise Enterprise){
        this.enterpriseList.remove(Enterprise);
    }
    
}
