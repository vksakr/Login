package kr.ac.mju;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.ac.mju.LoginController;
import kr.ac.mju.User;

@Service
public class LoginService {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	Vector<User> vt = new Vector<User>();
	public User login(String userID, String userPassword) throws IOException {
		// TODO Auto-generated method stub
		//dao 이용
		String path = LoginService.class.getResource("").getPath();
		File file = new File(path + "userData.txt"); //path 경로 입력 
		FileReader writer = new FileReader(file);
		BufferedReader in = new BufferedReader(writer);
		
		logger.info("파일 경로 :"+ LoginService.class.getResource("").getPath());
		
		String temp;
		String users;
		String password;
		String name;
		
		while((temp = in.readLine()) != null)
		{
			users = temp.split(" ")[0];
			password = temp.split(" ")[1];
			name = temp.split(" ")[2];
			
			vt.add(new User(users, password, name));
		}
		
		User mTemp = new User();
		
		for(int i=0; i<vt.size(); i++)
		{
			mTemp = (User)vt.get(i);
			if(userID.equals(mTemp.getID()) && userPassword.equals(mTemp.getPassword()))
			{
				return mTemp;
			}
		}
		return new User(null, null, null);

	//	User user = new User();
	//	user.setID(userID);
	//	user.setName("원호명");
		
	//	return user;
	}

}
