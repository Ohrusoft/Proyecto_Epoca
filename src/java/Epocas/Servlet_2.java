/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Epocas;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 52553
 */
@WebServlet(name = "Servlet_2", urlPatterns = {"/Servlet_2"})
public class Servlet_2 extends HttpServlet {

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
            out.println("<title>Servlet Servlet_2</title>");            
            out.println("</head>");
            out.println("<body style=\"background-color:#f6eda8;\">");
            String para1=null;
            para1=request.getParameter("epoca");
            int edad=Integer.parseInt(para1);
            if (edad>=1950 && edad<1960){
                out.println("<h1><center>"+"Epoca de los 50s"+"</center></h1>");
                out.println("<h3>"+
"Cuando la gente habla de los años 50s, describen esta época como tradicional, optimista y de gran progreso. Llegó la industrialización y la economía solamente crecía, causando que la gente dejara las áreas rurales y se mudara a la ciudad. Las personas se volvían consumistas y se empezaban a vender más productos norteamericanos. Los adolescentes se volvieron una parte importante de la población y era común que tuvieran trabajos. La música, la televisión, las revistas, el cine y los libros" +"</h3>");
                out.println("<center><img src=\"1950.jpg\" width=\"450\" height=\"300\"></center><br>");
                out.println("<h3>"+ "The Platters fue uno de los grupos vocales más exitosos de la primera era del rock and roll. Su sonido distintivo fue un puente entre la tradición anterior al rock de Tin Pan Alley y el nuevo género floreciente. El acto pasó por varios cambios de personal, con la encarnación más exitosa compuesta por el tenor principal Tony Williams, David Lynch, Paul Robi, Herb Reed y Zola Taylor."+ "</h3><br>");
                out.println("<center><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/V9Z439YYyD0\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></center>");
            }
            else{
                if (edad>=1960 && edad<1970){
                    out.println("<h1>"+"Rock and roll"+"</h1>");
                }
                else {
                    if(edad>=1970 && edad<1980){
                         out.println("<h1>"+"Punk"+"</h1>");
                    }
                    else {
                        if(edad>=1980 && edad<1990){
                           out.println("<h1>"+"Disco"+"</h1>"); 
                        }
                        else{
                            if(edad>=1990 && edad<2000){
                                out.println("<h1>"+"Pop"+"</h1>");
                            }
                            else{
                                if(edad>=2000 && edad<2010){
                                    out.println("<h1>"+"Regaetton"+"</h1>");
                                }
                                else {
                                    if(edad>=2010 && edad<2020){
                                       out.println("<h1>"+"Electronica"+"</h1>"); 
                                    }
                                    else{
                                        out.println("<h1>"+"Epoca incorrecta ¿"+"</h1>");
                                    }
                                }
                            }
                        }
                    }
                }
            }
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
        processRequest(request, response);
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
