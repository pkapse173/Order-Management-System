/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise;

import java.util.ArrayList;
import organization.organization;

/**
 *
 * @author User
 */
public class enterprise {
    
    private String name;
    private int enterpriseID;
    private String email;
    private String address;
    private String phoneNumber;
    private String username;
    private String password;
    private ArrayList<organization> organizationList;
    
    private static int count = 0;
    
    public enterprise(){
        count++;
        enterpriseID = count;
        this.organizationList = new ArrayList<organization>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnterpriseID() {
        return enterpriseID;
    }

    public void setEnterpriseID(int enterpriseID) {
        this.enterpriseID = enterpriseID;
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

    public ArrayList<organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<organization> organizationList) {
        this.organizationList = organizationList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    
    
    public void addOrganization(organization Org){
        this.organizationList.add(Org);
    }
    
    public void removeOrganization(organization Org){
        this.organizationList.remove(Org);
    }
    
    public int calculateEnterpriseRevenue(enterprise e){
        int revenue = 0;
        for (organization Organization : e.getOrganizationList()){
            revenue += Organization.calculateOrganizationRevenue(Organization);
        }
        return revenue;
    }
    
    
    
}
