
package rockettravels;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Login Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='0' bgcolor='#000080' align='top' width='100%' style='height:10px'>" ); 
                out.println("<tr>");
                out.println("<td bgcolor='#000080' align='center'>");
                out.println("<font style='font-family: 'serif;serif;serif;' size='+4' color='#FFE4B5'>Rocket Travels</font>");
                out.println("</td>");
                    out.println("<td bgcolor='#000080' align='left' width='180'>");
                         out.println("<img src='Image/company logo.png' width='180' height='120' align='rigth'/>");
                         out.println("</td>");
                          out.println("</tr>");
                                   out.println("</table>");
                                   out.println("<br>");
                                   out.println("<form action='ValidationServlet' method='post'>");
                                   out.println("<table cellspacing='10' align='center' border='2' bordercolor='black'>");
                                   out.println("<tr>");
                                   out.println("<td><font color='blue' size'+10'>Login Form");
                                   out.println("</tr>");
                                   out.println("</td>");
                                   out.println("</table>");
                                   out.println("<br>");
                                   out.println("<table cellspacing='10' align='center' border='2' bordercolor='black'>");
                                   out.println("<tr><td bordercolor='white'>User Id:<td COLSPAN='2' bordercolor='white'><input type='text' name='uid'>");
                                   out.println("<tr><td bordercolor='white'>Password:<td COLSPAN='2' bordercolor='white'><input type='password' name='pwd'>");
                                       out.println("<tr><td bordercolor='white'>Role:<td bordercolor='white'><input type='Radio' value='administrator'name='r1'> Administrator");
                                       out.println("<tr><td bordercolor='white'><input type='Radio' value='customer' name='r2'> Customer");
                                           out.println("<tr><td bordercolor='white'>");
                                           out.println("<tr><td bordercolor='white'><input type='Submit' value='Submit'>");
                                           out.println("<tr><td bordercolor='white'><input type='RESET' text='Reset'>");
                                        out.println("</table>");
                                        out.println("</form>");
                                                 
                                               
                                             
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
