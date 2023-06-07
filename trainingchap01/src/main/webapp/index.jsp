<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
  <h1>GET방식의 메소드 요청하기</h1>
  <form action="test" method="GET">
    <input type="submit" value="GET방식 메소드 호출">
  </form>

  <h1>POST방식의 메소드 요청하기</h1>
  <form action="test" method="POST">
    <input type="submit" value="POST방식 메소드 호출">
  </form>

</body>
</html>