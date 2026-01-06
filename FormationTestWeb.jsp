<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="cm.itac.formation.servlet.bean.Ami""%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>Test</title>
	</head>
	
	<body>
		<p>Ceci est une page générée depuis une JSP.</p>
		<p><%
			String attribut = (String) request.getAttribute("FormationTestWeb");
			out.println( attribut );
		%></p>
		<p>
		Récupération du Bean : 
		<%

			Ami notreBean =  (Ami)request.getAttribute("coyote");
			out.println( notreBean.getPrenom() );
			out.println( notreBean.getNom() );
			out.println( notreBean.getColor() );
			out.println( notreBean.getHomme() );
			out.println( notreBean.getSport() );
			
		%>
		</p>
		
		
</body>
</html>