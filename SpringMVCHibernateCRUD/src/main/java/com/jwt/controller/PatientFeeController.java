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




import com.jwt.model.PatientFee;
import com.jwt.service.PatientFeeService;


@Controller
public class PatientFeeController {

	private static final Logger logger = Logger
			.getLogger(PatientFeeController.class);

	public PatientFeeController() {
		System.out.println("PatientFeeController()");
	}

	@Autowired
	private PatientFeeService patieFeeService;

	@RequestMapping(value = "/PatientFeeView")
	public ModelAndView listPatientFees(ModelAndView model) throws IOException {
		List<PatientFee> listPatientFee = patieFeeService.getAllPatientFee();
		model.addObject("listPatientFee", listPatientFee);
		model.setViewName("PatientFeeHome");
		return model;
	}
	
	@RequestMapping(value = "/newPatientFee", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		PatientFee patientFee = new PatientFee();
		model.addObject("patientFee", patientFee);
		model.setViewName("PatientFeeForm");
		return model;
   }

	@RequestMapping(value = "/savePatientFee", method = RequestMethod.POST)
	public ModelAndView savePatientFee(@ModelAttribute PatientFee patientFee) {
		if (patientFee.getRecipt_no() == 0) { // if employee id is 0 then creating the
			patieFeeService.addPatientFee(patientFee);
		} else {
			patieFeeService.updatePatientFee(patientFee);
		}
		return new ModelAndView("redirect:/");
	}
	

	@RequestMapping(value = "/deletePatientFee", method = RequestMethod.GET)
	public ModelAndView deletePatientFee(HttpServletRequest request) {
		int PatientFeeID = Integer.parseInt(request.getParameter("recipt_no"));
		patieFeeService.deletePatientFee(PatientFeeID);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editPatientFee", method = RequestMethod.GET)
	public ModelAndView editContactPatient(HttpServletRequest request) {
		int PatientFeeID = Integer.parseInt(request.getParameter("recipt_no"));
		PatientFee patientFee = patieFeeService.getPatientFee(PatientFeeID);
		ModelAndView model = new ModelAndView("PatientFeeForm");
		model.addObject("patientFee", patientFee);
		
		return model;
	}
	
	
}
