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


import com.jwt.model.PatientInjection;
import com.jwt.service.PatientInjectionService;


@Controller
public class PatientInjectionController {

	private static final Logger logger = Logger
			.getLogger(PatientInjectionController.class);

	public PatientInjectionController() {
		System.out.println("PatientInjectionController()");
	}

	@Autowired
	private PatientInjectionService patientInjectionService;

	@RequestMapping(value = "/PatientInjectionView")
	public ModelAndView listPatientInjections(ModelAndView model) throws IOException {
		List<PatientInjection> listPatientInjection = patientInjectionService.getAllPatientInjections();
		model.addObject("listPatientInjection", listPatientInjection);
		model.setViewName("PatientInjectionHome");
		return model;
	}
	
	@RequestMapping(value = "/newPatientInjection", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		PatientInjection patientInjection = new PatientInjection();
		model.addObject("patientInjection",  patientInjection);
		model.setViewName("PatientInjectionForm");
		return model;
   }

	@RequestMapping(value = "/savePatientInjection", method = RequestMethod.POST)
	public ModelAndView savePatientInjection(@ModelAttribute PatientInjection patientInjection) {
		if (patientInjection.getDignosis_no() == 0) { // if employee id is 0 then creating the
			patientInjectionService.addPatientInjection(patientInjection);
		} else {
			patientInjectionService.updatePatientInjection(patientInjection);
		}
		return new ModelAndView("redirect:/");
	}
	

	@RequestMapping(value = "/deletePatientInjection", method = RequestMethod.GET)
	public ModelAndView deletePatientInjection(HttpServletRequest request) {
		int PatientInjectionId = Integer.parseInt(request.getParameter("dignosis_no"));
		patientInjectionService.deletePatientInjection(PatientInjectionId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editPatientInjection", method = RequestMethod.GET)
	public ModelAndView editContactPatientInjection(HttpServletRequest request) {
		int PatientInjectionId = Integer.parseInt(request.getParameter("dignosis_no"));
		PatientInjection patientInjection = patientInjectionService.getPatientInjection(PatientInjectionId);
		ModelAndView model = new ModelAndView("PatientInjectionForm");
		model.addObject("patientInjection", patientInjection);
		return model;
	}
	
	
}
