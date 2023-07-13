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
public class Product {
    private int productID, quantity, categoryID, sellerID;
    private String productName, description, imageURL, createdDate, size, color;
    private float price;

    public Product() {
    }

    public Product(int productID, int quantity, int categoryID, int sellerID, String productName, String description, String imageURL, String createdDate, String size, String color, float price) {
        this.productID = productID;
        this.quantity = quantity;
        this.categoryID = categoryID;
        this.sellerID = sellerID;
        this.productName = productName;
        this.description = description;
        this.imageURL = imageURL;
        this.createdDate = createdDate;
        this.size = size;
        this.color = color;
        this.price = price;
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

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", quantity=" + quantity + ", categoryID=" + categoryID + ", sellerID=" + sellerID + ", productName=" + productName + ", description=" + description + ", imageURL=" + imageURL + ", createdDate=" + createdDate + ", size=" + size + ", color=" + color + ", price=" + price + '}';
    }
    
    
}
