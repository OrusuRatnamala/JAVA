package com.infinite.SpringBootMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.SpringBootMvc.model.Municipal;

@Service
public class MunicipalServiceImpl implements IMuncipalService {

	@Autowired
	MunicipalServiceImpl cdo;

	@Override
	public List<Municipal> getAllComplains() {
		// TODO Auto-generated method stub
		return cdo.getAllComplains();
	}

	@Override
	public Municipal getMunicipal(int id) {
		// TODO Auto-generated method stub
		return cdo.getMunicipal(id);
	}

	@Override
	public Municipal addMunicipal(Municipal municipal) {
		// TODO Auto-generated method stub
		return cdo.addMunicipal(municipal);
	}

	@Override
	public void updateMunicipal(Municipal municipal) {
		// TODO Auto-generated method stub
		cdo.updateMunicipal(municipal);

	}

	@Override
	public void deleteMunicipal(int id) {
		// TODO Auto-generated method stub
		cdo.deleteMunicipal(id);

	}

}
