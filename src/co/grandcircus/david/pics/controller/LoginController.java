package co.grandcircus.david.pics.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.david.pics.dao.UserDao;
import co.grandcircus.david.pics.model.User;

@Controller
public class LoginController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/login.html")
	public String login(User loginAndPassword, HttpServletRequest request) {
		User user = userDao.findUserByLoginAndPassword(loginAndPassword.getLogin(), loginAndPassword.getPassword());
		if (user != null) {
			request.getSession().setAttribute("user", user);
		}
		
		return "redirect:/index.html";
	}
}
