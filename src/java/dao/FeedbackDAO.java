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
import model.Feedback;

/**
 *
 * @author ADMIN
 */
public class FeedbackDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public void addNewFeedback(Feedback feed) {
        try {
            String sql = "INSERT INTO [dbo].[Review]\n"
                    + "           ([Msg]\n"
                    + "           ,[AccountID])\n"
                    + "     VALUES\n"
                    + "           (?,?)";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setString(1, feed.getMsg());
            ps.setInt(2, feed.getAccountID());

            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(FeedbackDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Feedback> getAllFeedbacks() {
        List<Feedback> list = new ArrayList<>();

        try {
            String sql = "SELECT [Msg]\n"
                    + "      ,[Reply]\n"
                    + "      ,[AccountID]\n"
                    + "      ,[ReviewID]\n"
                    + "  FROM [dbo].[Review]";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Feedback(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
            }
        } catch (Exception ex) {
            Logger.getLogger(FeedbackDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    

    public void editFeedbackByID(int feedbackID, String reply) {
        try {
            String sql = "UPDATE [dbo].[Review]\n"
                    + "   SET [Reply] = ?\n"
                    + " WHERE [ReviewID] = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setString(1, reply);
            ps.setInt(2, feedbackID);

            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(FeedbackDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Feedback> getFeedbackByAccountID(int accountID) {
        List<Feedback> list = new ArrayList<>();
        try {
            String sql = "SELECT [Msg]\n"
                    + "      ,[Reply]\n"
                    + "      ,[AccountID]\n"
                    + "      ,[ReviewID]\n"
                    + "  FROM [dbo].[Review]\n"
                    + "  WHERE AccountID = ?";
            
            conn = new DBContext().getConnection();
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, accountID);
            
            rs = ps.executeQuery();
            while(rs.next()){ 
                list.add(new Feedback(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
            }
        } catch (Exception ex) {
            Logger.getLogger(FeedbackDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static void main(String[] args) {
        System.out.println(new FeedbackDAO().getFeedbackByAccountID(9));
    }
}
