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
<link href="livrestyle.css" rel="stylesheet" />


</head>
<body>
<jsp:include page="header3.jsp"></jsp:include>

<%
Etudiant et=(Etudiant)session.getAttribute("etudiant");
gestionDao g=new gestionDao();

%>
<div> 
<p> Bonjour  <%=et.getPrenom() %> <%=et.getNom() %> </p>
<hr/>
</div>

<%
List<Livre> liv=g.toutlivres();
%>

<table id="livres">
  <tr>
    <th>Titre</th>
    <th>Auteur</th>
    <th>Catégorie</th>
  </tr>
  	<%
		for(Livre lv: liv)
		{
		%>
		<tr>
		<td><%= lv.gettitre() %> </td>
		<td><%= lv.getauteur() %> </td>
		<td><%= lv.getcategorie() %> </td>
	
		</tr>
		<%} %>
	 
  
</table>

</body>
</html>


</body>
</html>