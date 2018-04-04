package com.jwt.dao;

import java.util.List;

import com.jwt.model.Appoinment;

public interface AppoinmentDAO {

	public void addAppoinments(Appoinment appoinment);

	public List<Appoinment> getAllAppoinment();

	public void deleteAppoinment(Integer AppoinmentID);

	public Appoinment getAppoinment(int AppoinmentID);

	public Appoinment updateAppoinment(Appoinment appoinment);
	
}
