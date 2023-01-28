
package rockettravels;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Suhilpatil
 */
@WebServlet(name = "GetLogDetails", urlPatterns = {"/GetLogDetails"}, initParams = {
    @WebInitParam(name = "Name", value = "Value")})
public class GetLogDetails extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           out.println("<html>");
            out.println("<head>");
            out.println("<title> HomePage</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='0'bgcolor='#f25c89' align='top' width='100%' style='height:100px'>");
                out.println("<tr>");
                out.println("<td bgcolor='#000080' align='center'>");
                out.println("<font style='font-family: 'Comic Sans MS', cursive, sans-serif;' size='+5' color='#FFFE4B5'>Rocket Travels</font>");
                out.println("</td>");
                    out.println("<tb bgcolor='#000080' align='left' width='150'>");
                    out.println("<img src='Image/company logo.png' width='180' height='120' align='rigth'/>");
                    out.println("</td>");
                    out.println("</tr>");
                    out.println("</table>");
                    
                    File file = new File("log.txt");
                    Scanner scanner = new Scanner (file);
                    
                    while (scanner.hasNext())
                    {
                        out.println(scanner.next());
                    }
                    scanner.close();
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
