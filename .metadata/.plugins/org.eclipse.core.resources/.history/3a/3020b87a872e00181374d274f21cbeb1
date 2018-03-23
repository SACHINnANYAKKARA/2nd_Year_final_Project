package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_medicine")

public class Patient_Medicine implements Serializable {

	private static final long serialVersionUID = -3462813074585302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dignosis_no;

	@Column
	private int medicine_no;
	
	@Column
	private String medicine_name;
	
	@Column
	private String precaution;
	
	@Column
	private int no_of_doses;

	public int getDignosis_no() {
		return dignosis_no;
	}

	public void setDignosis_no(int dignosis_no) {
		this.dignosis_no = dignosis_no;
	}

	public int getMedicine_no() {
		return medicine_no;
	}

	public void setMedicine_no(int medicine_no) {
		this.medicine_no = medicine_no;
	}

	public String getMedicine_name() {
		return medicine_name;
	}

	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}

	public String getPrecaution() {
		return precaution;
	}

	public void setPrecaution(String precaution) {
		this.precaution = precaution;
	}

	public int getNo_of_doses() {
		return no_of_doses;
	}

	public void setNo_of_doses(int no_of_doses) {
		this.no_of_doses = no_of_doses;
	}
	
    
	
}
