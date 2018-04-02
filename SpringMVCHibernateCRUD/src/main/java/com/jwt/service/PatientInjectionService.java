package com.jwt.service;

import java.util.List;

import com.jwt.model.PatientInjection;


public interface PatientInjectionService {

	public void addPatientInjection(PatientInjection patientInjection);

	public List<PatientInjection> getAllPatientInjections();

	public void deletePatientInjection(Integer PatientInjectionId);

	public PatientInjection getPatientInjection(int PatientInjectionId);

	public PatientInjection updatePatientInjection(PatientInjection patientInjection );
	
}
