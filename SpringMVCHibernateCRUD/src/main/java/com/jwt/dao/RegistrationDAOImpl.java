package com.jwt.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;





import com.jwt.model.Registration;


@Repository
public class RegistrationDAOImpl implements RegistrationDAO {

	@Autowired
	private SessionFactory sessionFactory1;    
	
	@Override
	public void addRegistration(Registration registration) {
		sessionFactory1.getCurrentSession().saveOrUpdate(registration);
		
	}

	@SuppressWarnings("unchecked")
	public List<Registration> getAllRegistrations() {
		return sessionFactory1.getCurrentSession().createQuery("from registration")
				.list();
	}

	@Override
	public void deleteRegistration(Integer registrationId) {
		Registration registration  = (Registration) sessionFactory1.getCurrentSession().load(
				Registration.class, registrationId);
		if (null != registration) {
			this.sessionFactory1.getCurrentSession().delete(registration);
		}
	}

	@Override
	public Registration getRegistration(int registrationId) {
		return (Registration) sessionFactory1.getCurrentSession().get(
				Registration.class,registrationId);
	}

	@Override
	public Registration updateRegistration(Registration registration) {
		sessionFactory1.getCurrentSession().update(registration);
		return registration;
	}

}