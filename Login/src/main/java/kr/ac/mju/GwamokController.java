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
		return "sugangView";
	}
	
	@RequestMapping(value = "/GwamokController/gwamokS.do", method = RequestMethod.GET)
	public String gwamokS(HttpServletRequest request){
		logger.info("Welcome gwamok!");
		request.getSession().getAttribute("userSession");
		return "GwamokView";
	}
	
	@RequestMapping(value = "/GwamokController/Home")
	public String home(){
	
	return "PsugangView";
	}
	
	@Autowired
	private GwamokService service;
	@RequestMapping(value = "/GwamokController/Gwamokgaeseol.do", method = RequestMethod.POST)
	public String Gwamokgaeseol(String gcno,String gcname, String gyear,String gclass,String gnum,String gscore,String ginst){
		service.newgwamok(gcno,gcname,gyear,gclass,gnum,gscore,ginst);
			return "gaeseolView";
	}
	
	@RequestMapping(value = "/GwamokController/enroll.do", method = RequestMethod.POST)
	public String enroll(String cno,String name){
		service.enroll(cno,name);
			return "enrollView";
	}
	
}

