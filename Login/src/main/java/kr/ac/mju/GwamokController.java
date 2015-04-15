package kr.ac.mju;


import java.io.IOException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller 
public class GwamokController {

	private static final Logger logger = LoggerFactory.getLogger(GwamokController.class);
	
	@RequestMapping(value = "/GwamokController/gwamok.do", method = RequestMethod.GET)
	public String gwamok(HttpServletRequest request){
		logger.info("Welcome gwamok!");
		request.getSession().getAttribute("userSession");
	
		return "GwamokView";
	}
	
	@RequestMapping(value = "/GwamokController/Home")
	public String home(){
	
	return "PsugangView";
	}
	
	@Autowired
	private gwamokService service;
	@RequestMapping(value = "/GwamokController/Gwamokgaeseol", method = RequestMethod.POST)
	public String login(HttpServletRequest request) throws IOException {
		request.setCharacterEncoding("utf-8");
		String gwamokName = request.getParameter("gwamokName");
		String gwamokPeople = request.getParameter("gwamokPeople");
		gwamok gwamok = service.gaeseol(gwamokName, gwamokPeople);
		
		request.getSession().setAttribute("gwamokSession", gwamok);
//		logger.info("환영합니다"+userID);
//		logger.info("환영합니다"+user.getJob());
//		if(user.getID() == null){
//			return "errorView";
//		}else if(user.getJob().equals("교수")){
//		request.getSession().setAttribute("userSession", user);
//		return "PsugangView";
//		}else{
//			request.getSession().setAttribute("userSession", user);
			return "gaeseolView";
//		}
	}
	
}

