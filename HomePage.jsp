<%-- 
    Document   : HomePage
    Created on : 16 Aug, 2019, 4:59:19 PM
    Author     : Suhilpatil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
    </head>
    <body>
        <jsp:include page="Templet.jsp"></jsp:include>
    <td valign="top"> <br/><br/><B> <I><font style="font-family: 'Brush Script MT Italics', Gadget, sans-serif;" size='+1'
                                             color='darkblue'>Rocket Travel, Inc. provides an online hotel booking service for 
                users to search and book hotels in Atlanta, Boston, Chicago, Dallas, Denver, Honolulu, Houston, Las Vegas, Los Angeles, Miami,
                New York City, Philadelphia, San Diego, San Francisco, and Washington, D.C. 
                It allows travelers to earn airline miles on booking rooms at hotels. The company was founded in 2012 and is based
                     
                in Chicago, Illinois. As of March 3, 2015, Rocket Travel, Inc. operates as a subsidiary 
                of The Priceline Group Inc</b></i>
            <br/>
            <br/>
            <form method='Post' action='SubmitServlet'>
                <table cellspacing='10' align='center'>
                    <tr>
                        <td><font color='darkblue' size='+2'>LOGIN AS:</td>
                    </tr>
                </table>
                <table cellspacing='10' align='center' border='2' bordercolor='black'>
                    <tr><td bordercolor='white'><input type='Radio' value='existinguser' name='r2' CHECKED>Existing User
                    <tr>
                        <td bordercolor='white'><input type='Radio' value='newuser' name='r2'>New User
                    <tr><td bordercolor='white'><input type='Submit' value='Submit'>    
                    
                </table>
            </form>
    </body>
</html>
