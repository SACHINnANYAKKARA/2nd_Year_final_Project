package com.jwt.service;

import java.util.List;

import com.jwt.model.PatientFee;

public interface PatientFeeService {

	public void addPatientFee(PatientFee patientFee);

	public List<PatientFee> getAllPatientFee();

	public void deletePatientFee(Integer PatientFeeID);

	public PatientFee getPatientFee(int PatientFeeID);

	public PatientFee updatePatientFee(PatientFee patientFee);
	
	
}
