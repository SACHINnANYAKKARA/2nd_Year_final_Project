package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Doctor;


@Repository
public class DoctorDAOImpl implements DoctorDAO {

	@Autowired
	private SessionFactory sessionFactory1;

	@Override
	public void addDoctors(Doctor doctor) {
		sessionFactory1.getCurrentSession().saveOrUpdate(doctor);
		
	}

	@SuppressWarnings("unchecked")
	public List<Doctor> getAllDoctor() {
		return sessionFactory1.getCurrentSession().createQuery("from Doctor")
				.list();
	}

	@Override
	public void deleteDoctor(Integer DoctorID) {
		Doctor doctor  = (Doctor) sessionFactory1.getCurrentSession().load(
				Doctor.class, DoctorID);
		if (null != doctor) {
			this.sessionFactory1.getCurrentSession().delete(doctor);
		}
		
	}

	@Override
	public Doctor getDoctor(int DoctorID) {
		return (Doctor) sessionFactory1.getCurrentSession().get(
				Doctor.class, DoctorID);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		sessionFactory1.getCurrentSession().update(doctor);
		return doctor;
	}

}
