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
import org.springframework.web.bind.annotation.RequestParam;

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
		logger.info("환영합니다"+user.getJob());
		if(user.getID() == null){
			return "errorView";
		}else if(user.getJob().equals("inst")){
		request.getSession().setAttribute("userSession", user);
		return "PsugangView";
		}else{
			request.getSession().setAttribute("userSession", user);
			return "SsugangView";
		}
	}
	
	@RequestMapping(value = "/LoginController/Login_new.do", method = RequestMethod.POST)
	public String login_new(HttpServletRequest request){
		request.getSession().removeAttribute("userSession");
		return "newView";
	}
	@RequestMapping(value = "/LoginController/newuser.do", method = RequestMethod.POST)
	public String newuser(String userID, String userName, String userPassword, String userJob ) {
		logger.info("회원가입 신청");
		service.newusers(userID, userName, userPassword, userJob);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/LoginController/Logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request){
		request.getSession().removeAttribute("userSession");
		return "redirect:/";
	}
}
