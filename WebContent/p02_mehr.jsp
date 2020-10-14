<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% out.println("test"); %>
<hr>
<h3>Kurzform</h3>
<%= "test Kurzform" %>
<% int zahl = 42; %>
<%= zahl %>
<%-- <%= -> Kurzform für out.println --%>

<hr>
<% out.println(getText()); %>

<%!
	// Funktionale Programmierung
	// SOllte nicht hier stehen, sondern im src Verzeichnis
	private String getText() 
	{
		return "hallo";
	}
%>

{{ERSETZT_FILTER_FILTER}}

</body>
</html>