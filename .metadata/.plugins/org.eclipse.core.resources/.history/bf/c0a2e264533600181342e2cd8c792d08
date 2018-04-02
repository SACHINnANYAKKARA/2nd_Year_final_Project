package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_injection_dates")

public class PatientInjection implements Serializable {

	private static final long serialVersionUID = -3462899964585302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dignosis_no;

	@Column
	private String injection_date;
	
	@Column
	private String status;

	public int getDignosis_no() {
		return dignosis_no;
	}

	public void setDignosis_no(int dignosis_no) {
		this.dignosis_no = dignosis_no;
	}

	public String getInjection_date() {
		return injection_date;
	}

	public void setInjection_date(String injection_date) {
		this.injection_date = injection_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
