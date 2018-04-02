package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.jwt.model.PatientMedicine;




@Repository

public class PatientMedicineImpl implements PatientMedicineDAO {

	@Autowired
	private SessionFactory sessionFactory1;

	@Override
	public void addPatientMedicine(PatientMedicine patientMedicine) {
		sessionFactory1.getCurrentSession().saveOrUpdate(patientMedicine);
		
	}

	@SuppressWarnings("unchecked")
	public List<PatientMedicine> getAllPatientMedicine() {
		return sessionFactory1.getCurrentSession().createQuery("from PatientMedicine")
				.list();
	}

	@Override
	public void deletePatientMedicine(Integer PatientMedicineID) {
		
		PatientMedicine patienMedicine  = (PatientMedicine) sessionFactory1.getCurrentSession().load(
				PatientMedicine.class, PatientMedicineID );
		if (null != patienMedicine) {
			this.sessionFactory1.getCurrentSession().delete(patienMedicine);
		}
		
	}

	@Override
	public PatientMedicine getPatientMedicine(int PatientMedicineID) {
		return (PatientMedicine) sessionFactory1.getCurrentSession().get(
				PatientMedicine.class, PatientMedicineID);
	}

	@Override
	public PatientMedicine updatePatientMedicine(PatientMedicine patientMedicine) {
		sessionFactory1.getCurrentSession().update(patientMedicine);
		return patientMedicine;
	}
	
	
}
