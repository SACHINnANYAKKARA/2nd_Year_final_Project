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

import com.jwt.model.PatientDiagnosis;
import com.jwt.service.PatientDiagnosisService;

@Controller

public class PatientDiagnosisController {

	private static final Logger logger = Logger
			.getLogger(PatientDiagnosisController.class);

	public PatientDiagnosisController() {
		System.out.println("PatientDiagnosisController()");
	}

	@Autowired
	private PatientDiagnosisService patientDiagnosisService;

	@RequestMapping(value = "/PatientDiagnosisView")
	public ModelAndView listPatientDiagnosis(ModelAndView model) throws IOException {
		List<PatientDiagnosis> listPatientDiagnosis = patientDiagnosisService.getAllPatientDiagnosis();
		model.addObject("listPatientDiagnosis", listPatientDiagnosis);
		model.setViewName("PatientDiagnosisHome");
		return model;
	}
	
	@RequestMapping(value = "/newPatientDiagnosis", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		PatientDiagnosis patientDiagnosis = new PatientDiagnosis();
		model.addObject("patientDiagnosis", patientDiagnosis);
		model.setViewName("PatientDiagnosisForm");
		return model;
   }

	@RequestMapping(value = "/savePatientDiagnosis", method = RequestMethod.POST)
	public ModelAndView savePatientDiagnosis(@ModelAttribute PatientDiagnosis patientDiagnosis) {
		if (patientDiagnosis.getDiagnisys_no() == 0) { // if employee id is 0 then creating the
			patientDiagnosisService.addPatientDiagnosis(patientDiagnosis);
		} else {
			patientDiagnosisService.updatePatientDiagnosis(patientDiagnosis);
		}
		return new ModelAndView("redirect:/");
	}
	

	@RequestMapping(value = "/deletePatientDiagnosis", method = RequestMethod.GET)
	public ModelAndView deletePatientDiagnosis(HttpServletRequest request) {
		int PatientDiagnosisID = Integer.parseInt(request.getParameter("diagnisys_no"));
		patientDiagnosisService.deletePatientDiagnosis(PatientDiagnosisID);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editPatientDiagnosis", method = RequestMethod.GET)
	public ModelAndView editContactPatientDiagnosis(HttpServletRequest request) {
		int PatientDiagnosisID = Integer.parseInt(request.getParameter("diagnisys_no"));
		PatientDiagnosis patientDiagnosis = patientDiagnosisService.getPatientDiagnosis(PatientDiagnosisID);
		ModelAndView model = new ModelAndView("PatientDiagnosisForm");
		model.addObject("patientDiagnosis", patientDiagnosis);
		
		return model;
	}
	
}
