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



import com.jwt.model.Colonoscopy;
import com.jwt.service.ColonoscopyService;



@Controller
public class ColonoscopyController {

	private static final Logger logger = Logger
			.getLogger(ColonoscopyController.class);

	public ColonoscopyController() {
		System.out.println("ColonoscopyController()");
	}

	@Autowired
	private ColonoscopyService colonoscopyService;

	@RequestMapping(value = "/ColonoscopyView")
	public ModelAndView listColonoscopy(ModelAndView model) throws IOException {
		List<Colonoscopy> listColonoscopy = colonoscopyService.getAllColonoscopy();
		model.addObject("listColonoscopy", listColonoscopy);
		model.setViewName("ColonoscopyHome");
		return model;
	}
	
	@RequestMapping(value = "/newColonoscopy", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Colonoscopy colonoscopy = new Colonoscopy();
		model.addObject("colonoscopy", colonoscopy);
		model.setViewName("ColonoscopyForm");
		return model;
   }

	@RequestMapping(value = "/saveColonoscopy", method = RequestMethod.POST)
	public ModelAndView saveColonoscopy(@ModelAttribute Colonoscopy colonoscopy) {
		if (colonoscopy.getRegistration_no() == 0) { // if employee id is 0 then creating the
			colonoscopyService.addColonoscopy(colonoscopy);
		} else {
			colonoscopyService.updateColonoscopy(colonoscopy);
		}
		return new ModelAndView("redirect:/");
	}
	

	@RequestMapping(value = "/deleteColonoscopy", method = RequestMethod.GET)
	public ModelAndView deleteColonoscopy(HttpServletRequest request) {
		int colonoscopyID = Integer.parseInt(request.getParameter("registration_no"));
		colonoscopyService.deleteColonoscopy(colonoscopyID);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editColonoscopy", method = RequestMethod.GET)
	public ModelAndView editColonoscopy(HttpServletRequest request) {
		int colonoscopyID = Integer.parseInt(request.getParameter("registration_no"));
		Colonoscopy  colonoscopy = colonoscopyService.getColonoscopy(colonoscopyID);
		ModelAndView model = new ModelAndView("ColonoscopyForm");
		model.addObject("colonoscopy", colonoscopy);
		
		return model;
	}
	
}
