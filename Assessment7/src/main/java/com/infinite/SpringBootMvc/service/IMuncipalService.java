package com.infinite.SpringBootMvc.service;

import java.util.List;

import com.infinite.SpringBootMvc.model.Municipal;

public interface IMuncipalService {

	public List<Municipal> getAllComplains();

	public Municipal getMunicipal(int id);

	public Municipal addMunicipal(Municipal municipal);

	public void updateMunicipal(Municipal municipal);

	public void deleteMunicipal(int id);
}