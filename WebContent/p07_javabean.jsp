<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="de.drv.tag1.beans.Kunde" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Kunde k = new Kunde();
	k.setVorname("Bernd");
	k.setNachname("Huber");
	
	out.println(k.getNachname());
%>

<jsp:useBean id="kunde" class="de.drv.tag1.beans.Kunde">
	<jsp:setProperty name="kunde" property="id" value="42" />
	<jsp:setProperty name="kunde" property="vorname" value="Bernd" />
	<jsp:setProperty name="kunde" property="nachname" value="Huber" />
</jsp:useBean>

<hr>

<p>
Vorname: <jsp:getProperty name="kunde" property="vorname" />
</p>

<p>
Nachname: <jsp:getProperty name="kunde" property="nachname" />
</p>

<p>
<%= new java.util.Date() %>

</body>
</html>