package com.infinite.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.infinite.spring.dao.IAadharDAOImpl;
import com.infinite.spring.model.Aadhar;

@Service
public class IAaadharServiceImpl implements IAaadharService{

	
	private IAadharDAOImpl aadharDAO;
	
	public void setAadharDAO(IAadharDAOImpl aadharDAO) {
		this.aadharDAO = aadharDAO;
	}

	@Override
	@Transactional
	public void AaadharInsert(Aadhar aa) {
     this.aadharDAO.aadharinsert(aa);	
	}

}
