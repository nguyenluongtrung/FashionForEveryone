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
public class OrderJoin {
    private int orderID;
    private String createdDate;
    private float totalPrice;
    private String note;
    private int accountID;
    private int shippingID;
    private int productID;
    private int quantity;
    private String name;
    private String phone;
    private String address;
    private String status;
    private String productName;
    private float productPrice;

    public OrderJoin() {
    }

    public OrderJoin(int orderID, String createdDate, float totalPrice, String note, int accountID, int shippingID, int productID, int quantity, String name, String phone, String address, String status, String productName, float productPrice) {
        this.orderID = orderID;
        this.createdDate = createdDate;
        this.totalPrice = totalPrice;
        this.note = note;
        this.accountID = accountID;
        this.shippingID = shippingID;
        this.productID = productID;
        this.quantity = quantity;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.status = status;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getShippingID() {
        return shippingID;
    }

    public void setShippingID(int shippingID) {
        this.shippingID = shippingID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "OrderJoin{" + "orderID=" + orderID + ", createdDate=" + createdDate + ", totalPrice=" + totalPrice + ", note=" + note + ", accountID=" + accountID + ", shippingID=" + shippingID + ", productID=" + productID + ", quantity=" + quantity + ", name=" + name + ", phone=" + phone + ", address=" + address + ", status=" + status + ", productName=" + productName + ", productPrice=" + productPrice + '}';
    }

    
    
    
}
