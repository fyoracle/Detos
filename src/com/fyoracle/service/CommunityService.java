package com.fyoracle.service;

import java.util.List;

import com.fyoracle.entity.Community;

public interface CommunityService {
	public void save(Community community);
	
	public void update(Community community);
	
	public void delete(Community community);
	
	public Community findById(int id);
	
	public List<Community> findAll();
	
}
