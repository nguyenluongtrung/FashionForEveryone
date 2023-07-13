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
public class Shipping {
    private int shippingID;
    private String name;
    private String phone;
    private String address;

    public Shipping() {
    }

    public Shipping(int shippingID, String name, String phone, String address) {
        this.shippingID = shippingID;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public int getShippingID() {
        return shippingID;
    }

    public void setShippingID(int shippingID) {
        this.shippingID = shippingID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Shipping{" + "shippingID=" + shippingID + ", name=" + name + ", phone=" + phone + ", address=" + address + '}';
    }
    
    
}
