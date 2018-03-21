package com.jwt.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;






import com.jwt.model.Colonoscopy;
import com.jwt.model.Stock;

@Repository
public class ColonoscopyDAOImpl implements ColonoscopyDAO {

	@Autowired
	private SessionFactory sessionFactory1;

	@Override
	public void addColonoscopy(Colonoscopy colonoscopy) {
		sessionFactory1.getCurrentSession().saveOrUpdate(colonoscopy);
		
	}

	@SuppressWarnings("unchecked")
	public List<Colonoscopy> getAllColonoscopy() {
		return sessionFactory1.getCurrentSession().createQuery("from Colonoscopy")
				.list();
	}

	@Override
	public void deleteColonoscopy(Integer colonoscopyID) {
	
		Colonoscopy colonoscopy  = (Colonoscopy) sessionFactory1.getCurrentSession().load(
				Colonoscopy.class,colonoscopyID );
		if (null != colonoscopy) {
			this.sessionFactory1.getCurrentSession().delete(colonoscopy);
		}
		
	}

	@Override
	public Colonoscopy getColonoscopy(int colonoscopyID) {
		return (Colonoscopy) sessionFactory1.getCurrentSession().get(
			Colonoscopy.class,colonoscopyID );
	}

	@Override
	public Colonoscopy updateColonoscopy(Colonoscopy colonoscopy) {
		sessionFactory1.getCurrentSession().update(colonoscopy);
		return colonoscopy;
	}    
	

}
