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
 
<h1>과목 화면</h1>

${userSession.getID()}
<a href="${pageContext.request.contextPath}/LoginController/Logout"> 로그아웃</a>
<a href="${pageContext.request.contextPath}/GwamokController/Home"> 이전화면</a>

	<form action="${pageContext.request.contextPath}/GwamokController/Gwamokgaeseol" method="post">
		과목명<input type="text" name="gwamokName"><br/>
		수강인원<input type="text" name="gwamokPeople"><br/>
			<input type="hidden" value="${userSession.getID()}" name="gwamokInstructor">
		<input type="submit" value="등록">

	</form>
</body>
</html>