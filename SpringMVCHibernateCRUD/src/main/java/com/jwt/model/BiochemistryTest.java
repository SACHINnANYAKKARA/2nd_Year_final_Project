package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "biochemistry_test")

public class BiochemistryTest implements Serializable {

	private static final long serialVersionUID = -3495252074584502847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int registration_no;
	
	@Column
	private String test_date;
	
	@Column
	private int fasting_gloucose;
	
	@Column
	private int urine_in_blood;
	
	@Column
	private int creatinine;
	
	@Column
	private int cholestgorol;
	
	@Column
	private int protein;
	
	@Column
	private int albumin;
	
	@Column
	private int globwlin;
	
	@Column
	private int albumin_globuline;
	
	@Column
	private int alkaline;
	
	@Column
	private int directbilirubine;
	
	@Column
	private int indirectbilirubine;
	
	@Column
	private int totalbilirubine;
	
	@Column
	private int gloucose;
	
	@Column
	private int blood_ultra_nitrogen;
	
	@Column
	private int cholesterol_hdl;
	
	@Column
	private int cholesterol_ldl;
	
	
	@Column
	private int cholesterol_vldl;
	
	@Column
	private String triglycerides;
	
	@Column
	private String amylase;
	
	@Column
	private String lipase;
	
	@Column
	private String Sodium;
	
	@Column
	private String potassium;

	@Column
	private String chloride;

	@Column
	private String calcium;

	@Column
	private String uricacid;
	
	@Column
	private String urinesugar;
	
	@Column
	private String total_ldh;
	
	@Column
	private String t3;

	@Column
	private String t4;

	@Column
	private String tsh;

	public int getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(int registration_no) {
		this.registration_no = registration_no;
	}

	public String getTest_date() {
		return test_date;
	}

	public void setTest_date(String test_date) {
		this.test_date = test_date;
	}

	public int getFasting_gloucose() {
		return fasting_gloucose;
	}

	public void setFasting_gloucose(int fasting_gloucose) {
		this.fasting_gloucose = fasting_gloucose;
	}

	public int getUrine_in_blood() {
		return urine_in_blood;
	}

	public void setUrine_in_blood(int urine_in_blood) {
		this.urine_in_blood = urine_in_blood;
	}

	public int getCreatinine() {
		return creatinine;
	}

	public void setCreatinine(int creatinine) {
		this.creatinine = creatinine;
	}

	public int getCholestgorol() {
		return cholestgorol;
	}

	public void setCholestgorol(int cholestgorol) {
		this.cholestgorol = cholestgorol;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getAlbumin() {
		return albumin;
	}

	public void setAlbumin(int albumin) {
		this.albumin = albumin;
	}

	public int getGlobwlin() {
		return globwlin;
	}

	public void setGlobwlin(int globwlin) {
		this.globwlin = globwlin;
	}

	public int getAlbumin_globuline() {
		return albumin_globuline;
	}

	public void setAlbumin_globuline(int albumin_globuline) {
		this.albumin_globuline = albumin_globuline;
	}

	public int getAlkaline() {
		return alkaline;
	}

	public void setAlkaline(int alkaline) {
		this.alkaline = alkaline;
	}

	public int getDirectbilirubine() {
		return directbilirubine;
	}

	public void setDirectbilirubine(int directbilirubine) {
		this.directbilirubine = directbilirubine;
	}

	public int getIndirectbilirubine() {
		return indirectbilirubine;
	}

	public void setIndirectbilirubine(int indirectbilirubine) {
		this.indirectbilirubine = indirectbilirubine;
	}

	public int getTotalbilirubine() {
		return totalbilirubine;
	}

	public void setTotalbilirubine(int totalbilirubine) {
		this.totalbilirubine = totalbilirubine;
	}

	public int getGloucose() {
		return gloucose;
	}

	public void setGloucose(int gloucose) {
		this.gloucose = gloucose;
	}

	public int getBlood_ultra_nitrogen() {
		return blood_ultra_nitrogen;
	}

	public void setBlood_ultra_nitrogen(int blood_ultra_nitrogen) {
		this.blood_ultra_nitrogen = blood_ultra_nitrogen;
	}

	public int getCholesterol_hdl() {
		return cholesterol_hdl;
	}

	public void setCholesterol_hdl(int cholesterol_hdl) {
		this.cholesterol_hdl = cholesterol_hdl;
	}

	public int getCholesterol_ldl() {
		return cholesterol_ldl;
	}

	public void setCholesterol_ldl(int cholesterol_ldl) {
		this.cholesterol_ldl = cholesterol_ldl;
	}

	public int getCholesterol_vldl() {
		return cholesterol_vldl;
	}

	public void setCholesterol_vldl(int cholesterol_vldl) {
		this.cholesterol_vldl = cholesterol_vldl;
	}

	public String getTriglycerides() {
		return triglycerides;
	}

	public void setTriglycerides(String triglycerides) {
		this.triglycerides = triglycerides;
	}

	public String getAmylase() {
		return amylase;
	}

	public void setAmylase(String amylase) {
		this.amylase = amylase;
	}

	public String getLipase() {
		return lipase;
	}

	public void setLipase(String lipase) {
		this.lipase = lipase;
	}

	public String getSodium() {
		return Sodium;
	}

	public void setSodium(String sodium) {
		Sodium = sodium;
	}

	public String getPotassium() {
		return potassium;
	}

	public void setPotassium(String potassium) {
		this.potassium = potassium;
	}

	public String getChloride() {
		return chloride;
	}

	public void setChloride(String chloride) {
		this.chloride = chloride;
	}

	public String getCalcium() {
		return calcium;
	}

	public void setCalcium(String calcium) {
		this.calcium = calcium;
	}

	public String getUricacid() {
		return uricacid;
	}

	public void setUricacid(String uricacid) {
		this.uricacid = uricacid;
	}

	public String getUrinesugar() {
		return urinesugar;
	}

	public void setUrinesugar(String urinesugar) {
		this.urinesugar = urinesugar;
	}

	public String getTotal_ldh() {
		return total_ldh;
	}

	public void setTotal_ldh(String total_ldh) {
		this.total_ldh = total_ldh;
	}

	public String getT3() {
		return t3;
	}

	public void setT3(String t3) {
		this.t3 = t3;
	}

	public String getT4() {
		return t4;
	}

	public void setT4(String t4) {
		this.t4 = t4;
	}

	public String getTsh() {
		return tsh;
	}

	public void setTsh(String tsh) {
		this.tsh = tsh;
	}

	

	

}
