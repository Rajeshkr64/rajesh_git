<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@include file="menu.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>leads results</title>
</head>
<body>
   <p><a href="lead">New lead</a></p>
    <h1>All Leads details</h1>
    <table border="1">
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Mobile</th>
        <th>Leads Source</th>
     </tr>
     <c:forEach items="${leads}" var="lead"> 
     <tr>
         <td>${lead.id}</td>
         <td><a href="getLead?id=${lead.id}">${lead.firstName}</a></td>
         <td>${lead.lastName}</td>
         <td>${lead.email}</td>
         <td>${lead.mobile}</td>
         <td>${lead.leadSource}</td>
      </tr>       
     </c:forEach>
    
    </table>
</body>
</html>