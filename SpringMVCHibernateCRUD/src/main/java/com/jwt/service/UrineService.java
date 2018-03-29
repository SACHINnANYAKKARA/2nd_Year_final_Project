package com.jwt.service;

import java.util.List;

import com.jwt.model.Urine;

public interface UrineService {

	public void addUrine(Urine urine);

	public List<Urine> getAllUrines();

	public void deleteUrine(Integer UrineId);

	public Urine getUrine(int UrineId);

	public Urine updateUrine(Urine urine);
	
	
}
