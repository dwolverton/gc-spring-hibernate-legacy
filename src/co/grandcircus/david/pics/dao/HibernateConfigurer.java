package co.grandcircus.david.pics.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class HibernateConfigurer implements FactoryBean<SessionFactory> {

	public SessionFactory getObject() {
		return new Configuration()
				.configure() // configures settings from hibernate.cfg.xml
				.buildSessionFactory();
	}

	@Override
	public Class<?> getObjectType() {
		return SessionFactory.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
