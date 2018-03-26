package com.jwt.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;






import com.jwt.dao.BiochemistryTestDAO;
import com.jwt.model.BiochemistryTest;



@Service
@Transactional

public class BiochemistryTestServiceImpl implements BiochemistryTestService {

	@Autowired
	private BiochemistryTestDAO biochemistryTestDAO;

	@Override
	public void addBiochemistryTest(BiochemistryTest biochemistryTest) {
		biochemistryTestDAO.addBiochemistryTest(biochemistryTest);
		
	}

	@Override
	public List<BiochemistryTest> getAllBiochemistryTests() {
		return biochemistryTestDAO.getAllBiochemistryTests();
	}

	@Override
	public void deleteBiochemistryTest(Integer BiochemistryTestId) {
		biochemistryTestDAO.deleteBiochemistryTest(BiochemistryTestId);
		
	}

	@Override
	public BiochemistryTest getBiochemistryTest(int BiochemistryTestid) {
		return biochemistryTestDAO.getBiochemistryTest(BiochemistryTestid);
	}

	@Override
	public BiochemistryTest updateBiochemistryTest(
			BiochemistryTest biochemistryTest) {
		return biochemistryTestDAO.updateBiochemistryTest(biochemistryTest);
	}

	public void setBiochemistryTest(BiochemistryTestDAO biochemistryTestDAO) {
		this.biochemistryTestDAO = biochemistryTestDAO;
	}
	
}
