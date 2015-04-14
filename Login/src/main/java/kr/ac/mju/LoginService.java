package kr.ac.mju;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public User login(String userID, String userPassword) {
		// TODO Auto-generated method stub
		//dao 이용
		User user = new User();
		user.setID(userID);
		user.setName("원호명");
		
		return user;
	}

}
