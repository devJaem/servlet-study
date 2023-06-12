<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>include directive</h1>
    <!-- div 영역내에 today.jsp 를 전부 가저옴-->
    <div><%@include file="today.jsp"%></div>
    <%
//        String output = ""; 자바주석 활용
    %>
</body>
</html>
