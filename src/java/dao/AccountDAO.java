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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.SuperSeller;

/**
 *
 * @author ADMIN
 */
public class AccountDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public void create(Account account) {
        try {
            String sql = "INSERT INTO [dbo].[Account]\n"
                    + "           ([Username]\n"
                    + "           ,[Password]\n"
                    + "           ,[Phone]\n"
                    + "           ,[Address]\n"
                    + "           ,[DisplayName]\n"
                    + "           ,[Email]\n"
                    + "           ,[Role]\n"
                    + "           ,[Dob]\n"
                    + "           ,[Gender])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?,?,?,?)";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setString(1, account.getUsername());
            ps.setString(2, account.getPassword());
            ps.setString(3, account.getTel());
            ps.setString(4, account.getAddress());
            ps.setString(5, account.getFullName());
            ps.setString(6, account.getEmail());
            ps.setString(7, account.getRole());
            ps.setString(8, account.getDob());
            ps.setBoolean(9, account.isGender());

            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Account getAccountByLogin(String username, String password) {
        try {
            String sql = "select * from Account\n"
                    + "where Username = ? and [Password] = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            rs = ps.executeQuery();
            if (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(9), rs.getString(6), rs.getString(7), rs.getString(4), rs.getString(2), rs.getString(5), rs.getString(3), rs.getString(8), rs.getBoolean(10));
            }
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new AccountDAO().getSuperSellers());
    }

    public void updateAccount(Account account, String fullName, String address, String tel, String username, String password) {
        try {
            String sql = "UPDATE [dbo].[Account]\n"
                    + "   SET [Username] = ?\n"
                    + "      ,[Password] = ?\n"
                    + "      ,[Phone] = ?\n"
                    + "      ,[Address] = ?\n"
                    + "      ,[DisplayName] = ?\n"
                    + " WHERE AccountID = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, tel);
            ps.setString(4, address);
            ps.setString(5, fullName);
            ps.setInt(6, account.getAccountID());

            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Account getAccountByEmail(String email) {
        try {
            String sql = "SELECT * FROM Account WHERE Email = ?";

            //mo connect den sql server
            conn = new DBContext().getConnection();

            //nem cau lenh sql vao prepare statement
            ps = conn.prepareStatement(sql);
            ps.setString(1, email);

            //thuc thi cau lenh va tra ve ket qua
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(9), rs.getString(6), rs.getString(7), rs.getString(4), rs.getString(2), rs.getString(5), rs.getString(3), rs.getString(8), rs.getBoolean(10));
            }
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updatePassword(String password, Account account) {
        try {
            String sql = "UPDATE [dbo].[Account]\n"
                    + "   SET [Password] = ? \n"
                    + " WHERE AccountID = ?";

            //mo connect den sql server
            conn = new DBContext().getConnection();

            //nem cau lenh sql vao prepared statement de chuan bi thuc thi
            ps = conn.prepareStatement(sql);
            ps.setString(1, password);
            ps.setInt(2, account.getAccountID());

            //thuc thi cau lenh
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<SuperSeller> getSuperSellers() {
        List<SuperSeller> list = new ArrayList<>();
        try {
            String sql = "SELECT e.SellerID, COUNT(e.SellerID) as TotalOrders, e.DisplayName FROM Orders a JOIN OrderDetail b ON a.OrderID = b.OrderID JOIN Product c ON c.ProductID = b.ProductID JOIN \n"
                    + "(SELECT * FROM Account a JOIN ( SELECT c.SellerID FROM Orders a JOIN OrderDetail b ON a.OrderID = b.OrderID JOIN Product c ON c.ProductID = b.ProductID GROUP BY c.SellerID ) d ON a.AccountID = d.SellerID) e ON e.AccountID = c.SellerID\n"
                    + "GROUP BY e.SellerID, e.DisplayName\n"
                    + "ORDER BY COUNT(e.SellerID) DESC";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            int count = 0;
            while (rs.next()) {
                list.add(new SuperSeller(rs.getInt(1), rs.getInt(2), rs.getString(3)));
                ++count;
                if(count == 5)
                    break;
            }
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public List<Account> getAllAccountsByOrder(){
        List<Account> list = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT b.* FROM Orders a JOIN Account b ON a.AccountID = b.AccountID";
            
            conn = new DBContext().getConnection();
            
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Account(rs.getInt(1), rs.getString(9), rs.getString(6), rs.getString(7), rs.getString(4), rs.getString(2), rs.getString(5), rs.getString(3), rs.getString(8), rs.getBoolean(10)));
            }
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    }
}
