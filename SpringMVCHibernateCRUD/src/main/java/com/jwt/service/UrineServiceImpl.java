package com.jwt.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.UrineDAO;
import com.jwt.model.Urine;


@Service
@Transactional

public class UrineServiceImpl implements UrineService  {

	@Autowired
	private UrineDAO urineDAO;

	@Transactional
	public void addUrine(Urine urine) {
	    urineDAO.addUrine(urine);
	}

	@Transactional
	public List<Urine> getAllUrines() {
		return urineDAO.getAllUrines();
	}

	@Transactional
	public void deleteUrine(Integer UrineId) {
		urineDAO.deleteUrine(UrineId);
		
	}

	@Override
	public Urine getUrine(int UrineId) {
		return urineDAO.getUrine(UrineId);
	}

	@Override
	public Urine updateUrine(Urine urine) {
		return urineDAO.updateUrine(urine);
	}	
	
	public void setUrineDAO(UrineDAO urineDAO) {
		this.urineDAO = urineDAO;
	}

}
