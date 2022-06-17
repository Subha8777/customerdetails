<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Billing</title>
</head>
<body>
 

  <h2>Billing Result.....</h2>
  <div>
  
  ${msg}
  </div>
  <table>
  <tr>
 
  <th>first Name</th>
  <th>last Name</th>
  
  <th>email</th>
  <th>mobile</th>
   <th>product</th>
    <th>amount</th>
  
 
  
  </tr>
  <c:forEach items="${bills}" var="bills">
  
  <tr>
  
 
   <td>${bills.firstName}</td>
    <td>${bills.lastName}</td>
  
     <td>${bills.email}</td>
   <td>${bills.mobile}</td>
   <td>${bills.product}</td>
   <td>${bills.amount}</td>
   
   
   
   
   
  
  
  </tr>
  </c:forEach>

  
  
  
  </table>
</body>
</html>