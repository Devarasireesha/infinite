
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="EmployDelete.jsp">
		<center>
			Employ No: 
			<input type="text" name="empno" /> <br/><br/>
			<input type="submit" value="Delete" />
		</center>
	</form>
	<c:if test="${param.basic!=null}">
		<sql:setDataSource var="conn" 
	driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/infinite"
	user="root"
	password="india@123"
/>
<sql:update var="employDelete" dataSource="${conn}">
	
		<sql:param value="${param.empno}"/>
		
</sql:update>
	</c:if>
</body>
</html> 
