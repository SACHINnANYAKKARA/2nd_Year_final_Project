package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;






import com.jwt.model.Patient;
import com.jwt.model.Stock;


@Repository
public class PatientDAOImpl implements PatientDAO {

	@Autowired
	private SessionFactory sessionFactory1;    
	
	
	public void addPatient(Patient patient) {
		sessionFactory1.getCurrentSession().saveOrUpdate(patient);
		
	}

	@SuppressWarnings("unchecked")
	public List<Patient> getAllPatients() {
		Stock stock  = (Stock) sessionFactory1.getCurrentSession().load(
				Stock.class, stockId);
		if (null != stock) {
			this.sessionFactory1.getCurrentSession().delete(stock);
		}
	}

	@Override
	public void deletePatient(Integer PatientId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Patient getPatient(int PatientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
