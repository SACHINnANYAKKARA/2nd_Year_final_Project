package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.BloodReport;



@Repository

public class BloodReportDAOImpl implements BloodReportDAO {


		@Autowired
		private SessionFactory sessionFactory1;

		@Override
		public void addBloodReport(BloodReport blood_Report) {
			sessionFactory1.getCurrentSession().saveOrUpdate(blood_Report);
		}

		@SuppressWarnings("unchecked")
		public List<BloodReport> getAllBloodReports() {
			return sessionFactory1.getCurrentSession().createQuery("from BloodReport")
					.list();
		}

		@Override
		public void deleteBloodReports(Integer BloodReportId) {
			
			BloodReport blood_Report  = (BloodReport) sessionFactory1.getCurrentSession().load(
					BloodReport.class, BloodReportId);
			if (null != blood_Report) {
				this.sessionFactory1.getCurrentSession().delete(blood_Report);
			}
			
		}

		@Override
		public BloodReport getBloodReports(int BloodReportId) {
			return (BloodReport) sessionFactory1.getCurrentSession().get(
					BloodReport.class, BloodReportId);
		}

		@Override
		public BloodReport updateBloodReport(BloodReport blood_Report) {
			sessionFactory1.getCurrentSession().update(blood_Report);
			return blood_Report;
		}    
		
	
}
