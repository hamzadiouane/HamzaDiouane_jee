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
<jsp:include page="header1.jsp"></jsp:include>

<div class="container register-form"> 
            <div class="form">
                <div class="note">
                    <p>Creer un compte pour se connecter</p>
                </div>
    <form action="ajouteretudiant">
                <div class="form-content">
                    <div class="row">
                
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Nom " name="nom"/>
                               
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Prenom" name="prenom"/>
                                
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Login" name="log"/>
                               
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" placeholder="mote de passe" name="pass"/>
                                 
                            </div>
                        </div>
                    </div>
                    <button type="submit" class="btnSubmit">envoyer</button>
                
                </div>
                </form>

            </div>
        </div>
     
  
    
<%
if(request.getParameter("s")!=null && request.getParameter("nom")!=null && request.getParameter("nom")!=null)
{
	if(request.getParameter("s").equals("done"))	
	{
		%>
		

		<p style="color:green; text-align: center;"   > l'etudiant <%=request.getParameter("nom") %> <%=request.getParameter("prn") %> a bien ajouter </p>
	
		<%
	}
}
%>

        
</body>
</html>