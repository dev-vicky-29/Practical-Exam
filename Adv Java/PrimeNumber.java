PrimeNo.html

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="PrimeNumber.jsp" method="post">
Enter any no:
<input type="text" name="t1" >
<br>
<input type="submit" >
</form>
</body>
</html>



PrimeNumber.jsp


<%
int n=Integer.parseInt(request.getParameter("t1"));
out.println(" given number is: "+n);
int d=2;
while(d<n)
{
if(n%d==0)
{
out.println("<br> "+n+" is not Prime no.");
break;
}
else
d++;
}
if(n==d)
out.println("<br>"+n+" is Prime no.");
%>
