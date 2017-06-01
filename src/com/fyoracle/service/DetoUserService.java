package com.fyoracle.service;

import java.util.List;

import com.fyoracle.entity.DetoUser;

public interface DetoUserService {

	public void save(DetoUser detoUser);
	
	public void update(DetoUser detoUser);
	
	public void delete(DetoUser detoUser);
	
	public DetoUser findById(int id);
	
	public List<DetoUser> findAll();
	
}
