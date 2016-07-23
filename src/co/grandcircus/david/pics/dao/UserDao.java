package co.grandcircus.david.pics.dao;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.grandcircus.david.pics.model.User;
import co.grandcircus.david.pics.service.PasswordEncryptionService;

@Repository
public class UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private PasswordEncryptionService passwordEncryptionService;
	
	public User findUserByLoginAndPassword(String login, String plaintextPassword) {
		String encryptedPassword = passwordEncryptionService.encryptPassword(plaintextPassword);
		try (Session session = sessionFactory.openSession()) {
			return (User) session.createQuery("from User where login = :login and password = :password")
			.setParameter("login", login)
			.setParameter("password", encryptedPassword)
			.getSingleResult();
		} catch (NoResultException ex) {
			return null;
		}
	}

}
