/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class HotProduct {
    private int productID;
    private int totalQuantity;
    private String productName;

    public HotProduct() {
    }

    public HotProduct(int productID, int totalQuantity, String productName) {
        this.productID = productID;
        this.totalQuantity = totalQuantity;
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "HotProduct{" + "productID=" + productID + ", totalQuantity=" + totalQuantity + ", productName=" + productName + '}';
    }
    
    
}
