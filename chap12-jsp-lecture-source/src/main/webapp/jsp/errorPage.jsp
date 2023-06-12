<!--isErrorPage="true" 일경우 exception객체 사용가능 (내장객체)-->
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String exceptionType =exception.getClass().getName();
        String exceptionMessage=exception.getMessage();
    %>

    <h1><%=exceptionType%></h1>
    <h3><%=exceptionMessage%></h3>
</body>
</html>
