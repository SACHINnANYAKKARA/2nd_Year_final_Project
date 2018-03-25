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

	private static final long serialVersionUID = -3565463244734302848L;

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

	

	

}
