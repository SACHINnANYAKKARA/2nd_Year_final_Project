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





import com.jwt.model.Nurse;
import com.jwt.model.PatientDiet;
import com.jwt.service.NurseService;
import com.jwt.service.PatientDietService;


@Controller
public class NurseController {

	private static final Logger logger = Logger
			.getLogger(NurseController.class);

	public NurseController() {
		System.out.println("NurseController");
	}

	@Autowired
	private NurseService nurseService;

	@RequestMapping(value = "/NurseView")
	public ModelAndView listNurses(ModelAndView model) throws IOException {
		List<Nurse> listNurse = nurseService.getAllNurse();
		model.addObject("listNurse", listNurse);
		model.setViewName("NurseHome");
		return model;
	}
	
	@RequestMapping(value = "/newNurse", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Nurse nurse = new Nurse();
		model.addObject("nurse", nurse);
		model.setViewName("NurseForm");
		return model;
   }

	@RequestMapping(value = "/saveNurse", method = RequestMethod.POST)
	public ModelAndView saveNurse(@ModelAttribute Nurse nurse) {
		if (nurse.getNurse_Id() == 0) { // if employee id is 0 then creating the
			nurseService.addNurses(nurse);
		} else {
			nurseService.updateNurse(nurse);
		}
		return new ModelAndView("redirect:/");
	}
	

	@RequestMapping(value = "/deleteNurse", method = RequestMethod.GET)
	public ModelAndView deleteNurse(HttpServletRequest request) {
		int NurseID = Integer.parseInt(request.getParameter("Nurse_Id"));
		nurseService.deleteNurse(NurseID);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editPatientDiet", method = RequestMethod.GET)
	public ModelAndView editContactNurse(HttpServletRequest request) {
		int NurseID = Integer.parseInt(request.getParameter("Nurse_Id"));
		Nurse nurse = nurseService.getNurse(NurseID);
		ModelAndView model = new ModelAndView("NurseForm");
		model.addObject("nurse", nurse);
		
		return model;
	}
	
	
}
