/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class productDirectory {
    
    private ArrayList<product> productList;
    
    public productDirectory(){
        this.productList = new ArrayList<product>();
    }

    public ArrayList<product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<product> productList) {
        this.productList = productList;
    }
    
    public product addProduct(){
        product newProduct = new product();
        productList.add(newProduct);
        return newProduct;
    }
}
