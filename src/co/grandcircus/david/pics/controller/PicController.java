package co.grandcircus.david.pics.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.david.pics.dao.PicDao;
import co.grandcircus.david.pics.model.Pic;
import co.grandcircus.david.pics.model.User;

@Controller
public class PicController {
	
	@Autowired
	private PicDao picDao;

	@RequestMapping("/index.html")
	public String listPics(ModelMap model) {
		model.put("pics", picDao.getAllPics());
		return "pic-list";
	}
	
	@RequestMapping("/pics/add.html")
	public String addPic(Pic pic, ModelMap model, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user == null) {
			model.put("errorMessage", "Picture not added. You must log in first.");
			return listPics(model);
		}
		
		// TODO add validation
		pic.setUser(user);
		picDao.addPic(pic);
		
		return "redirect:/index.html";
	}
	
	@RequestMapping("/pics/delete.html")
	public String deletePic() {
		return "redirect:/index.html";
	}
	
	@RequestMapping("/pics/edit.html")
	public String editPic() {
		return "redirect:/index.html";
	}
}
