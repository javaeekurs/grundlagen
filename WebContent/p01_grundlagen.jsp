<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Das ist ein HTML Kommentar -->
<%-- Das ist ein Serverseitiger Kommentar --%>

<%
	String name = "Bernd";
	out.println("Hallo <strong>" + name + "</strong>");
%>

<hr>

<%
	for (int i = 0; i< 10; i++) {
		out.println("Durchlauf " + i + "<br/>");
	}

%>

<hr>

<%
	out.println(new Date().toString());
%>

<% int zahl = 44; %>

<% if (zahl == 42) { %>

<h3>Zahl ist 42</h3>

<% } %>



</body>
</html>