<%--
  Created by IntelliJ IDEA.
  User: luzihai
  Date: 2018/12/26
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
</head>
<body>
    <%--请求路径怎么写--%>
<form action="${ctx}/web/m2" method="post">
    <input type="submit" value="提交">
</form>
<br>
<form action="${ctx}/web/m4" method="post">
<input type="submit" value="提交">
</form>
<br>
<form action="${ctx}/web/m5" method="post">
    <input type="submit" value="提交">
    <input type="hidden" name="_method" value="DELETE">
</form>
</body>
</html>
