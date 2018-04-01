package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_diagnosis")

public class PatientDiagnosis implements Serializable {

	private static final long serialVersionUID = -3565487674734302848L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int diagnisys_no;
	
	@Column
	private int registration_no;
	
	@Column
	private String diagnisys_date;
	
	@Column
	private String provisional_dignosis;
	
	@Column
	private String remark;
	
	@Column
	private int biochemistry;
	
	@Column
	private int stool;
	
	@Column
	private int blood;
	
	@Column
	private int gastroscopy;
	
	@Column
	private int urine;
	
	@Column
	private int xray;
	
	@Column
	private int sonography;
	
	@Column
	private String others;
	
	@Column
	private String reconsultation_advice_week;
	
	@Column
	private String reconsultation_advice_date;
	
	@Column
	private String final_diagnosis;
	
	@Column
	private int ECG;

	public int getDiagnisys_no() {
		return diagnisys_no;
	}

	public void setDiagnisys_no(int diagnisys_no) {
		this.diagnisys_no = diagnisys_no;
	}

	public int getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(int registration_no) {
		this.registration_no = registration_no;
	}

	public String getDiagnisys_date() {
		return diagnisys_date;
	}

	public void setDiagnisys_date(String diagnisys_date) {
		this.diagnisys_date = diagnisys_date;
	}

	

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getBiochemistry() {
		return biochemistry;
	}

	public void setBiochemistry(int biochemistry) {
		this.biochemistry = biochemistry;
	}

	public int getStool() {
		return stool;
	}

	public void setStool(int stool) {
		this.stool = stool;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	public int getGastroscopy() {
		return gastroscopy;
	}

	public void setGastroscopy(int gastroscopy) {
		this.gastroscopy = gastroscopy;
	}

	public int getUrine() {
		return urine;
	}

	public void setUrine(int urine) {
		this.urine = urine;
	}

	public int getXray() {
		return xray;
	}

	public void setXray(int xray) {
		this.xray = xray;
	}

	public int getSonography() {
		return sonography;
	}

	public void setSonography(int sonography) {
		this.sonography = sonography;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getReconsultation_advice_week() {
		return reconsultation_advice_week;
	}

	public void setReconsultation_advice_week(String reconsultation_advice_week) {
		this.reconsultation_advice_week = reconsultation_advice_week;
	}

	public String getReconsultation_advice_date() {
		return reconsultation_advice_date;
	}

	public void setReconsultation_advice_date(String reconsultation_advice_date) {
		this.reconsultation_advice_date = reconsultation_advice_date;
	}

	public String getFinal_diagnosis() {
		return final_diagnosis;
	}

	public void setFinal_diagnosis(String final_diagnosis) {
		this.final_diagnosis = final_diagnosis;
	}

	public String getProvisional_dignosis() {
		return provisional_dignosis;
	}

	public void setProvisional_dignosis(String provisional_dignosis) {
		this.provisional_dignosis = provisional_dignosis;
	}

	public int getECG() {
		return ECG;
	}

	public void setECG(int eCG) {
		ECG = eCG;
	}

	
	
	
}
