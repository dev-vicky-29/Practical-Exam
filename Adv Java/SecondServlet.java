
index.html


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session using cookies</title>
</head>
<body>
<form action="servlet1" method="post"> 
Name:<input type="text" name="userName"/><br/> 
<input type="submit" value="go"/> 
</form> 
</body>
</html>

FirstServlet.java


package cookiesEx;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FirstServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try{ 
response.setContentType("text/html"); 
PrintWriter out = response.getWriter(); 
String n=request.getParameter("userName"); 
out.print("Welcome "+n); 
Cookie ck=new Cookie("uname",n);//creating cookie object 
response.addCookie(ck);//adding cookie in the response 
//creating submit button 
out.print("<form action='servlet2' method='post'>"); 
out.print("<input type='submit' value='go'>"); 
out.print("</form>"); 
out.close(); 
}catch(Exception e)
{ 
System.out.println(e);
} 
}
}

SecondServlet.java


package cookiesEx;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SecondServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
public SecondServlet() {
super();
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try{ 
response.setContentType("text/html"); 
PrintWriter out = response.getWriter(); 
Cookie ck[]=request.getCookies(); 
out.print("Hello "+ck[0].getValue()); 
out.close(); 
}catch(Exception e)
{
System.out.println(e);
} 
}
}


web.xml ( The Deployment Descriptor )

<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
<display-name>WebApp</display-name>
<servlet> 
<servlet-name>s1</servlet-name> 
<servlet-class>cookiesEx.FirstServlet</servlet-class> 
</servlet> 
<servlet-mapping> 
<servlet-name>s1</servlet-name> 
<url-pattern>/servlet1</url-pattern> 


</servlet-mapping> 
<servlet> 
<servlet-name>s2</servlet-name> 
<servlet-class>cookiesEx.SecondServlet</servlet-class> 
</servlet> 
<servlet-mapping> 
<servlet-name>s2</servlet-name> 
<url-pattern>/servlet2</url-pattern> 
</servlet-mapping> 
</web-app>

