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
<%
gestionDao n=new gestionDao();

String categorie=request.getParameter("categorie");

List<Livre> lc=n.cherparcate(categorie);
if(lc!=null)
{
	 

	%>
	<table id="livres">
	  <tr>
	    <th>Titre</th>
	    <th>Auteur</th>
	    <th>Catégorie</th>
	  </tr>
	  
	 
	 
	  	<%
			for(Livre v : lc)
			{
			%>
			<tr>
			<td><%=v.gettitre() %> </td>
			<td><%= v.getauteur() %> </td>
			<td><%= v.getcategorie() %> </td>
		
			</tr>
			
			<%} %>
			</table> 
			
	<% 

}
else{
	%>
	<p style="color:red; text-align: center;"> Désole !! La catégorie <%=request.getParameter("cat")%> n'est pas disponible </p>
	<%
			
}
%>




</body>
</html>