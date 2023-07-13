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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Shipping;

/**
 *
 * @author ADMIN
 */
public class ShippingDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public int addShippingReturnKey(String name, String address, String phone) {
        try {
            String sql = "INSERT INTO [dbo].[Shipping]\n"
                    + "           ([Name]\n"
                    + "           ,[Phone]\n"
                    + "           ,[Address])\n"
                    + "     VALUES\n"
                    + "           (?,?,?)";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, address);

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception ex) {
            Logger.getLogger(ShippingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public Shipping getShippingByShippingID(int shippingID) {
        try {
            String sql = "SELECT [ShippingID]\n"
                    + "      ,[Name]\n"
                    + "      ,[Phone]\n"
                    + "      ,[Address]\n"
                    + "  FROM [dbo].[Shipping]\n"
                    + "  WHERE ShippingID = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setInt(1, shippingID);

            rs = ps.executeQuery();
            if (rs.next()) {
                return new Shipping(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (Exception ex) {
            Logger.getLogger(ShippingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) {
        System.out.println(new ShippingDAO().getShippingByShippingID(1));
    }
}
