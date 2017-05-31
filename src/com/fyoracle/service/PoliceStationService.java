package com.fyoracle.service;

import java.util.List;

import com.fyoracle.entity.PoliceStation;

public interface PoliceStationService {

	public void save(PoliceStation policeStation);
	
	public void update(PoliceStation policeStation);
	
	public void delete(PoliceStation policeStation);
	
	public PoliceStation findById(int id);
	
	public List<PoliceStation> findAll();
}
