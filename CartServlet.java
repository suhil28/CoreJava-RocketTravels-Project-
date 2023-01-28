
package rockettravels;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;


@WebServlet(name = "CartServlet", urlPatterns = {"/CartServlet"})
public class CartServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response){}
            protected void displayCart (HttpServletRequest request, HttpServletResponse response) 
                    throws ServletException, IOException
                    
   {
        PrintWriter pw = response.getWriter();
        HttpSession session = request.getSession(false);
        String destination= session.getAttribute("selDestination").toString();
        String hotel = session.getAttribute("selHotel").toString();
        String totalDays = session.getAttribute("numDays").toString();
        String Airline = session.getAttribute("selAirline").toString();
               pw.println("<table>");
               pw.println("<tr> <td>");
               pw.println("<font color ='darkblue'>Destination:</font></td>");
               pw.println("<tr><td>");
               pw.println("<font color='darkblue'>Hotel:</font></td>");
               pw.println("<td><font color='darkblue'>"+hotel+"</font></td></tr>");
               pw.println("<tr><td>");
               pw.println("font color='darkblue'>Total number of days for stay: </font></td>");
               pw.println("<td><font color='darkblue'>"+totalDays+"</font></td></tr>");
               pw.println("<tr><td>");
               pw.println("<font color='darkblue'>Airline:</font></td>");
               pw.println("<td><font color='darkblue'>"+Airline+"</font></td></tr>");
               pw.println("</table>");      
               
               }
 
        

}
