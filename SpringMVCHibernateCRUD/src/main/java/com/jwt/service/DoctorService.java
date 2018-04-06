package com.jwt.service;

import java.util.List;

import com.jwt.model.Doctor;

public interface DoctorService {

	public void addDoctors(Doctor doctor);

	public List<Doctor> getAllDoctor();

	public void deleteDoctor(Integer DoctorID);

	public Doctor getDoctor(int  DoctorID);

	public  Doctor updateDoctor(Doctor doctor);
	
}
