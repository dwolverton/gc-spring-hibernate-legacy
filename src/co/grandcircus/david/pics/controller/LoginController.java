package co.grandcircus.david.pics.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.grandcircus.david.pics.dao.UserDao;
import co.grandcircus.david.pics.model.User;

@Controller
public class LoginController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/login.html")
	public String loginForm() {
		return "login-form";
	}
	
	@RequestMapping(path = "/login.html", method = RequestMethod.POST)
	public String login(User loginAndPassword, HttpSession session, ModelMap model) {
		User user = userDao.findUserByLoginAndPassword(loginAndPassword.getLogin(), loginAndPassword.getPassword());
		if (user != null) {
			session.setAttribute("user", user);
			return "redirect:/index.html";
		} else {
			model.put("login", loginAndPassword.getLogin());
			model.put("errorMessage", "We can't find that login ID and password in our system. Try again.");
			return "login-form";
		}		
	}
}
