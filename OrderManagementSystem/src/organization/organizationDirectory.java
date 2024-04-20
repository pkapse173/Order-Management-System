/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import enterprise.enterprise;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class organizationDirectory {
    
    private ArrayList<organization> organizationList;
    
    public organizationDirectory(){
        this.organizationList = new ArrayList<organization>();
    }

    public ArrayList<organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    
    
    public organization addOrganization(){
        organization newOrganization = new organization();
        organizationList.add(newOrganization);
        return newOrganization;
    }
    
    public void addOrganization(organization Organization){
        this.organizationList.add(Organization);
    }
    
    public void removeOrganization(organization Organization){
        this.organizationList.remove(Organization);
    }
    
    public boolean isOrganizationUsernameUnique(String enteredUsername){
        
        for (organization Organization : this.organizationList){
            String username = Organization.getUsername();
            if (username.equals(enteredUsername)){
                return false;
            }
        }
        
        return true;
    }
    
}
