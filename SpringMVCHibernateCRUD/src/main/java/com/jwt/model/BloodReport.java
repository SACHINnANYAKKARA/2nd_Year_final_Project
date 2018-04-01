package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blood_report")

public class BloodReport implements Serializable {

	private static final long serialVersionUID = -3465252074584502847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int registration_no;

	@Column
	private String date;
	
	@Column
	private String haemoglobin;
	
	@Column
	private String tlc;
	
	@Column
	private String neutrophils;
	
	@Column
	private String eosinophils;
	
	@Column
	private String monocytes;
	
	@Column
	private String basophils;
	
	@Column
	private String other;
	
	@Column
	private String erythrocyte_sedimentation;
	
	@Column
	private String peripheral_blood_film;
	
	@Column
	private String haematocrit_pcv;
	
	@Column
	private String total_rbc_count;
	
	@Column
	private String platelets;
	
	@Column
	private String blood_group;
	
	@Column
	private String rhesus;
	
	@Column
	private String hiv;
	
	@Column
	private String hepatitis;

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

	public String getHaemoglobin() {
		return haemoglobin;
	}

	public void setHaemoglobin(String haemoglobin) {
		this.haemoglobin = haemoglobin;
	}

	public String getTlc() {
		return tlc;
	}

	public void setTlc(String tlc) {
		this.tlc = tlc;
	}

	public String getNeutrophils() {
		return neutrophils;
	}

	public void setNeutrophils(String neutrophils) {
		this.neutrophils = neutrophils;
	}

	public String getEosinophils() {
		return eosinophils;
	}

	public void setEosinophils(String eosinophils) {
		this.eosinophils = eosinophils;
	}

	public String getMonocytes() {
		return monocytes;
	}

	public void setMonocytes(String monocytes) {
		this.monocytes = monocytes;
	}

	public String getBasophils() {
		return basophils;
	}

	public void setBasophils(String basophils) {
		this.basophils = basophils;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getErythrocyte_sedimentation() {
		return erythrocyte_sedimentation;
	}

	public void setErythrocyte_sedimentation(String erythrocyte_sedimentation) {
		this.erythrocyte_sedimentation = erythrocyte_sedimentation;
	}

	public String getPeripheral_blood_film() {
		return peripheral_blood_film;
	}

	public void setPeripheral_blood_film(String peripheral_blood_film) {
		this.peripheral_blood_film = peripheral_blood_film;
	}

	public String getHaematocrit_pcv() {
		return haematocrit_pcv;
	}

	public void setHaematocrit_pcv(String haematocrit_pcv) {
		this.haematocrit_pcv = haematocrit_pcv;
	}

	public String getTotal_rbc_count() {
		return total_rbc_count;
	}

	public void setTotal_rbc_count(String total_rbc_count) {
		this.total_rbc_count = total_rbc_count;
	}

	public String getPlatelets() {
		return platelets;
	}

	public void setPlatelets(String platelets) {
		this.platelets = platelets;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getRhesus() {
		return rhesus;
	}

	public void setRhesus(String rhesus) {
		this.rhesus = rhesus;
	}

	public String getHiv() {
		return hiv;
	}

	public void setHiv(String hiv) {
		this.hiv = hiv;
	}

	public String getHepatitis() {
		return hepatitis;
	}

	public void setHepatitis(String hepatitis) {
		this.hepatitis = hepatitis;
	}
	
	
	
}
