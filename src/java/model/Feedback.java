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
public class Feedback {
    private String msg;
    private String reply;
    private int accountID;
    private int feedbackID;

    public Feedback() {
    }

    public Feedback(String msg, String reply, int accountID, int feedbackID) {
        this.msg = msg;
        this.reply = reply;
        this.accountID = accountID;
        this.feedbackID = feedbackID;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }

    @Override
    public String toString() {
        return "Feedback{" + "msg=" + msg + ", reply=" + reply + ", accountID=" + accountID + ", feedbackID=" + feedbackID + '}';
    }

    
    
    
}
