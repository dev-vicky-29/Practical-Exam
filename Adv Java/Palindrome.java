

PalindromeString.html


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Palindrome.jsp" method="post">
Enter any String:
<input type="text" name="t1" >
<br>
<input type="submit" >
</form>
</body>
</html>


Palindrome.jsp


<%
boolean flag=true;
String str=request.getParameter("t1");
out.println(" Given string is: "+str);
int i = 0, j = str.length() - 1;
while (i < j) {
if (str.charAt(i) != str.charAt(j))
{
flag = false;
out.println("<br>"+str+" is not Pallindrome String.");
break;
}
i++;
j--;
}
if(flag)
out.println("<br>"+str+" is Pallindrome String.");
%>
