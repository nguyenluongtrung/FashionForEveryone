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
public class SuperSeller {
    private int sellerID;
    private int totalOrders;
    private String displayName;

    public SuperSeller() {
    }

    public SuperSeller(int sellerID, int totalOrders, String displayName) {
        this.sellerID = sellerID;
        this.totalOrders = totalOrders;
        this.displayName = displayName;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "SuperSeller{" + "sellerID=" + sellerID + ", totalOrders=" + totalOrders + ", displayName=" + displayName + '}';
    }
    
    
}
