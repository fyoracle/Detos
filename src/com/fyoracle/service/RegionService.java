package com.fyoracle.service;

import java.util.List;

import com.fyoracle.entity.Region;

public interface RegionService {
	
	public void save(Region region);
	
	public void update(Region region);
	
	public void delete(Region region);
	
	public Region findById(int id);
	
	public List<Region> findAll();

}
