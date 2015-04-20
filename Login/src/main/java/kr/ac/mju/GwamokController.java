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
		 String string = "abc";
		 request.setAttribute("abc", string);
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
		String gwamokInstructor = request.getParameter("gwamokInstructor");
		gwamok gwamok = service.gaeseol(gwamokName, gwamokPeople, gwamokInstructor);
		
		request.getSession().setAttribute("gwamokSession", gwamok);

			return "gaeseolView";
//		}
	}
	
}

