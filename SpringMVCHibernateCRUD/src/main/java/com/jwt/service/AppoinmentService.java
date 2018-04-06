package com.jwt.service;

import java.util.List;

import com.jwt.model.Appoinment;

public interface AppoinmentService {

	public void addAppoinments(Appoinment appoinment);

	public List<Appoinment> getAllAppoinment();

	public void deleteAppoinment(Integer AppoinmentID);

	public Appoinment getAppoinment(int AppoinmentID);

	public Appoinment updateAppoinment(Appoinment appoinment);
	
}
