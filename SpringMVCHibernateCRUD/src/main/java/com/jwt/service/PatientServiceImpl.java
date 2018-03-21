package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.PatientDAO;
import com.jwt.model.Patient;

@Service
@Transactional

public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDAO patientDAO;
	
	@Transactional
	public void addPatient(Patient patient) {
	
		patientDAO.addPatient(patient);
		
	}

	@Transactional
	public List<Patient> getAllPatients() {
		return patientDAO.getAllPatients();
	}

	@Transactional
	public void deletePatient(Integer PatientId) {
		patientDAO.deletePatient(PatientId);
		
	}

	
	public Patient getPatient(int PatientId) {
		return patientDAO.getPatient(PatientId);
	}

	
	public Patient updatePatient(Patient patient) {
		return patientDAO.updatePatient(patient);
	}
	
	public void setPatientDAO(PatientDAO patientDAO) {
		this.patientDAO = patientDAO;
	}

}
