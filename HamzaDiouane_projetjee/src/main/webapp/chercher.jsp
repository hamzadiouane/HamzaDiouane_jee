<%@page import="java.util.List"%>
<%@page import="com.dao.gestion"%>
<%@page import="com.dao.gestionDao"%>
<%@page import="com.model.Livre"%>
<%@page import="com.model.Etudiant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>
<body>
 <jsp:include page="header5.jsp"></jsp:include>
 <hr/>
  <jsp:include page="recherchBarre.jsp"></jsp:include>
  
  
<%
Etudiant et=(Etudiant)session.getAttribute("etudiant");

%>


</body>
</html>