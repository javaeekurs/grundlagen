<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= request.getRemoteAddr() %>

<!--  ?name=Bernd -->
<h3>Hallo <%= request.getParameter("name") %></h3>


<%
	// response.sendError(418, "I am Teapot");
%>

<%
String name = "Bernd";
%>

<%
if (name == "Bernd") {
%>
Ausgabe
<%	
}

%>

<%--
Standard-Variablen

out (Für die Ausgabe)
request (Abfrage Informationen - Client Addresse oder Parameter, Formulardaten etc)
response (Manipulation der Antwort)
session (Cookies etc.)
config / page (Objekt der Seite selbst)
application (Informationen zum Server finden9
exception (Objekt für Fehler)
--%>

</body>
</html>