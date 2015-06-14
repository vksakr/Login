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
import kr.ac.mju.gwamok;

@Service
public class GwamokService {

	public void newgwamok(String gcno,String gcname, String gyear,String gclass,String gnum,String gscore,String ginst) {
		
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
			
			stmt = conn.prepareStatement("insert into CLASS_SE values(?, ?, ? ,?, ?, ?, ?)");
			stmt.setString(1, gcno);
			stmt.setString(2, gcname);
			stmt.setString(3, gyear);
			stmt.setString(4, gclass);
			stmt.setString(5, gnum);
			stmt.setString(6, gscore);
			stmt.setString(7, ginst);
			
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
