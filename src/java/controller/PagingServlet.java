/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
public class PagingServlet extends HttpServlet {

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
            out.println("<title>Servlet PagingServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PagingServlet at " + request.getContextPath() + "</h1>");
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
        int type = Integer.parseInt(request.getParameter("type"));
        int index = Integer.parseInt(request.getParameter("index"));
        switch (type) {
            case 0:
                //gui index qua cho cac trang
                request.setAttribute("index", index);
                request.getRequestDispatcher("list-products-shopping").forward(request, response);
                break;
            case 1:
                request.setAttribute("index", index);
                request.getRequestDispatcher("search-product-by-category").forward(request, response);
                break;
            case 2:
                request.setAttribute("index", index);
                request.getRequestDispatcher("search-product-by-color").forward(request, response);
                break;
            case 3:
                request.setAttribute("index", index);
                request.getRequestDispatcher("search-product-by-name").forward(request, response);
                break;
            case 4:
                request.setAttribute("index", index);
                request.getRequestDispatcher("search-product-by-price").forward(request, response);
                break;
            case 5:
                request.setAttribute("index", index);
                request.getRequestDispatcher("search-product-by-size").forward(request, response);
                break;
        }
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
