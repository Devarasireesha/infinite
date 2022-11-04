<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="agent" items="${agentQuery.rows}">
Agent Id:
<c:out value="${agent.agentId}"/><br/>
Agent Name:
<c:out value="${agent.name}"/><br/>
City:
<c:out value="${agent.city}"/><br/>
Gender:
<c:out value="${agent.gender}"/><br/>
MaritalStatus:
<c:out value="${agent.maritalStatus}"/><br/>
Premium:
<c:out value="${agent.premium}"/><br/>
</c:forEach>

</body>
</html>