<%@page import="com.model.Etudiant"%>
<%@page import="com.model.Etudiant"%>
<%@page import="com.web.ajouteretudiant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link href="css/bootstrap.css" rel="stylesheet" />
<script src="js/bootstrap.js"></script>

</head>

<body>

<jsp:include page="header4.jsp"></jsp:include>
<%
Etudiant et=(Etudiant)session.getAttribute("etudiant");

%>

<div class="container register-form"> 
            <div class="form">
                <div class="note">
                    <p>Ajouter un livre</p>
                </div>
    <form action="ajouterliv">
                <div class="form-content">
                    <div class="row">
                
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Le Titre De Livre " name="titre"/>
                               
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="L'auteur" name="auteur"/>
                                
                            </div>
                             <div class="form-group">
                                <input type="text" class="form-control" placeholder="La catégorie" name="categorie"/>
                                
                            </div>
                        </div>
                       </div>
                    </div>
                    <button type="submit" class="btnSubmit">Ajouter le livre</button>
                </form>
                </div>
                

            </div>
        </div>
     

    
<%
if(request.getParameter("d")!=null)
{
	if(request.getParameter("d").equals("done"))	
	{
		%>
		

		<p style="color:green; text-align: center;"   > Merci d'ajouter le livre </p>
	
		<%
	}
}
%>

      
</body>
</html>