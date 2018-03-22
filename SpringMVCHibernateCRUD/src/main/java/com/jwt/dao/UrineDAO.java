package com.jwt.dao;

import java.util.List;

import com.jwt.model.Urine;

public interface UrineDAO {
	public void addUrine(Urine urine);

	public List<Urine> getAllUrines();

	public void deleteUrine(Integer urineId);

	public Urine getUrine(int urineid);

	public Urine updateUrine(Urine urine);
}
