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
	
	@Override
	public void addPatient(Patient patient) {
		sessionFactory1.getCurrentSession().saveOrUpdate(patient);
		
	}

	@SuppressWarnings("unchecked")
	public List<Patient> getAllPatients() {
		return sessionFactory1.getCurrentSession().createQuery("from Patient")
				.list();
	}

	@Override
	public void deletePatient(Integer PatientId) {
		
		Patient patient  = (Patient) sessionFactory1.getCurrentSession().load(
				Patient.class, PatientId );
		if (null != patient) {
			this.sessionFactory1.getCurrentSession().delete(patient);
		}
		
	}

	@Override
	public Patient getPatient(int PatientId) {
		return (Patient) sessionFactory1.getCurrentSession().get(
				Stock.class, PatientId);
	}

	@Override
	public Patient updatePatient(Patient patient) {
		sessionFactory1.getCurrentSession().update(patient);
		return patient;
	}
	
	
}
