<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<form method="get" action="EvenOdd.jsp">
Enter a Number:
<input type="number" name="no"/>
<input type="submit" value="Show"/>
 </form>
 <c:if test="${param.no!=null}">
 <c:set var="no" value="${param.no}"/>
 <c:if test="${no%2==0}">
 <c:out value="Even Number.."/>
 </c:if>
 <c:if test="${no%2==1}">
 <c:out value="Odd Number.."/>
 </c:if>
 </c:if>
</body>
</html>