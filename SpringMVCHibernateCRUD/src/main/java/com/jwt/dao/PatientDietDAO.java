package com.jwt.dao;

import java.util.List;

import com.jwt.model.PatientDiet;

public interface PatientDietDAO {
	
	public void addPatientDiet(PatientDiet patientDiet);

	public List<PatientDiet> getAllPatientDiets();

	public void deletePatientDiets(Integer PatientDietId);

	public PatientDiet getPatientDiets(int PatientDietId);

	public PatientDiet updatePatientDiet(PatientDiet patientDiet);

}
