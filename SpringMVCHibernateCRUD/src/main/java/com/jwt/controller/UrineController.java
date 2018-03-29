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





import com.jwt.model.Urine;
import com.jwt.service.UrineService;

@Controller

public class UrineController {

	private static final Logger logger = Logger
			.getLogger(UrineController.class);

	public UrineController() {
		System.out.println("UrineController()");
	}

	@Autowired
	private UrineService urineService;

	@RequestMapping(value = "/UrineView")
	public ModelAndView listUrine(ModelAndView model) throws IOException {
		List<Urine> listUrine = urineService.getAllUrines();
		model.addObject("listUrine", listUrine);
		model.setViewName("PatientFeeForm");
		return model;
	}
	
	
	
	
}
