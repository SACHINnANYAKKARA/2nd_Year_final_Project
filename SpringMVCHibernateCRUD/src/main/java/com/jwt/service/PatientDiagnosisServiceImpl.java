package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.jwt.dao.PatientDiagnosisDAO;
import com.jwt.model.PatientDiagnosis;


@Service
@Transactional

public class PatientDiagnosisServiceImpl implements PatientDiagnosisService  {

	@Autowired
	private PatientDiagnosisDAO patientDiagnosisDAO;

	@Transactional
	public void addPatientDiagnosis(PatientDiagnosis diagnosis) {
		patientDiagnosisDAO.addPatientDiagnosis(diagnosis);
		
	}

	@Transactional
	public List<PatientDiagnosis> getAllPatientDiagnosis() {
		return patientDiagnosisDAO.getAllPatientDiagnosis();
	}

	@Transactional
	public void deletePatientDiagnosis(Integer PatientDiagnosisID) {
		patientDiagnosisDAO.deletePatientDiagnosis(PatientDiagnosisID);
		
	}

	@Override
	public PatientDiagnosis getPatientDiagnosis(int PatientDiagnosisID) {
		return patientDiagnosisDAO.getPatientDiagnosis(PatientDiagnosisID);
	}

	@Override
	public PatientDiagnosis updatePatientDiagnosis(
			PatientDiagnosis patientDiagnosis) {
		return patientDiagnosisDAO.updatePatientDiagnosis(patientDiagnosis);
	}

	public void setPatientDiagnosis(PatientDiagnosisDAO patientDiagnosisDAO) {
		this.patientDiagnosisDAO = patientDiagnosisDAO;
	}
	

}
