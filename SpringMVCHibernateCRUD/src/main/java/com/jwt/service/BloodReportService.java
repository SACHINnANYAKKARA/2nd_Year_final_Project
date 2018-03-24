package com.jwt.service;

import java.util.List;

import com.jwt.model.BloodReport;

public interface BloodReportService {

	public void addBloodReport(BloodReport blood_Report);

	public List<BloodReport> getAllBloodReports();

	public void deleteBloodReports(Integer BloodReportId);

	public BloodReport getBloodReports(int BloodReportId);

	public BloodReport updateBloodReport(BloodReport blood_Report);
	
}
