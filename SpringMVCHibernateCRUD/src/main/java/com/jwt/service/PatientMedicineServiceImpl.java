package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.PatientMedicineDAO;
import com.jwt.model.PatientMedicine;



@Service
@Transactional


public class PatientMedicineServiceImpl implements PatientMedicineService {

	@Autowired
	private PatientMedicineDAO patientMedicineDAO;

	@Transactional
	public void addPatientMedicine(PatientMedicine patientMedicine) {
		patientMedicineDAO.addPatientMedicine(patientMedicine);
		
	}

	@Transactional
	public List<PatientMedicine> getAllPatientMedicine() {
		return patientMedicineDAO.getAllPatientMedicine();
	}

	@Transactional
	public void deletePatientMedicine(Integer PatientMedicineID) {
		patientMedicineDAO.deletePatientMedicine(PatientMedicineID);
		
	}

	@Override
	public PatientMedicine getPatientMedicine(int PatientMedicineID) {
		return patientMedicineDAO.getPatientMedicine(PatientMedicineID);
	}

	@Override
	public PatientMedicine updatePatientMedicine(PatientMedicine patientMedicine) {
		return patientMedicineDAO.updatePatientMedicine(patientMedicine);
	}

	public void setPatientMedicine(PatientMedicineDAO patientMedicineDAO) {
		this.patientMedicineDAO = patientMedicineDAO;
	}
	
}
