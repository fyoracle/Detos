package com.fyoracle.service;

import java.util.List;

import com.fyoracle.entity.DetoWorker;

public interface DetoWorkerService {

	public void save(DetoWorker detoWorker);
	
	public void update(DetoWorker detoWorker);
	
	public void delete(DetoWorker detoWorker);
	
	public DetoWorker findById(int id);
	
	public List<DetoWorker> findAll();
	
}
