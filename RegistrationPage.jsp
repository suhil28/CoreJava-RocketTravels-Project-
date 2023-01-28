<%-- 
    Document   : RegistrationPage
    Created on : 16 Aug, 2019, 5:00:43 PM
    Author     : Suhilpatil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <jsp:include page="Templet.jsp"></jsp:include>
    <td valign="top">
    <from method='Post' action='submitservlet'>
        <table cellspacing='10' align='center'>
            <tr>
                <td>
                    <font color='darkblue' size='+2'>New User Registration From
                </td>
            </tr>
            
        </table>
        <table cellspacing='10' align='center' border='2' bordercolor='black'>
            <tr>
                <td bordercolor='white'>User Name:<td colspan='2' bodercolor='white'>
                    <input type='text' name='tt1'>
            <tr><td bordercolor='white'> <input type='text' name='tt2'></tr>
            <tr>
                <td bordercolor='white'><input type='password' name='tt3'>
            </tr>
            <tr>
                <td bordercolor='white'>Re-enter Password:<td colspan='2' bordercolor='white'>
                    <input type='password' name='tt4'>
                </td>
            </tr>
        </table>
        
    </from>
    </body>
</html>
