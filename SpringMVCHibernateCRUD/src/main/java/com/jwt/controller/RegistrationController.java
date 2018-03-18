package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




import com.jwt.model.Registration;
import com.jwt.service.RegistrationService;


@Controller
public class RegistrationController {

	private static final Logger logger = Logger
			.getLogger(RegistrationController.class);

	public RegistrationController() {
		System.out.println("RegistrationController()");
	}

	@Autowired
	private RegistrationService registrationService;

	/*@RequestMapping(value = "/")
	public ModelAndView listRegistration(ModelAndView model) throws IOException {
		List<Registration> listRegistration = registrationService.getAllRegistrations();
		model.addObject("listRegistration", listRegistration);
		model.setViewName("home");
		return model;
	}*/

	@RequestMapping(value = "/newRegistration", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Registration registration = new Registration();
		model.addObject("registration", registration );
		model.setViewName("EmployeeForm");
		return model;
   }

	@RequestMapping(value = "/saveRegistration", method = RequestMethod.POST)
	public ModelAndView saveRegistration(@ModelAttribute Registration registration) {
		if (registration.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			registrationService.addRegistration(registration);
		} else {
			registrationService.updateRegistration(registration);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteRegistration", method = RequestMethod.GET)
	public ModelAndView deleteRegistration(HttpServletRequest request) {
		int registrationId = Integer.parseInt(request.getParameter("id"));
		registrationService.deleteRegistration(registrationId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editRegistration", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int registrationId = Integer.parseInt(request.getParameter("id"));
		Registration registration = registrationService.getRegistration(registrationId);
		ModelAndView model = new ModelAndView("EmployeeForm");
		model.addObject("registration", registration);

		return model;
	}

	
}
