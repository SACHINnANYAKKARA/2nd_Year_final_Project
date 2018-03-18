package com.jwt.service;

import java.util.List;



import com.jwt.model.Registration;

public interface RegistrationService {

	public void addRegistration(Registration registration);

	public List<Registration> getAllRegistrations();

	public void deleteRegistration(Integer registrationId);

	public Registration getRegistration(int registrationId);

	public Registration updateRegistration(Registration registration);
	
}
