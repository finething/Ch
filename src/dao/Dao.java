package dao;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import data.User;

public class Dao {

	private SessionFactory sessionFactory;

	public Dao() {

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public void saveUser(User user) {
		sessionFactory.getCurrentSession().persist(user);
	}

}
