<%--
  Created by IntelliJ IDEA.
  User: swj
  Date: 2025. 6. 25.
  Time: 오전 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>방문자수 설정하기 화면</h1>
    <%! int count;%>
    <%
        count++;
        application.setAttribute("countValue", count);
    %>
    현재 방문자수: <%=count%>
</body>
</html>
