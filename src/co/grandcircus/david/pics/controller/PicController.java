package co.grandcircus.david.pics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.david.pics.dao.PicDao;
import co.grandcircus.david.pics.model.Pic;

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
	public String addPic(Pic pic) {
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
