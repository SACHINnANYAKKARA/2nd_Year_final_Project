package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appoinment_tbl")

public class Appoinment implements Serializable {

	private static final long serialVersionUID = -3465276454584502847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Appoinment_Id;

	@Column
	private String patient_name;
	
	@Column
	private String doctor_name;
	
	@Column
	private String total_price;

	public int getAppoinment_Id() {
		return Appoinment_Id;
	}

	public void setAppoinment_Id(int appoinment_Id) {
		Appoinment_Id = appoinment_Id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getTotal_price() {
		return total_price;
	}

	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}
	
	

}
