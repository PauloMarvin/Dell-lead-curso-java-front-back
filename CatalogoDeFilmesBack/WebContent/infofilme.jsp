<%@page import = "br.com.lead.modelo.Filme" %>
<%@page import = "java.util.ArrayList" %>
<%@page import="java.lang.reflect.Array"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Informações do Filme</title>
</head>
<body>
		<h2> Informações do Filme da URL </h2>
		
		<%

		Filme info = (Filme) request.getAttribute("infoFilme");
		
		%>

		<%
		
		out.println("Nome: " + info.getNome() + "<br/>");
		out.println("Genero: " + info.getGenero() + "<br/>");
		out.println("Ano: " + info.getAno());

		%>
		
</body>
</html>