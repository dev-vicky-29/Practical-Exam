Login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login </title>
</head>
<body>
<form name="loginForm" method="post" action="welcome">
    Username: <input type="text" name="username"/> <br/>
    Password: <input type="password" name="password"/> <br/>
    <input type="submit" value="Login" />
</form>
</body>
</html>
 
FirstServlet.java

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FirstServlet extends HttpServlet {     
    public FirstServlet() {
        super();
    }
    protected void    (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		response.setContentType("text/html");//setting the content type  
		PrintWriter pw=response.getWriter();//get the stream to write the data  
		  
		//writing html in the stream  
		pw.println("<html><body>");  
		pw.println("<h2>" + username + "! Welcome to servlet !!  </h2> ");  
		pw.println("</body></html>");  
		pw.close();//closing the stream  
	}
}



web.xml 

<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>EmployeeWebApp</display-name>
  <welcome-file-list>
    <welcome-file>Login.html</welcome-file>
  </welcome-file-list>
<servlet>  
<servlet-name>MyServletName</servlet-name>  
<servlet-class>FirstServlet</servlet-class>  
</servlet>  
<servlet-mapping>  
<servlet-name>MyServletName</servlet-name>  
<url-pattern>/welcome</url-pattern>  
</servlet-mapping> 
</web-app>
