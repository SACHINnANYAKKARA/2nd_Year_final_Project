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




import com.jwt.model.PatientDiet;
import com.jwt.service.PatientDietService;


@Controller
public class PatientDietController {

	
	private static final Logger logger = Logger
			.getLogger(PatientDietController.class);

	public PatientDietController() {
		System.out.println("PPatientDietController()");
	}

	@Autowired
	private PatientDietService patientDietService;

	@RequestMapping(value = "/DietView")
	public ModelAndView listPatientDiets(ModelAndView model) throws IOException {
		List<PatientDiet> listPatientDiet = patientDietService.getAllPatientDiets();
		model.addObject("listPatientDiet", listPatientDiet);
		model.setViewName("DietHome");
		return model;
	}
	
	@RequestMapping(value = "/newPatientDiet", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		PatientDiet patientDiet = new PatientDiet();
		model.addObject("patientDiet", patientDiet);
		model.setViewName("DietForm");
		return model;
   }

	@RequestMapping(value = "/savePatientDiet", method = RequestMethod.POST)
	public ModelAndView savePatientDiet(@ModelAttribute PatientDiet patientDiet) {
		if (patientDiet.getDiagnosis_no() == 0) { // if employee id is 0 then creating the
			patientDietService.addPatientDiet(patientDiet);
		} else {
			patientDietService.updatePatientDiet(patientDiet);
		}
		return new ModelAndView("redirect:/");
	}
	

	@RequestMapping(value = "/deletePatientDiet", method = RequestMethod.GET)
	public ModelAndView deletePatientDiet(HttpServletRequest request) {
		int PatientDietId = Integer.parseInt(request.getParameter("diagnosis_no"));
		patientDietService.deletePatientDiets(PatientDietId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editPatientDiet", method = RequestMethod.GET)
	public ModelAndView editContactPatient(HttpServletRequest request) {
		int PatientDietId = Integer.parseInt(request.getParameter("diagnosis_no"));
		PatientDiet patientDiet = patientDietService.getPatientDiets(PatientDietId);
		ModelAndView model = new ModelAndView("DietForm");
		model.addObject("patientDiet", patientDiet);
		
		return model;
	}
	
	
	
}
