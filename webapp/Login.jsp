<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" 
    integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" 
    crossorigin="anonymous">
</head>
<body>
    <table>
        <tr>
            <td align=center bgcolor=green>
                <pre><font face=impact size=20 color=pink>RAMinfo</font><font size=5><i>online shopping </i></FONT></pre>
            </td>
        </tr>
        <tr>
            <td align="center" bgcolor=olive>(E&T Division of RAM Informatics Ltd.)</td>
        </tr>
    </table>
    <form action='Login' method=post>
        <lable>
            <pre> Enter your User Id:  </lable><input type=text name=txtuid><br></pre>
            <lable>
                <pre> Enter your password: </lable><input type=password name=txtpwd></pre><br><br>
                <pre><input type=submit value="Sign Up">  
            <br><br>
            <h3><a href="reg.html">Want to open a new account</a></h3>
            
            </form>
        
</body>
</html>