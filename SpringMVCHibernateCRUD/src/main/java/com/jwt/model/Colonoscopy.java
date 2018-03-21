package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "colonoscopy")

public class Colonoscopy implements Serializable {

	private static final long serialVersionUID = -3465854174584308847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int registration_no;

	@Column
	private String date;
	
	@Column
	private String anal_canal;
	
	@Column
	private String rectum;
	
	@Column
	private String sigmoid_colon;
	
	@Column
	private String hepatic_flexure;
	
	@Column
	private String caecum;
	

	@Column
	private String terminal_ileum;


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


	public String getAnal_canal() {
		return anal_canal;
	}


	public void setAnal_canal(String anal_canal) {
		this.anal_canal = anal_canal;
	}


	public String getRectum() {
		return rectum;
	}


	public void setRectum(String rectum) {
		this.rectum = rectum;
	}


	public String getSigmoid_colon() {
		return sigmoid_colon;
	}


	public void setSigmoid_colon(String sigmoid_colon) {
		this.sigmoid_colon = sigmoid_colon;
	}


	public String getHepatic_flexure() {
		return hepatic_flexure;
	}


	public void setHepatic_flexure(String hepatic_flexure) {
		this.hepatic_flexure = hepatic_flexure;
	}


	public String getCaecum() {
		return caecum;
	}


	public void setCaecum(String caecum) {
		this.caecum = caecum;
	}


	public String getTerminal_ileum() {
		return terminal_ileum;
	}


	public void setTerminal_ileum(String terminal_ileum) {
		this.terminal_ileum = terminal_ileum;
	}
	
	
}
