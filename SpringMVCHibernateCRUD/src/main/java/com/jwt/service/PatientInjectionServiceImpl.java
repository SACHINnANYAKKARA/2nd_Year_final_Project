package com.jwt.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.PatientInjectionDAO;
import com.jwt.model.PatientInjection;


@Service
@Transactional

public class PatientInjectionServiceImpl implements PatientInjectionService {

	@Autowired
	private PatientInjectionDAO patientInjectionDAO;


	@Transactional
	public void addPatientInjection(PatientInjection patientInjection) {

		patientInjectionDAO.addPatientInjection(patientInjection);
		
	}

	@Transactional
	public List<PatientInjection> getAllPatientInjections() {
		return patientInjectionDAO.getAllPatientInjections();
	}

	@Transactional
	public void deletePatientInjection(Integer PatientInjectionId) {
		patientInjectionDAO.deletePatientInjection(PatientInjectionId);
		
	}

	@Override
	public PatientInjection getPatientInjection(int PatientInjectionId) {
		return patientInjectionDAO.getPatientInjection(PatientInjectionId);
	}

	@Override
	public PatientInjection updatePatientInjection(
			PatientInjection patientInjection) {
		return patientInjectionDAO.updatePatientInjection(patientInjection);
	}
	
	public void setPatientInjection(PatientInjectionDAO patieInjectionDAO) {
		this.patientInjectionDAO=patieInjectionDAO;
	}

}
