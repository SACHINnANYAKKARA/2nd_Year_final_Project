package com.jwt.service;

import java.util.List;

import com.jwt.model.Nurse;

public interface NurseService {

	public void addNurses(Nurse nurse);

	public List<Nurse> getAllNurse();

	public void deleteNurse(Integer NurseID);

	public Nurse getNurse(int NurseID);
	
	public  Nurse updateNurse(Nurse nurse);
	
}
