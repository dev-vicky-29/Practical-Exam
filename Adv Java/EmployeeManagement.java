1)employee.jsp




<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "emp";
String userid = "root";
String password = "root";
Connection conn = null;
Statement st = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>
<h1>Employee Details</h1>
<%
String msg = request.getParameter("msg");
if(msg != null)
if(msg.equalsIgnoreCase("added"))
	out.print("Employee added !");
else if(msg.equalsIgnoreCase("updated"))
	out.print("Employee updated !");
else if(msg.equalsIgnoreCase("deleted"))
	out.print("Employee deleted !");
%>
<br><br><br><a href="emp_register.jsp">Register Employee</a><br><br><br>
<table border="1">
<tr>
<td>Emp ID</td>
<td>Name</td>
<td>City name</td>
<td>Email</td>
<td>Department</td>
<td>Edit</td>
<td>Delete</td>
</tr>
<%
try{
conn = DriverManager.getConnection(connectionUrl+database, userid, password);
st=conn.createStatement();
String sql ="select * from employee";
System.out.println(sql);
resultSet = st.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("emp_id") %></td>
<td><%=resultSet.getString("emp_name") %></td>
<td><%=resultSet.getString("city_name") %></td>
<td><%=resultSet.getString("email") %></td>
<td><%=resultSet.getString("department") %></td>
<td><a href="emp_register.jsp?action=edit&emp_id=<%=resultSet.getString("emp_id") %>">Edit</a></td>
<td><a href="emp_process.jsp?action=delete&emp_id=<%=resultSet.getString("emp_id") %>">Delete</a></td>
</tr>
<%
}
conn.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table> 
</body>
</html>
emp_register.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*"%>
<%




String emp_id=request.getParameter("emp_id");
String action =request.getParameter("action");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "emp";
String userid = "root";
String password = "root";
Connection conn = null;
Statement st = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration</title>
</head>
<body>
<%
if(action == null )
{
%>
<form method="post" action="emp_process.jsp">
Employee name:<br>
<input type="text" name="emp_name">
<br>
City name:<br>
<input type="text" name="city_name">
<br>
Email Id:<br>
<input type="email" name="email">
<br>
Department:<br>
<input type="text" name="dept">
<br><br>
<input type="submit" value="submit">
</form>
<%
}
else if(action.equalsIgnoreCase("edit") )
{
try{
conn = DriverManager.getConnection(connectionUrl+database, userid, password);
st=conn.createStatement();
String sql ="select * from employee where emp_id="+ emp_id;
resultSet = st.executeQuery(sql);
while(resultSet.next()){
%>
<form method="post" action="emp_process.jsp?action=update" >
<input type="hidden" name="emp_id" value="<%=resultSet.getString("emp_id") %>">
Employee name:<br>
<input type="text" name="emp_name" value="<%=resultSet.getString("emp_name") %>">
<br>City name:<br>
<input type="text" name="city_name" value="<%=resultSet.getString("city_name") %>">




<br>Email Id:<br>
<input type="email" name="email" value="<%=resultSet.getString("email") %>">
<br>Department:<br>
<input type="text"  name="dept"  value="<%=resultSet.getString("department") %>">
 <br><br><input type="submit" value="submit">
</form>
<%
}//end of while
conn.close();
} catch (Exception e) {
e.printStackTrace();
}}%>
</body>
</html>



2)emp_process.jsp



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="java.sql.*,java.util.*"%>
<%

String emp_id=request.getParameter("emp_id");
String action =request.getParameter("action");

String emp_name=request.getParameter("emp_name");
String city_name=request.getParameter("city_name");
String email=request.getParameter("email");
String dept=request.getParameter("dept");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "emp";
String userid = "root";
String password = "root";
Connection conn = null;
Statement st = null;
ResultSet resultSet = null;
if(emp_id == null && action == null)
{
try
{
    Class.forName(driver);
    conn = DriverManager.getConnection(connectionUrl+database, userid, password);
    st=conn.createStatement();
    int i=st.executeUpdate("insert into employee(emp_name,city_name,email,department)values('"+emp_name+"','"+city_name+"','"+email+"','"+dept+"')");
    
    response.sendRedirect("employee.jsp?msg=added");
    st.close();
   conn.close();
}
catch(Exception e)
{   
    e.printStackTrace();
}
}else if(action.equalsIgnoreCase("update") )
{
	try
	{
	    Class.forName(driver);
	    conn = DriverManager.getConnection(connectionUrl+database, userid, password);
	    st=conn.createStatement();
	    String qry="update employee set emp_name='"+emp_name+"'," +
	    		"city_name='"+city_name +"',email='"+email+"',department ='"+ dept+"'"+ 
	    		" where emp_id="+emp_id;
	   
	    System.out.println(qry);
	    int i=st.executeUpdate(qry);
	    response.sendRedirect("employee.jsp?msg=updated" );
	           //System.out.println("Data is successfully inserted!");
	}
	catch(Exception e)
	{   
	    e.printStackTrace();
	}
	finally{
		
		try{
			st.close();
			conn.close();
		






}catch(Exception e)
		{   
		    e.printStackTrace();
		}
	}
	
}else if(action.equalsIgnoreCase("delete") )
		{
	
	try
	{
	    Class.forName(driver);






	    conn = DriverManager.getConnection(connectionUrl+database, userid, password);
	    st=conn.createStatement();
	    int i=st.executeUpdate("delete from employee where emp_id="+emp_id);
	    st.close();
		conn.close();
	    response.sendRedirect("employee.jsp?msg=deleted");
	          
	}
	catch(Exception e)
	{   
	    e.printStackTrace();
	}
}

 %>
