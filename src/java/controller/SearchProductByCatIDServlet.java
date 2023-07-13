/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;

/**
 *
 * @author ADMIN
 */
public class SearchProductByCatIDServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SearchProductByCatIDServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchProductByCatIDServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int index = 0;
        if (request.getAttribute("index") == null) {
            index = 1;
        } else {
            index = (int) (request.getAttribute("index"));
        }
        int id = Integer.parseInt(request.getParameter("id"));
        if (id == -1 || id == -2) {
            List<Product> products = new ProductDAO().getProductsByGender(id, index);
            request.setAttribute("products", products);
            request.setAttribute("products-size", new ProductDAO().countProductsByGender(id));
            int productsSize = new ProductDAO().countProductsByGender(id);
            //get page size
            int pageNumber = productsSize / 9;
            if ((productsSize % 9) != 0) {
                ++pageNumber;
            }
            request.setAttribute("pageNumber", pageNumber);
        } else {
            List<Product> products = new ProductDAO().getProductsByCategoryID(id, index);
            request.setAttribute("products", products);
            request.setAttribute("products-size", new ProductDAO().countProductsByCategoryID(id));
            int productsSize = new ProductDAO().countProductsByCategoryID(id);
            //get page size
            int pageNumber = productsSize / 9;
            if ((productsSize % 9) != 0) {
                ++pageNumber;
            }
            request.setAttribute("pageNumber", pageNumber);
        }
        request.setAttribute("tag", index);
        request.setAttribute("id", id);
        request.setAttribute("type", 1);
        request.getRequestDispatcher("shop.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
