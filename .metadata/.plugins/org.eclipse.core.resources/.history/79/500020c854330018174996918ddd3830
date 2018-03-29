package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_diet_advice")

public class PatientDiet implements Serializable {
	
	private static final long serialVersionUID = -3492856774585601247L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int recipt_no;


	@Column
	private String diat_advice;


	public int getRecipt_no() {
		return recipt_no;
	}


	public void setRecipt_no(int recipt_no) {
		this.recipt_no = recipt_no;
	}


	public String getDiat_advice() {
		return diat_advice;
	}


	public void setDiat_advice(String diat_advice) {
		this.diat_advice = diat_advice;
	}
	
}
