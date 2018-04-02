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



import com.jwt.model.BiochemistryTest;
import com.jwt.service.BiochemistryTestService;



@Controller
public class BiochemistryTestController {

	private static final Logger logger = Logger
			.getLogger(BiochemistryTestController.class);

	public BiochemistryTestController() {
		System.out.println("BiochemistryTestController()");
	}

	@Autowired
	private BiochemistryTestService biochemistryTestService;

	@RequestMapping(value = "/BiochemistryTestView")
	public ModelAndView listBiochemistryTests(ModelAndView model) throws IOException {
		List<BiochemistryTest> listBiochemistryTest = biochemistryTestService.getAllBiochemistryTests();
		model.addObject("listBiochemistryTest", listBiochemistryTest);
		model.setViewName("BiochemistryTestHome");
		return model;
	}
	
	@RequestMapping(value = "/newBiochemistryTest", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		BiochemistryTest biochemistryTest = new BiochemistryTest();
		model.addObject("biochemistryTest", biochemistryTest);
		model.setViewName("BiochemistryTestForm");
		return model;
   }

	@RequestMapping(value = "/saveBiochemistryTest", method = RequestMethod.POST)
	public ModelAndView saveBiochemistryTest(@ModelAttribute BiochemistryTest biochemistryTest) {
		if (biochemistryTest.getRegistration_no() == 0) { // if BioChemsistriy  id is 0 then creating the
			biochemistryTestService.addBiochemistryTest(biochemistryTest);
		} else {
			biochemistryTestService.addBiochemistryTest(biochemistryTest);
		}
		return new ModelAndView("redirect:/");
	}
	

	@RequestMapping(value = "/deleteBiochemistryTest", method = RequestMethod.GET)
	public ModelAndView deleteBiochemistryTest(HttpServletRequest request) {
		int BiochemistryTestId = Integer.parseInt(request.getParameter("registration_no"));
		biochemistryTestService.deleteBiochemistryTest(BiochemistryTestId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editBiochemistryTest", method = RequestMethod.GET)
	public ModelAndView editContactBiochemistryTest(HttpServletRequest request) {
		int BiochemistryTestid = Integer.parseInt(request.getParameter("registration_no"));
		BiochemistryTest biochemistryTest = biochemistryTestService.getBiochemistryTest(BiochemistryTestid);
		ModelAndView model = new ModelAndView("BiochemistryTestForm");
		model.addObject("biochemistryTest", biochemistryTest);
		
		return model;
	}
	
	
}
