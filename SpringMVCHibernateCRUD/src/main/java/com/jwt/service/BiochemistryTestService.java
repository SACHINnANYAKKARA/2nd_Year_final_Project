package com.jwt.service;

import java.util.List;

import com.jwt.model.BiochemistryTest;

public interface BiochemistryTestService {

	public void addBiochemistryTest(BiochemistryTest biochemistryTest);

	public List<BiochemistryTest> getAllBiochemistryTests();

	public void deleteBiochemistryTest(Integer BiochemistryTestId);

	public BiochemistryTest getBiochemistryTest(int BiochemistryTestid);

	public BiochemistryTest updateBiochemistryTest(BiochemistryTest biochemistryTest);
	
	
}
