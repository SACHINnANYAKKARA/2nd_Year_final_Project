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

public class Patient_Injection implements Serializable {

	private static final long serialVersionUID = -3462817274585302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dignosis_no;

	@Column
	private String injection_date;
	
	@Column
	private String status;
	
	
}
