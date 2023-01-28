
package rockettravels;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;



@WebServlet(name = "ValidationServlet", urlPatterns = {"/ValidationServlet"})
public class ValidationServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         String user=request.getParameter("uid");
         String password=request.getParameter("pwd");
         String role=request.getParameter("r1");
         
         if (user.equals("suhil") && password.equals("password@123") && role.equals("administrator"))
         { 
             
                HttpSession session = request.getSession();
         session.setAttribute("User", user);
         
             RequestDispatcher dispatch= getServletContext().getRequestDispatcher("/WelcomeAdminServlet");
             
             dispatch.forward (request, response);
             
           
         }
         
        
         else{
             if (user.equals("user1") && password.equals("user1@123") && role.equals("customer"))
             {
                 RequestDispatcher dispatch= getServletContext().getRequestDispatcher("/WelcomeCustomerServlet");
             
             dispatch.forward (request, response);
             }
                 
             else
             {
                 
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Error Page</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='0'bgcolor='#000080' align='top' width='100%' style='height:100px'>");
                out.println("<tr>");
                out.println("<td bgcolor='#000080' align='center'>");
                out.println("<font style='font-family: 'Comic Sans MS', cursive, sans-serif;' size='+5' color='#FFFE4B5'>Rocket Travels</font>");
                out.println("</td>");
                    out.println("<tb bgcolor='#000080' align='left' width='150'>");
                    out.println("<img src='Image/company logo.png' width='180' height='120' align='rigth'/>");
                    out.println("</td>");
                    out.println("</tr>");
                    out.println("</table>"); 
                    out.println("<br>");
                    out.println("<font style='font-family:'Trebuchet MS', Helvetica, sans-serif; size='+3' color='red'>Invalid User Credential !!! Try Again With----~~");
                   
                    out.println("<button "
                            + "onclick=\"myFunction()\">Hint</button>");
                    out.println("<p id=\"Help\"></p>");
                    out.println("<script>function myFunction() {document.getElementById(\"Help\").innerHTML = \"password@123\";}</script>");
             }
         }
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
