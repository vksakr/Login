<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 
<h1>학생 홈</h1>

${userSession.getID()}

<a href="${pageContext.request.contextPath}/LoginController/Logout"> 로그아웃</a>
<a href="${pageContext.request.contextPath}/GwamokController/gwamok.do"> 수강신청</a>
</body>
</html>