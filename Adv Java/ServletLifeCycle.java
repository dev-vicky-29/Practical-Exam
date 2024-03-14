ServletLifeCycle.java


package lifeCycleEx;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ServletLifeCycle extends HttpServlet {
public ServletLifeCycle() {
super();
}
public void init(ServletConfig config) throws ServletException {
System.out.println("In init(ServletConfig config) method!");
}
public void destroy() {
System.out.println("In destroy() method!");
}
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("In service(HttpServletRequest request, HttpServletResponse response) method!");
response.setContentType("text/html");//setting the content type 
PrintWriter pw=response.getWriter();//get the stream to write the data 
//writing html in the stream 
pw.println("<html><body>"); 
pw.println("Welcome to servlet"); 
pw.println("</body></html>"); 
pw.close();//closing the stream 
}
}



web.xml ( The Deployment Descriptor )

<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
<display-name>WebApp</display-name>
<servlet> 
<servlet-name>LifeCycle</servlet-name> 
<servlet-class>ServletLifeCycle</servlet-class> 
</servlet> 
<servlet-mapping> 
<servlet-name>LifeCycle</servlet-name> 
<url-pattern>/welcome</url-pattern> 
</servlet-mapping> 
</web-app>
