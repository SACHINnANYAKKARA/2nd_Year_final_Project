package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.RegistrationDAO;
import com.jwt.model.Registration;


@Service
@Transactional

public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationDAO registrationDAO;

	
	@Transactional
	public void addRegistration(Registration registration) {
		registrationDAO.addRegistration(registration);
		
	}


	@Transactional
	public List<Registration> getAllRegistrations() {
		return registrationDAO.getAllRegistrations();
	}


	@Transactional
	public void deleteRegistration(Integer registrationId) {
		registrationDAO.deleteRegistration(registrationId);
		
	}

	public Registration getRegistration(int registrationId) {
		return registrationDAO.getRegistration(registrationId);
	}
	

	public Registration updateRegistration(Registration registration) {
		return registrationDAO.updateRegistration(registration);
	}
	

	public void setRegistrationDAO(RegistrationDAO registrationDAO) {
		this.registrationDAO = registrationDAO;
	}
	
}
