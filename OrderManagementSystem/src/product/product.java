/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import organization.organization;

/**
 *
 * @author User
 */
public class product {
    
    private String name;
    private String type;
    private int price;
    private int availibility;
    private int productID;
    private organization productOrganization;
    
    private static int count = 0;
    
    public product(){
        count++;
        productID = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAvailibility() {
        return availibility;
    }

    public void setAvailibility(int availibility) {
        this.availibility = availibility;
    }

    public organization getProductOrganization() {
        return productOrganization;
    }

    public void setProductOrganization(organization productOrganization) {
        this.productOrganization = productOrganization;
    }
     
}
