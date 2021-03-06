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



import com.jwt.model.BloodReport;
import com.jwt.service.BloodReportService;



@Controller

public class BloodReportController {

	private static final Logger logger = Logger
			.getLogger(BloodReportController.class);

	public BloodReportController() {
		System.out.println("BloodReportController()");
	}

	@Autowired
	private BloodReportService bloodReportService;

	@RequestMapping(value = "/BloodReportView")
	public ModelAndView listBloodReports(ModelAndView model) throws IOException {
		List<BloodReport> listBloodReport = bloodReportService.getAllBloodReports();
		model.addObject("listBloodReport", listBloodReport);
		model.setViewName("BloodReportHome");
		return model;
	}
	
	@RequestMapping(value = "/newBloodReport", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		BloodReport bloodReport = new BloodReport();
		model.addObject("bloodReport", bloodReport);
		model.setViewName("BloodReportForm");
		return model;
   }

	@RequestMapping(value = "/saveBloodReport", method = RequestMethod.POST)
	public ModelAndView saveBloodReport(@ModelAttribute BloodReport bloodReport) {
		if (bloodReport.getRegistration_no() == 0) { // if employee id is 0 then creating the
			bloodReportService.addBloodReport(bloodReport);
		} else {
			bloodReportService.updateBloodReport(bloodReport);
		}
		return new ModelAndView("redirect:/");
	}
	

	@RequestMapping(value = "/deleteBloodReport", method = RequestMethod.GET)
	public ModelAndView deleteBloodReport(HttpServletRequest request) {
		int BloodReportId = Integer.parseInt(request.getParameter("registration_no"));
		bloodReportService.deleteBloodReports(BloodReportId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editBloodReport", method = RequestMethod.GET)
	public ModelAndView editContactBloodReport(HttpServletRequest request) {
		int BloodReportId = Integer.parseInt(request.getParameter("registration_no"));
		BloodReport bloodReport = bloodReportService.getBloodReports(BloodReportId);
		ModelAndView model = new ModelAndView("BloodReportForm");
		model.addObject("bloodReport", bloodReport);
		
		return model;
	}
	
}
