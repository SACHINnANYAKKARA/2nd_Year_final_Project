package com.jwt.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.AppoinmentDAO;
import com.jwt.model.Appoinment;



@Service
@Transactional

public class AppoinmentServiceImpl implements AppoinmentService {

	@Autowired
	private AppoinmentDAO appoinmentDAO;

	@Transactional
	public void addAppoinments(Appoinment appoinment) {
		appoinmentDAO.addAppoinments(appoinment);
		
	}

	@Transactional
	public List<Appoinment> getAllAppoinment() {
		return appoinmentDAO.getAllAppoinment();
	}

	@Transactional
	public void deleteAppoinment(Integer AppoinmentID) {
		appoinmentDAO.deleteAppoinment(AppoinmentID);
		
	}

	
	public Appoinment getAppoinment(int AppoinmentID) {
		return appoinmentDAO.getAppoinment(AppoinmentID);
	}

	
	public Appoinment updateAppoinment(Appoinment appoinment) {
		return appoinmentDAO.updateAppoinment(appoinment);
	}
	
	public void setAppoinment(AppoinmentDAO appoinmentDAO) {
		this.appoinmentDAO = appoinmentDAO;
	}


}
