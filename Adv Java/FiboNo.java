FiboNo.html

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session using cookies</title>
</head>
<body>
<form action="Fibo.jsp" method="post">
Enter any no:
<input type="text" name="t1" >
<br>
<input type="submit" >
</form>
</body>
</html>

Fibo.jsp


<%
out.println("Fibonacci sequence : ");
int count =Integer.parseInt(request.getParameter("t1"));
int n1=0,n2=1,n3,i; 
out.println(n1+" "+n2); 
for(i=2;i<count;++i) 
{ 
n3=n1+n2; 
out.println(" "+n3); 
n1=n2; 
n2=n3; 
} 
%>
