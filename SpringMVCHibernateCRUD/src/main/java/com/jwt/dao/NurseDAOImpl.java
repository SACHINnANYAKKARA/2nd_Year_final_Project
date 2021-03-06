package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.jwt.model.Nurse;



@Repository
public class NurseDAOImpl implements NurseDAO{


	@Autowired
	private SessionFactory sessionFactory1;

	@Override
	public void addNurses(Nurse nurse) {
		sessionFactory1.getCurrentSession().saveOrUpdate(nurse);
		
	}

	@SuppressWarnings("unchecked")
	public List<Nurse> getAllNurse() {
		return sessionFactory1.getCurrentSession().createQuery("from Nurse")
				.list();
	}

	@Override
	public void deleteNurse(Integer NurseID) {
		Nurse nurse  = (Nurse) sessionFactory1.getCurrentSession().load(
				Nurse.class, NurseID);
		if (null != nurse) {
			this.sessionFactory1.getCurrentSession().delete(nurse);
		}
		
	}

	@Override
	public Nurse getNurse(int NurseID) {
		return (Nurse) sessionFactory1.getCurrentSession().get(
				Nurse.class, NurseID);
	}

	@Override
	public Nurse updateNurse(Nurse nurse) {
		sessionFactory1.getCurrentSession().update(nurse);
		return nurse;
	}
	
	


}
