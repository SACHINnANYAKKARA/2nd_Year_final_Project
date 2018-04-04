package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nurse_tbl")

public class Nurse implements Serializable {

	private static final long serialVersionUID = -3912487674734302848L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Nurse_Id;
	
	@Column
	private String name;
	
	@Column
	private String level;
	
	@Column
	private String start_date;

	public int getNurse_Id() {
		return Nurse_Id;
	}

	public void setNurse_Id(int nurse_Id) {
		Nurse_Id = nurse_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	
}
