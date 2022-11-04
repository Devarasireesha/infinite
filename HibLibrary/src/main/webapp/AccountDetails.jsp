<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Menu.jsp"/><br/>




<table border="3">
<tr>
<th>Book Id</th>
<th>User Name</th>
<th>Issued On</th>
</tr>





<tr>
	  		<td><c:out value="${books.id}"/> </td>
	  		<td><c:out value="${books.User Name}"/> </td>
	  		<td><c:out value="${books.fromDate}"/> </td>
	  		<td>
	  			<c:if test="${books.totalBooks > 0}">
	  				<input type="checkbox" name="bookid" value="${books.id}" />
	  			</c:if>
	  		</td>
	  	</tr>
</body>
</html>