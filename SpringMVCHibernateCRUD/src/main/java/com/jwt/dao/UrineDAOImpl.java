package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Urine;

@Repository

public class UrineDAOImpl implements UrineDAO {

	@Autowired
	private SessionFactory sessionFactory1;

	@Override
	public void addUrine(Urine urine) {
		sessionFactory1.getCurrentSession().saveOrUpdate(urine);
		
	}

	@SuppressWarnings("unchecked")
	public List<Urine> getAllUrines() {
		return sessionFactory1.getCurrentSession().createQuery("from Urine")
				.list();
	}

	@Override
	public void deleteUrine(Integer UrineId) {
		Urine urine  = (Urine) sessionFactory1.getCurrentSession().load(
				Urine.class, UrineId);
		if (null != urine) {
			this.sessionFactory1.getCurrentSession().delete(urine);
		}
		
	}

	@Override
	public Urine getUrine(int UrineId) {
		return (Urine) sessionFactory1.getCurrentSession().get(
				Urine.class, UrineId);
	}

	@Override
	public Urine updateUrine(Urine urine) {
		sessionFactory1.getCurrentSession().update(urine);
		return urine;
	}   
	
}
