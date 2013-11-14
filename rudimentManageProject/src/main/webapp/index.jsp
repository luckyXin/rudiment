<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<h2>Hello World!</h2>
<a href="<%=request.getContextPath()%>/userInfo">用户列表</a>
<a href="<%=request.getContextPath()%>/userInfo/AASAS23123">显示</a>
<a href="<%=request.getContextPath()%>/userInfo/AASAS23123/edit">编辑</a>
</body>
</html>
