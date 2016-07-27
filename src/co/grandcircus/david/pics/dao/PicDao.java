package co.grandcircus.david.pics.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.grandcircus.david.pics.model.Pic;

@Repository
public class PicDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Pic> getAllPics() {
		try (Session session = sessionFactory.openSession()) {
			return session.createQuery("from Pic", Pic.class).getResultList();
		}
	}
	
	public void addPic(Pic pic) {
		try (Session session = sessionFactory.openSession()) {
			session.save(pic);
		}
	}

}
