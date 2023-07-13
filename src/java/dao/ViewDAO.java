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
public class ViewDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public int getView() {
        try {
            String sql = "SELECT [Viewed]\n"
                    + "  FROM [dbo].[View]";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void updateView() {
        try {
            String sql = "UPDATE [dbo].[View]\n"
                    + "   SET [Viewed] = [Viewed] + 1";
            
            conn = new DBContext().getConnection();
            
            ps = conn.prepareStatement(sql);
            
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ViewDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        //new ViewDAO().updateView();
        System.out.println(new ViewDAO().getView());
    }
}
