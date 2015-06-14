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
 
<h1>과목 개설 화면</h1>

환영합니다 ${userSession.getName()} 교수님.
<a href="${pageContext.request.contextPath}/LoginController/Logout"> 로그아웃</a>
<a href="${pageContext.request.contextPath}/GwamokController/Home"> 이전화면</a>

	<form action="${pageContext.request.contextPath}/GwamokController/Gwamokgaeseol.do" method="post">
	<table>
		<tr>
			<tr>
			<td>강좌번호</td>
			<td><input type="text" name="gcno"></td>
			</tr>
			<tr>
			<td>과목명</td>
			<td><input type="text" name="gcname"></td>
			</tr>
			<tr>
			<td>연도</td>
			<td><input type="text" name="gyear"></td>
			</tr>
			<tr>
			<td>학년</td>
			<td><input type="text" name="gclass"></td>
			</tr>
			<tr>			
			<td>정원</td>
			<td><input type="text" name="gnum"></td>
			</tr>
			<tr>			
			<td>학점</td>
			<td><input type="text" name="gscore"></td>
			</tr>
			<tr>
			<td><input type="hidden" name="ginst" value="${userSession.getName()}"></td> 
			</tr>
			<tr>
		<td colspan=2><input type="submit" value="확인"></td>
		</tr>
		
	</table>
	<a href="${pageContext.request.contextPath}/">취소</a>
	</form>
</body>
</html>