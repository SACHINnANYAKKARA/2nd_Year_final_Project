package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




import com.jwt.dao.BloodReportDAO;
import com.jwt.model.BloodReport;


@Service
@Transactional

public class BloodReportServiceImpl implements BloodReportService {

	@Autowired
	private BloodReportDAO bloodReportDAO;

	@Transactional
	public void addBloodReport(BloodReport blood_Report) {
		
		bloodReportDAO.addBloodReport(blood_Report);
		
	}

	@Transactional
	public List<BloodReport> getAllBloodReports() {
		return bloodReportDAO.getAllBloodReports();
	}

	@Transactional
	public void deleteBloodReports(Integer BloodReportId) {
		bloodReportDAO.deleteBloodReports(BloodReportId);
		
	}

	@Override
	public BloodReport getBloodReports(int BloodReportId) {
		return bloodReportDAO.getBloodReports(BloodReportId);
	}

	@Override
	public BloodReport updateBloodReport(BloodReport blood_Report) {
		return bloodReportDAO.updateBloodReport(blood_Report);
	}
	
	public void setBloodReportDAO(BloodReportDAO bloodReportDAO) {
		this.bloodReportDAO = bloodReportDAO;
	}

	
	
}
