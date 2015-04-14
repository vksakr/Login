package kr.ac.mju;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller 
public class GwamokController {

	private static final Logger logger = LoggerFactory.getLogger(GwamokController.class);
	
	@Autowired

	@RequestMapping(value = "/GwamokController/gwamok.do")
	public String gwamok() {
		logger.info("Welcome gwamok!");
		
	
		return "GwamokView";
	}
	
}

