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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.HotProduct;
import model.Product;

/**
 *
 * @author ADMIN
 */
public class ProductDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public void addProduct(String pname, int pquantity, float pprice, String pdescription, String purl, int pcategoryID, String psize, String pcolor, int pseller_id) {
        try {
            String sql = "INSERT INTO [dbo].[Product]\n"
                    + "           ([ProductName]\n"
                    + "           ,[Quantity]\n"
                    + "           ,[Price]\n"
                    + "           ,[Description]\n"
                    + "           ,[ImageURL]\n"
                    + "           ,[CategoryID]\n"
                    + "           ,[CreatedDate]\n"
                    + "           ,[Size]\n"
                    + "           ,[Color]\n"
                    + "           ,[SellerID])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,GETDATE()\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setString(1, pname);
            ps.setInt(2, pquantity);
            ps.setFloat(3, pprice);
            ps.setString(4, pdescription);
            ps.setString(5, purl);
            ps.setInt(6, pcategoryID);
            ps.setString(7, psize);
            ps.setString(8, pcolor);
            ps.setInt(9, pseller_id);

            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(3), rs.getInt(7), rs.getInt(11), rs.getString(2), rs.getString(6), rs.getString(8), rs.getString(4), rs.getString(9), rs.getString(10), rs.getFloat(5)));
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Product> getAllProducts(int sellerID) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT [ProductID]\n"
                    + "      ,[ProductName]\n"
                    + "      ,[Quantity]\n"
                    + "      ,[CreatedDate]\n"
                    + "      ,[Price]\n"
                    + "      ,[Description]\n"
                    + "      ,[CategoryID]\n"
                    + "      ,[ImageURL]\n"
                    + "      ,[Size]\n"
                    + "      ,[Color]\n"
                    + "      ,[SellerID]\n"
                    + "  FROM [dbo].[Product]\n"
                    + "  WHERE SellerID = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setInt(1, sellerID);

            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(3), rs.getInt(7), rs.getInt(11), rs.getString(2), rs.getString(6), rs.getString(8), rs.getString(4), rs.getString(9), rs.getString(10), rs.getFloat(5)));
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void deleteProduct(int id) {
        try {
            String sql = "DELETE FROM [dbo].[Product]\n"
                    + "      WHERE ProductID = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Product getProductByID(int productID) {
        try {
            String sql = "SELECT [ProductID]\n"
                    + "      ,[ProductName]\n"
                    + "      ,[Quantity]\n"
                    + "      ,[CreatedDate]\n"
                    + "      ,[Price]\n"
                    + "      ,[Description]\n"
                    + "      ,[CategoryID]\n"
                    + "      ,[ImageURL]\n"
                    + "      ,[Size]\n"
                    + "      ,[Color]\n"
                    + "      ,[SellerID]\n"
                    + "  FROM [dbo].[Product]\n"
                    + "  WHERE ProductID = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setInt(1, productID);

            rs = ps.executeQuery();
            if (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getInt(3), rs.getInt(7), rs.getInt(11), rs.getString(2), rs.getString(6), rs.getString(8), rs.getString(4), rs.getString(9), rs.getString(10), rs.getFloat(5));
                return product;
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updateProduct(int id, String pname, int pquantity, float pprice, String pdescription, String purl, int pcategoryID, String psize, String pcolor) {
        try {
            String sql = "UPDATE [dbo].[Product]\n"
                    + "   SET [ProductName] = ?\n"
                    + "      ,[Quantity] = ?\n"
                    + "      ,[Price] = ?\n"
                    + "      ,[Description] = ?\n"
                    + "      ,[ImageURL] = ?\n"
                    + "      ,[CategoryID] = ?\n"
                    + "      ,[Size] = ?\n"
                    + "      ,[Color] = ?\n"
                    + " WHERE ProductID = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setString(1, pname);
            ps.setInt(2, pquantity);
            ps.setFloat(3, pprice);
            ps.setString(4, pdescription);
            ps.setString(5, purl);
            ps.setInt(6, pcategoryID);
            ps.setString(7, psize);
            ps.setString(8, pcolor);
            ps.setInt(9, id);

            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Product> getProductsByCategoryID(int categoryID, int index) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product\n"
                    + "WHERE CategoryID = ? ORDER BY ProductID OFFSET ? ROWS FETCH NEXT 9 ROWS ONLY;";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setInt(1, categoryID);
            ps.setInt(2, 9 * (index - 1));

            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getInt(3), rs.getInt(7), rs.getInt(11), rs.getString(2), rs.getString(6), rs.getString(8), rs.getString(4), rs.getString(9), rs.getString(10), rs.getFloat(5));
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int countProductsByCategoryID(int categoryID) {
        try {
            String sql = "SELECT COUNT(*) FROM Product WHERE CategoryID = ?";

            //mo connect den sql server
            conn = new DBContext().getConnection();

            //nem cau lenh sql vao prepare statement de chuan bi thuc thi
            ps = conn.prepareStatement(sql);
            ps.setInt(1, categoryID);

            //thuc thi cau lenh sql va tra ve tap ket qua
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<Product> getProductsBySize(String size, int index) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product\n"
                    + "WHERE size = ? ORDER BY ProductID OFFSET ? ROWS FETCH NEXT 9 ROWS ONLY;";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setString(1, size);
            ps.setInt(2, 9 * (index - 1));

            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getInt(3), rs.getInt(7), rs.getInt(11), rs.getString(2), rs.getString(6), rs.getString(8), rs.getString(4), rs.getString(9), rs.getString(10), rs.getFloat(5));
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int countProductsBySize(String size) {
        try {
            String sql = "SELECT COUNT(*) FROM Product WHERE size = ?";

            //mo connect den sql server
            conn = new DBContext().getConnection();

            //nem cau lenh sql vao prepare statement de chuan bi thuc thi
            ps = conn.prepareStatement(sql);
            ps.setString(1, size);

            //thuc thi cau lenh sql va tra ve tap ket qua
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<Product> getProductsByColor(String color, int index) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product\n"
                    + "WHERE color = ? ORDER BY ProductID OFFSET ? ROWS FETCH NEXT 9 ROWS ONLY;";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setString(1, color);
            ps.setInt(2, 9 * (index - 1));

            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getInt(3), rs.getInt(7), rs.getInt(11), rs.getString(2), rs.getString(6), rs.getString(8), rs.getString(4), rs.getString(9), rs.getString(10), rs.getFloat(5));
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int countProductsByColor(String color) {
        try {
            String sql = "SELECT COUNT(*) FROM Product WHERE color = ?";

            //mo connect den sql server
            conn = new DBContext().getConnection();

            //nem cau lenh sql vao prepare statement de chuan bi thuc thi
            ps = conn.prepareStatement(sql);
            ps.setString(1, color);

            //thuc thi cau lenh sql va tra ve tap ket qua
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<Product> getProductsByName(String name, int index) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product\n"
                    + "WHERE ProductName like ? ORDER BY ProductID OFFSET ? ROWS FETCH NEXT 9 ROWS ONLY;";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + name + "%");
            ps.setInt(2, 9 * (index - 1));

            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getInt(3), rs.getInt(7), rs.getInt(11), rs.getString(2), rs.getString(6), rs.getString(8), rs.getString(4), rs.getString(9), rs.getString(10), rs.getFloat(5));
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int countProductsByName(String name) {
        try {
            String sql = "SELECT COUNT(*) FROM Product WHERE ProductName like ?";

            //mo connect den sql server
            conn = new DBContext().getConnection();

            //nem cau lenh sql vao prepare statement de chuan bi thuc thi
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + name + "%");

            //thuc thi cau lenh sql va tra ve tap ket qua
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<Product> getProductsByGender(int categoryID, int index) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "";
            if (categoryID == -1) { // male
                sql = "SELECT p.* FROM Product p,Category c\n"
                        + "WHERE p.CategoryID = c.CategoryID and c.CategoryName like 'M%' ORDER BY ProductID OFFSET ? ROWS FETCH NEXT 9 ROWS ONLY;";
            } else { // female
                sql = "SELECT p.* FROM Product p,Category c\n"
                        + "WHERE p.CategoryID = c.CategoryID and c.CategoryName like 'F%' ORDER BY ProductID OFFSET ? ROWS FETCH NEXT 9 ROWS ONLY;";
            }

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setInt(1, 9 * (index - 1));

            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getInt(3), rs.getInt(7), rs.getInt(11), rs.getString(2), rs.getString(6), rs.getString(8), rs.getString(4), rs.getString(9), rs.getString(10), rs.getFloat(5));
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int countProductsByGender(int categoryID) {
        try {
            String sql = "";
            if (categoryID == -1) { // male
                sql = "SELECT COUNT(productID) FROM Product p,Category c\n"
                        + "WHERE p.CategoryID = c.CategoryID and c.CategoryName like 'M%'";
            } else { // female
                sql = "SELECT COUNT(productID) FROM Product p,Category c\n"
                        + "WHERE p.CategoryID = c.CategoryID and c.CategoryName like 'F%'";
            }

            //mo connect den sql server
            conn = new DBContext().getConnection();

            //nem cau lenh sql vao prepare statement de chuan bi thuc thi
            ps = conn.prepareStatement(sql);

            //thuc thi cau lenh sql va tra ve tap ket qua
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<Product> searchProductByPrice(float from, float to, int index) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "";
            if (to != -1) {
                sql = "SELECT * FROM Product WHERE Price >= ? and Price <= ? ORDER BY ProductID OFFSET ? ROWS FETCH NEXT 9 ROWS ONLY;";
            } else {
                sql = "SELECT * FROM Product WHERE Price >= ? ORDER BY ProductID OFFSET ? ROWS FETCH NEXT 9 ROWS ONLY;";
            }

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            if (to != -1) {
                ps.setFloat(1, from);
                ps.setFloat(2, to);
                ps.setInt(3, 9 * (index - 1));
            } else {
                ps.setFloat(1, from);
                ps.setInt(2, 9 * (index - 1));
            }

            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getInt(3), rs.getInt(7), rs.getInt(11), rs.getString(2), rs.getString(6), rs.getString(8), rs.getString(4), rs.getString(9), rs.getString(10), rs.getFloat(5));
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int countProductsByPrice(float from, float to) {
        try {
            String sql = "";
            if (to != -1) {
                sql = "SELECT COUNT(*) FROM Product WHERE Price >= ? and Price <= ?";
            } else {
                sql = "SELECT COUNT(*) FROM Product WHERE Price >= ?";
            }

            //mo connect den sql server
            conn = new DBContext().getConnection();

            //nem cau lenh sql vao prepare statement de chuan bi thuc thi
            ps = conn.prepareStatement(sql);
            if (to != -1) {
                ps.setFloat(1, from);
                ps.setFloat(2, to);
            } else {
                ps.setFloat(1, from);
            }

            //thuc thi cau lenh sql va tra ve tap ket qua
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<Product> getRelatedProduct(int productID, int categoryID) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product WHERE ProductID <> ? and CategoryID = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setInt(1, productID);
            ps.setInt(2, categoryID);

            rs = ps.executeQuery();
            int count = 0;
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getInt(3), rs.getInt(7), rs.getInt(11), rs.getString(2), rs.getString(6), rs.getString(8), rs.getString(4), rs.getString(9), rs.getString(10), rs.getFloat(5));
                list.add(product);
                ++count;
                if (count == 4) {
                    break;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Product> getNewestProduct() {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product\n"
                    + "ORDER BY CreatedDate DESC";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            int count = 0;
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getInt(3), rs.getInt(7), rs.getInt(11), rs.getString(2), rs.getString(6), rs.getString(8), rs.getString(4), rs.getString(9), rs.getString(10), rs.getFloat(5));
                list.add(product);
                ++count;
                if (count == 4) {
                    break;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Product> getHotSalesProducts() {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product\n"
                    + "ORDER BY Quantity";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            int count = 0;
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getInt(3), rs.getInt(7), rs.getInt(11), rs.getString(2), rs.getString(6), rs.getString(8), rs.getString(4), rs.getString(9), rs.getString(10), rs.getFloat(5));
                list.add(product);
                ++count;
                if (count == 4) {
                    break;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Product> getProductsByPaging(int index) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product\n"
                    + "ORDER BY ProductID\n"
                    + "OFFSET ? ROWS FETCH NEXT 9 ROWS ONLY;";

            //mo connect den sql server
            conn = new DBContext().getConnection();

            //nem cau lenh sql vao prepare statement de chuan bi thuc thi
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 9 * (index - 1));

            //thuc thi cau lenh va tra ve ket qua
            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getInt(3), rs.getInt(7), rs.getInt(11), rs.getString(2), rs.getString(6), rs.getString(8), rs.getString(4), rs.getString(9), rs.getString(10), rs.getFloat(5));
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int countAllProducts() {
        try {
            String sql = "SELECT COUNT(*) FROM Product";

            //mo connect den sql server
            conn = new DBContext().getConnection();

            //nem cau lenh sql vao prepare statement de chuan bi thuc thi
            ps = conn.prepareStatement(sql);

            //thuc thi cau lenh sql va tra ve tap ket qua
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<HotProduct> getHotProducts() {
        List<HotProduct> list = new ArrayList<>();

        try {
            String sql = "SELECT a.ProductID, SUM(a.Quantity) as TotalQuantity, b.ProductName  FROM OrderDetail a JOIN Product b ON a.ProductID = b.ProductID\n"
                    + "GROUP BY a.ProductID, b.ProductName\n"
                    + "ORDER BY SUM(a.Quantity) DESC";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            int count = 0;
            while (rs.next()) {
                list.add(new HotProduct(rs.getInt(1), rs.getInt(2), rs.getString(3)));
                ++count;
                if (count == 5) {
                    break;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new ProductDAO().getQuantityByID(1));
    }

    public void updateQuantity(int productID, int quantity) {
        try {
            String sql = "UPDATE [dbo].[Product]\n"
                    + "   SET [Quantity] = [Quantity] - ?\n"
                    + " WHERE ProductID = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setInt(1, quantity);
            ps.setInt(2, productID);

            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getQuantityByID(int productID) {
        try {
            String sql = "SELECT Quantity FROM Product\n"
                    + " WHERE ProductID = ?";

            conn = new DBContext().getConnection();

            ps = conn.prepareStatement(sql);
            ps.setInt(1, productID);

            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
