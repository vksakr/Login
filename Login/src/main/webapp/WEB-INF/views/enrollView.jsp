<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> 
<h1> 수강 정보</h1>
	<table border="1">
		<tr>
			<td width = "100">강좌번호</td>
			<td width = "100">과목명</td>
			<td width = "100">연도</td>
			<td width = "100">학년</td>
			<td width = "100">정원</td>
			<td width = "100">학점</td>
			<td width = "100">교수</td>
			<td width = "100">학생이름</td>
			<td width = "100">성적</td>
		</tr>

<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}catch(ClassNotFoundException cnfe){
		cnfe.printStackTrace();
		System.out.println("드라이버 로딩 실패");
	}
	try{
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String userId = "class_a";
		String userPass = "delab";

		conn = DriverManager.getConnection(jdbcUrl, userId, userPass);
		String sql = "SELECT * FROM CLASS_SE natural join ENROLL_SE";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();

			while(rs.next()){
				String cno = rs.getString("cno");
				String cname = rs.getString("cname");
				String year = rs.getString("year");
				String gclass = rs.getString("class");
				String num = rs.getString("num");
				String score = rs.getString("score");
				String inst = rs.getString("inst");
				String name = rs.getString("name");
				String grade = rs.getString("grade");
				
%>
				<tr>
					<td width = "100"><%= cno%></td>
					<td width = "100"><%= cname%></td>
					<td width = "100"><%= year%></td>
					<td width = "100"><%= gclass%></td>
					<td width = "100"><%= num%></td>
					<td width = "100"><%= score%></td>
					<td width = "100"><%= inst%></td>
					<td width = "100"><%= name%></td>
					<td width = "100"><%= grade%></td>
				</tr>
<%
		}
%>
</table>

<% 

	}catch(SQLException e){
		e.printStackTrace();

		if(rs != null){
			try{
					rs.close();
				}catch(SQLException sqle){ }
			}
		if(pstmt != null){
			try{
					pstmt.close();
				}catch(SQLException sqle){ }
			}
		}
%>

	<br>
<a href="${pageContext.request.contextPath}/LoginController/Logout"> 로그아웃</a>
<a href="${pageContext.request.contextPath}/GwamokController/Home"> 이전화면</a>


</body>
</html>