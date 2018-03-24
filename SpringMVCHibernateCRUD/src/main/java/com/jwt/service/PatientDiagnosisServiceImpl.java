package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.BloodReportDAO;
import com.jwt.dao.PatientDiagnosisDAO;
import com.jwt.model.PatientDiagnosis;


@Service
@Transactional

public class PatientDiagnosisServiceImpl implements PatientDiagnosisService  {

	@Autowired
	private PatientDiagnosisDAO patientDiagnosisDAO;

	@Override
	public void addPatientDiagnosis(PatientDiagnosis diagnosis) {
		patientDiagnosisDAO.addPatientDiagnosis(diagnosis);
		
	}

	@Override
	public List<PatientDiagnosis> getAllPatientDiagnosis() {
		return patientDiagnosisDAO.getAllPatientDiagnosis();
	}

	@Override
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