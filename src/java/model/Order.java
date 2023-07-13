package model;

public class Order {
    private int orderID;
    private String createdDate;
    private float totalPrice;
    private String note;
    private int accountID;
    private int shippingID;
    private String status;

    public Order() {
    }

    public Order(int orderID, String createdDate, float totalPrice, String note, int accountID, int shippingID, String status) {
        this.orderID = orderID;
        this.createdDate = createdDate;
        this.totalPrice = totalPrice;
        this.note = note;
        this.accountID = accountID;
        this.shippingID = shippingID;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", createdDate=" + createdDate + ", totalPrice=" + totalPrice + ", note=" + note + ", accountID=" + accountID + ", shippingID=" + shippingID + ", status=" + status + '}';
    }

    
    
    
}
