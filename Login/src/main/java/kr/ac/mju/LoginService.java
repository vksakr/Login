package kr.ac.mju;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.ac.mju.LoginController;
import kr.ac.mju.User;

@Service
public class LoginService {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	
	
	public User login(String ID, String PW) {

		User user = null;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String userId = "class_a";
			String userPass = "delab";
			
			conn = DriverManager.getConnection(jdbcUrl, userId, userPass);
			stmt = conn.prepareStatement("select * from user_se where id = ? and pw = ?");
			stmt.setString(1, ID);
			stmt.setString(2, PW);
			rs = stmt.executeQuery();
			user = new User();
			
			if(rs.next()){
					user.setID(rs.getString("id"));
					user.setName(rs.getString("name"));
					user.setPassword(rs.getString("pw"));
					user.setJob(rs.getString("job"));
				}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO: handle exception
		} catch (ClassNotFoundException e){
			
		} finally {
			// 무슨 일이 있어도 리소스를 제대로 종료
			if (rs != null) try{rs.close();} catch(SQLException e) {}
			if (stmt != null) try{stmt.close();} catch(SQLException e) {}
			if (conn != null) try{conn.close();} catch(SQLException e) {}
		}
		//return new User(null, null, null, null);
		return user;

	}
	
	public void newusers(String ID, String Name, String Password, String Job) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int result;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String userId = "class_a";
			String userPass = "delab";
			
			conn = DriverManager.getConnection(jdbcUrl, userId, userPass);
			
			stmt = conn.prepareStatement("insert into USER_SE values(?, ?, ? ,?)");
			stmt.setString(1, ID);
			stmt.setString(2, Name);
			stmt.setString(3, Password);
			stmt.setString(4, Job);
			
			result = stmt.executeUpdate();
			
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO: handle exception
		} catch (ClassNotFoundException e){
			
		} finally {
			// 무슨 일이 있어도 리소스를 제대로 종료
			if (stmt != null) try{stmt.close();} catch(SQLException e) {}
			if (conn != null) try{conn.close();} catch(SQLException e) {}
		}	
	}

}
