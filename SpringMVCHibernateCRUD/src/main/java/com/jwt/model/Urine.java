package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "urine")

public class Urine implements Serializable {

	private static final long serialVersionUID = -3466713074586302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int registration_no;
	
	@Column
	private String date;
	
	@Column
	private int appearance;
	
	@Column
	private int specific_gravity;
	
	
	@Column
	private int albumin;
	
	@Column
	private int suger;
	
	@Column
	private int rbcs_hpe;
	
	
	@Column
	private int wbcs;
	
	@Column
	private int bile_salts;
	
	@Column
	private int acetone;
	
	
	@Column
	private int total_value;
	
	@Column
	private int pregnancy;

	public int getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(int registration_no) {
		this.registration_no = registration_no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAppearance() {
		return appearance;
	}

	public void setAppearance(int appearance) {
		this.appearance = appearance;
	}

	public int getSpecific_gravity() {
		return specific_gravity;
	}

	public void setSpecific_gravity(int specific_gravity) {
		this.specific_gravity = specific_gravity;
	}

	public int getAlbumin() {
		return albumin;
	}

	public void setAlbumin(int albumin) {
		this.albumin = albumin;
	}

	public int getSuger() {
		return suger;
	}

	public void setSuger(int suger) {
		this.suger = suger;
	}

	public int getRbcs_hpe() {
		return rbcs_hpe;
	}

	public void setRbcs_hpe(int rbcs_hpe) {
		this.rbcs_hpe = rbcs_hpe;
	}

	public int getWbcs() {
		return wbcs;
	}

	public void setWbcs(int wbcs) {
		this.wbcs = wbcs;
	}

	public int getBile_salts() {
		return bile_salts;
	}

	public void setBile_salts(int bile_salts) {
		this.bile_salts = bile_salts;
	}

	public int getAcetone() {
		return acetone;
	}

	public void setAcetone(int acetone) {
		this.acetone = acetone;
	}

	public int getTotal_value() {
		return total_value;
	}

	public void setTotal_value(int total_value) {
		this.total_value = total_value;
	}

	public int getPregnancy() {
		return pregnancy;
	}

	public void setPregnancy(int pregnancy) {
		this.pregnancy = pregnancy;
	}
	
	

}
