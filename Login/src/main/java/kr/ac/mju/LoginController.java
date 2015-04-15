package kr.ac.mju;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService service;
	@RequestMapping(value = "/LoginController/Login.do", method = RequestMethod.POST)
	public String login(HttpServletRequest request) throws IOException {
		request.setCharacterEncoding("utf-8");
		String userID = request.getParameter("userID");
		String userPassword = request.getParameter("userPassword");
		User user = service.login(userID, userPassword);
		
		
		logger.info("환영합니다"+userID);
		if(user.getID() == null){
			return "redirect:/";
		}else{
		request.getSession().setAttribute("userSession", user);
		return "sugangView";
		}
	}
	
	@RequestMapping(value = "/LoginController/Logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request){
		request.getSession().removeAttribute("userSession");
		return "redirect:/";
	}
}
