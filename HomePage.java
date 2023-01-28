
package rockettravels;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "HomePage", urlPatterns = {"/HomePage"})
public class HomePage extends HttpServlet {

    
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
                      out.println("<br/>");
                      out.println("<B><I><font style='font-family: 'Courier New', Courier, monospace'; size='+1' color='black'>Rocket Travel, Inc. provides an online hotel booking service for users to search and book hotels in Atlanta, Boston, Chicago, Dallas, Denver, Honolulu, Houston, Las Vegas, Los Angeles, Miami, New York City, Philadelphia, San Diego, San Francisco, and Washington, D.C. It allows travelers to earn airline miles on booking rooms at hotels. The company was founded in 2012 and is based in Chicago, Illinois. As of March 3, 2015, Rocket Travel, Inc. operates as a subsidiary of The Priceline Group Inc</B></I>"); 
                          out.println("<br/>");
                               out.println("<form method='Post' action='SubmitServlet'>");
                               out.println("<table cellspacing='10' align='center'>");
                                   out.println("<tr>");
                                   out.println("<td><font color='DimGray' size='+2'>LOGIN:");
                                   out.println("</tr>");
                                   out.println("</td>");
                                   out.println("</table>");
                                           out.println("<table cellspacing='10' align='center' border='2' bordercolor='black'>");
                                           out.println("<tr><td bordercolor='white'><input type='Radio' value='exsitinguser' name='r2' CHECHED>Existing User");
                                           out.println("<tr><td bordercolor='white'><input type='Radio' value='newuser' name='r2'>New User");
                                           out.println("<tr><td bordercolor='white'><input type='Submit' value='Submit'>");
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
