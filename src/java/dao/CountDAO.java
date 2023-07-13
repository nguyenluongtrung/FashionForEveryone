/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class CountDAO {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public int countProducts(){
        try {
            String sql = "SELECT COUNT(*) FROM Product";
            
            conn = new DBContext().getConnection();
            
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(CountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int countOrders(){
        try {
            String sql = "SELECT COUNT(*) FROM Orders";
            
            conn = new DBContext().getConnection();
            
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(CountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int countSellers(){
        try {
            String sql = "SELECT COUNT(*) FROM Account WHERE [Role] = 'SE'";
            
            conn = new DBContext().getConnection();
            
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(CountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int countAccounts(){
        try {
            String sql = "SELECT COUNT(*) FROM Account";
            
            conn = new DBContext().getConnection();
            
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(CountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(new CountDAO().countAccounts());
    }
}
