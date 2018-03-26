package com.jwt.dao;

import java.util.List;

import com.jwt.model.BiochemistryTest;

public interface BiochemistryTestDAO {
	
	public void addBiochemistryTest(BiochemistryTest biochemistryTest);

	public List<BiochemistryTest> getAllBiochemistryTests();

	public void deleteBiochemistryTest(Integer BiochemistryTestId);

	public BiochemistryTest getBiochemistryTest(int BiochemistryTestid);

	public BiochemistryTest updateBiochemistryTest(BiochemistryTest biochemistryTest);
	

}
