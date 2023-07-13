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
public class View {
    private int viewed;

    public View() {
    }

    public View(int viewed) {
        this.viewed = viewed;
    }

    public int getViewed() {
        return viewed;
    }

    public void setViewed(int viewed) {
        this.viewed = viewed;
    }

    @Override
    public String toString() {
        return "View{" + "viewed=" + viewed + '}';
    }
    
    
}
