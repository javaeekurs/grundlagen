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
<%@ include file="menu.jsp" %>

<%= "Müller" %>

<%@include file="footer.html" %>
<!-- Identisch -->
<jsp:directive.include file="footer.html" />

<!-- 
Mime-Type

text/html
image/png
image/jpeg
application/ocet-stream
text/plain
text/json
application/xml
 -->
 
<!-- 
Zeichensätze

1 byte / 8 bit => 2^8 = 256 (0-255 oder -128 bis +127) 

- ASCII (a-z, A-Z, 0-9, !"%$%...)
  128 Zeichen, a 1 byte (8 bit) groß
  01100001 / 0x61 = a, 0x41 = A
- ISO-8859-1 (-15 -> Euro Zeichen)
  128 Zeichen, a 1 byte (8 bit) groß
- UTF-8 (Unicode)
  >= 2 byte groß

-->
</body>
</html>