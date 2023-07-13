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
public class Account {
    private int accountID;
    private String dob;
    private String fullName;
    private String email;
    private String tel;
    private String username;
    private String address;
    private String password;
    private String role;
    private boolean gender;

    public Account() {
    }

    public Account(int accountID, String dob, String fullName, String email, String tel, String username, String address, String password, String role, boolean gender) {
        this.accountID = accountID;
        this.dob = dob;
        this.fullName = fullName;
        this.email = email;
        this.tel = tel;
        this.username = username;
        this.address = address;
        this.password = password;
        this.role = role;
        this.gender = gender;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Account{" + "accountID=" + accountID + ", dob=" + dob + ", fullName=" + fullName + ", email=" + email + ", tel=" + tel + ", username=" + username + ", address=" + address + ", password=" + password + ", role=" + role + ", gender=" + gender + '}';
    }

    
}
