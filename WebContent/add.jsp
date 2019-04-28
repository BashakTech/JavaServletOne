<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body bgcolor='cyan'>

	<%
	
	int i, j, k;
	
	i = Integer.parseInt(request.getParameter("num1"));
	j = Integer.parseInt(request.getParameter("num2"));
	
	k = i+j;
	
	out.println("Output: " +k);
	
	%>

</body>
</html>