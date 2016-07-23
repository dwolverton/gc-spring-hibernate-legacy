package co.grandcircus.david.pics.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.grandcircus.david.pics.model.Pic;

@Repository
public class PicDao {
	
	public List<Pic> getAllPics() {
		List<Pic> list = new ArrayList<Pic>();
		Pic pic = new Pic();
		pic.setId(1);
		pic.setUrl("http://animalfair.com/wp-content/uploads/2013/03/baby+pig+pictures+0021.jpg");
		pic.setDescription("A pig");
		pic.setUserDisplay("Jazz");
		list.add(pic);
		
		pic = new Pic();
		pic.setId(2);
		pic.setUrl("http://www.desibucket.com/db2/01/25529/25529.jpg");
		pic.setDescription("A baboon");
		pic.setUserDisplay("Linus");
		list.add(pic);
		return list;
	}

}
