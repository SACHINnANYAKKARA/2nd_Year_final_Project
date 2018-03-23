package com.jwt.dao;

import java.util.List;

import com.jwt.model.PatientMedicine;

public interface PatientMedicineDAO {

	public void addPatientMedicine(PatientMedicine patientMedicine);

	public List<PatientMedicine> getAllPatientMedicine();

	public void deletePatientMedicine(Integer PatientMedicineID);

	public PatientMedicine getPatientMedicine(int PatientMedicineID);

	public PatientMedicine updatePatientMedicine(PatientMedicine patientMedicine);
	
}
