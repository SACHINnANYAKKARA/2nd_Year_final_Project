package com.jwt.service;

import java.util.List;

import com.jwt.model.Patient;

public interface PatientService {
	
	public void addPatient(Patient patient);

	public List<Patient> getAllPatients();

	public void deletePatient(Integer PatientId);

	public Patient getPatient(int PatientId);

	public Patient updatePatient(Patient patient);

}
