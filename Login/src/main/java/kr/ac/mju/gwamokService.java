package kr.ac.mju;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.ac.mju.GwamokController;
import kr.ac.mju.gwamok;

@Service
public class gwamokService {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	Vector<gwamok> vt = new Vector<gwamok>();
	public gwamok gaeseol(String gwamokName, String gwamokPeople, String gwamokInstructor) throws IOException {
		
		String path = this.getClass().getResource("").getPath();
		File file = new File(path + "gwamokData.txt"); //path 경로 입력 
		FileWriter writer = new FileWriter(file,true);
		BufferedWriter in = new BufferedWriter(writer);
		
		logger.info("파일 경로 :"+ this.getClass().getResource("").getPath());
		
		in.write(gwamokName+" ");
		in.write(gwamokPeople+" ");
		in.write(gwamokInstructor+"\n");
		in.close();
//		String temp;
//		String users;
//		String password;
//		String name;
//		String job;
		
//		while((temp = in.readLine()) != null)
//		{
//			users = temp.split(" ")[0];
//			password = temp.split(" ")[1];
//			name = temp.split(" ")[2];
//			job = temp.split(" ")[3];
//			vt.add(new User(users, password, name, job));
//		}
		
//		User mTemp = new User();
//		
//		for(int i=0; i<vt.size(); i++)
//		{
//			mTemp = (User)vt.get(i);
//			if(userID.equals(mTemp.getID()) && userPassword.equals(mTemp.getPassword()))
//			{
//				return mTemp;
//			}
//		}
//		return new User(null, null, null, null);

		gwamok gwamok = new gwamok(gwamokName,gwamokPeople,gwamokInstructor);

		
		return gwamok;
	}

}
