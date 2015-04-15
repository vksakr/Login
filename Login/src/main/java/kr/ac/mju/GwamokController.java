package kr.ac.mju;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
}

