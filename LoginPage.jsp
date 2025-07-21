<%-- 
    Document   : LoginPage
    Created on : 16 Aug, 2019, 4:59:39 PM
    Author     : Suhilpatil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <jsp:include page="Templet.jsp"></jsp:include>
    <td valign="top">
    <form action='ValidationServlet' method='Post'>
        <table cellspacing='10' align='center'>
            <tr>
                <td><font color='darkblue' size='+2'>Login From</td>
            </tr>
        </table>
        <table cellspacing ='10' align='center' border='2' bordercolor='black'>
            <tr><td bordercolor='white'>User Id:<td colspan='2' bordercolor='white'><input type='text' name='uid' >
            <tr><td  bordercolor='white'>Password:<td colspan='2' bordercolor='white'><input type='passwod' name='pwd'>
            <tr><td bordercolor='white'>Role:<td bordercolor='white'><input type='Radio' value='administrator' name='r1'>Administrator 
            <tr><td bordercolor='white'><input type='Radio' value='CUSTOMER' name='r1'>Customer
            <tr><td bordercolor='white'><input type='submit' value='Submit'>
            <tr><td bordercolor='white'><input type='RESET' text='Reset'>        
        </table>
    </form>    
    </body>
</html>
