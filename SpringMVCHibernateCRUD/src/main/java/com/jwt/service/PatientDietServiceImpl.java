package com.jwt.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.jwt.dao.PatientDietDAO;
import com.jwt.model.PatientDiet;


@Service
@Transactional

public class PatientDietServiceImpl implements PatientDietService {

	@Autowired
	private PatientDietDAO patientDietDAO;

	@Transactional
	public void addPatientDiet(PatientDiet patientDiet) {
		patientDietDAO.addPatientDiet(patientDiet);
		
	}

	@Transactional
	public List<PatientDiet> getAllPatientDiets() {
		return patientDietDAO.getAllPatientDiets();
	}

	@Transactional
	public void deletePatientDiets(Integer PatientDietId) {
		patientDietDAO.deletePatientDiets(PatientDietId);
		
	}

	@Override
	public PatientDiet getPatientDiets(int PatientDietId) {
		return patientDietDAO.getPatientDiets(PatientDietId);
	}

	@Override
	public PatientDiet updatePatientDiet(PatientDiet patientDiet) {
		return patientDietDAO.updatePatientDiet(patientDiet);
	}

	public void setPatientDietDAO(PatientDietDAO patientDietDAO) {
		this.patientDietDAO = patientDietDAO;
	}

	
}
