package com.jwt.service;

import java.util.List;

import com.jwt.model.Urine;

public interface UrineService {

	public void addUrine(Urine urine);

	public List<Urine> getAllUrines();

	public void deleteUrine(Integer urineId);

	public Urine getUrine(int urineid);

	public Urine updateUrine(Urine urine);
	
	
}
