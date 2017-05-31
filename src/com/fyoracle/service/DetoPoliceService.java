package com.fyoracle.service;

import java.util.List;

import com.fyoracle.entity.DetoPolice;

public interface DetoPoliceService {
	public void save(DetoPolice detoPolice);
	
	public void update(DetoPolice detoPolice);
	
	public void delete(DetoPolice detoPolice);
	
	public DetoPolice findById(int id);
	
	public List<DetoPolice> findAll();
	
}
