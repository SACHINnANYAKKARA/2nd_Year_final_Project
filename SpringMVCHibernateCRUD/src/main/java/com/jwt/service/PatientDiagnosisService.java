package com.jwt.service;

import java.util.List;

import com.jwt.model.PatientDiagnosis;

public interface PatientDiagnosisService {

	public void addPatientDiagnosis(PatientDiagnosis diagnosis);

	public List<PatientDiagnosis> getAllPatientDiagnosis();

	public void deletePatientDiagnosis(Integer PatientDiagnosisID);

	public PatientDiagnosis getPatientDiagnosis(int PatientDiagnosisID);

	public PatientDiagnosis updatePatientDiagnosis(PatientDiagnosis patientDiagnosis);
	
}
