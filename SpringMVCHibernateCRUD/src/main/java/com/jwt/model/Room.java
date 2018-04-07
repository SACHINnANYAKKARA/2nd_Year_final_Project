package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room_tbl")

public class Room implements Serializable {

	private static final long serialVersionUID = -346598774584502841L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int no;

	@Column
	private String no_of_beds;
	
	@Column
	private String availability;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getNo_of_beds() {
		return no_of_beds;
	}

	public void setNo_of_beds(String no_of_beds) {
		this.no_of_beds = no_of_beds;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	

	
	
}
