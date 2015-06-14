<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
<h1>회원가입 페이지</h1>

	
	<form action="${pageContext.request.contextPath}/LoginController/newuser.do"  method="post">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="userID"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="userName"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="userPassword"></td>
		</tr>
		<tr>
			<td>직업</td>
			<td><input type="radio" name="userJob" value="inst">교수
			<input type="radio" name="userJob" value="stud">학생
			<input type="radio" name="userJob" value="mng">관리자</td>
		</tr>
		<tr>
		<td colspan=2><input type="submit" value="확인"></td>
		</tr>
		
	</table>
	<a href="${pageContext.request.contextPath}/">취소</a>
</form>
</body>
</html>