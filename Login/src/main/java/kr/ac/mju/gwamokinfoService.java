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
public class gwamokinfoService {
//	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
//	Vector<gwamok> vt = new Vector<gwamok>();
	public void gwamokinfo(String gwamokName, String gwamokPeople, String gwamokInstructor) throws IOException {
		
		String path = this.getClass().getResource("").getPath();
		File file = new File(path + "userData.txt"); //path 경로 입력 
		FileReader writer = new FileReader(file);
		BufferedReader in = new BufferedReader(writer);

		String temp;
		String name[] = null;
		String people[] = null;
		String instructor[] = null;
		int i=0;
		
		while((temp = in.readLine()) != null)
		{
			name[i] = temp.split(" ")[0];
			people[i] = temp.split(" ")[1];
			instructor[i] = temp.split(" ")[2];
			i++;
		
		}
	}
}
