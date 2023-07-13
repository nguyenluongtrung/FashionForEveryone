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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Order;
import model.OrderJoin;

/**
 *
 * @author ADMIN
 */
public class OrderDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public int addOrderReturnKey(float totalMoney, String note, int accountID, int shippingID) {
        try {
            String sql = "INSERT INTO [dbo].[Orders]\n"
                    + "           ([CreatedDate]\n"
                    + "           ,[TotalPrice]\n"
                    + "           ,[Note]\n"
                    + "           ,[AccountID]\n"
                    + "           ,[ShippingID]\n"
                    + "           ,[Status])\n"
                    + "     VALUES\n"
                    + "           (GETDATE()\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,'PEND')";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setFloat(1, totalMoney);
            ps.setString(2, note);
            ps.setInt(3, accountID);
            ps.setInt(4, shippingID);

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

    public List<OrderJoin> getAllOrderDetails(int sellerID) {
        List<OrderJoin> list = new ArrayList<>();
        try {
            String sql = "SELECT a.*,b.*,c.*,d.ProductName, d.Price FROM OrderDetail a JOIN Orders b ON a.OrderID = b.OrderID JOIN Shipping c ON c.ShippingID = b.ShippingID JOIN Product d ON d.ProductID = a.ProductID WHERE d.SellerID = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setInt(1, sellerID);

            rs = ps.executeQuery();
            while (rs.next()) {
                OrderJoin item = new OrderJoin(rs.getInt(1), rs.getString(5), rs.getFloat(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getInt(2), rs.getInt(3), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(10), rs.getString(15), rs.getFloat(16));
                list.add(item);
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public OrderJoin getOrderJoinInfo(int orderID, String productName) {
        try {
            String sql = "SELECT a.*,b.*,c.*,d.ProductName, d.Price FROM OrderDetail a JOIN Orders b ON a.OrderID = b.OrderID JOIN Shipping c ON c.ShippingID = b.ShippingID JOIN Product d ON d.ProductID = a.ProductID WHERE a.OrderID = ? and d.ProductName = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderID);
            ps.setString(2, productName);

            rs = ps.executeQuery();
            if (rs.next()) {
                return new OrderJoin(rs.getInt(1), rs.getString(5), rs.getFloat(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getInt(2), rs.getInt(3), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(10), rs.getString(15), rs.getFloat(16));
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Order> getAllOrders() {
        List<Order> list = new ArrayList<>();
        try {
            String sql = "SELECT [OrderID]\n"
                    + "      ,[CreatedDate]\n"
                    + "      ,[TotalPrice]\n"
                    + "      ,[Note]\n"
                    + "      ,[AccountID]\n"
                    + "      ,[ShippingID]\n"
                    + "      ,[Status]\n"
                    + "  FROM [dbo].[Orders]";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7)));
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<OrderJoin> getDetailsOfOrder(int orderID) {
        List<OrderJoin> list = new ArrayList<>();
        try {
            String sql = "SELECT a.*,b.*,c.*,d.ProductName, d.Price FROM OrderDetail a JOIN Orders b ON a.OrderID = b.OrderID JOIN Shipping c ON c.ShippingID = b.ShippingID JOIN Product d ON d.ProductID = a.ProductID WHERE a.OrderID = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderID);

            rs = ps.executeQuery();
            while (rs.next()) {
                OrderJoin item = new OrderJoin(rs.getInt(1), rs.getString(5), rs.getFloat(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getInt(2), rs.getInt(3), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(10), rs.getString(15), rs.getFloat(16));
                list.add(item);
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void updateStatus(int orderID, String status) {
        try {
            String sql = "UPDATE [dbo].[Orders]\n"
                    + "   SET [Status] = ?\n"
                    + " WHERE OrderID = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setString(1, status);
            ps.setInt(2, orderID);

            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Order getOrderByID(int orderID) {
        try {
            String sql = "SELECT [OrderID]\n"
                    + "      ,[CreatedDate]\n"
                    + "      ,[TotalPrice]\n"
                    + "      ,[Note]\n"
                    + "      ,[AccountID]\n"
                    + "      ,[ShippingID]\n"
                    + "      ,[Status]\n"
                    + "  FROM [dbo].[Orders]\n"
                    + "  WHERE OrderID = ?";
            
            conn = new DBContext().getConnection();
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, orderID);
            
            rs = ps.executeQuery();
            if(rs.next()){
                return new Order(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7));
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Integer> getAllAccountIDsOrdered(){
        List<Integer> list = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT AccountID FROM Orders";
            
            conn = new DBContext().getConnection();
            
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    

    public static void main(String[] args) {
        System.out.println(new OrderDAO().getAllAccountIDsOrdered());
    }
}
