package com.fyoracle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyoracle.dao.BaseDao;
import com.fyoracle.entity.Community;
import com.fyoracle.service.CommunityService;

@Service
public class CommunityServiceImpl implements CommunityService {

	@Autowired
	private BaseDao<Community> baseDao;
	
	@Override
	public void save(Community community) {
		baseDao.save(community);

	}

	@Override
	public void update(Community community) {
		baseDao.update(community);

	}

	@Override
	public void delete(Community community) {
		baseDao.delete(community);

	}

	@Override
	public Community findById(int id) {
		return baseDao.get(Community.class, id);
	}

	@Override
	public List<Community> findAll() {
		return baseDao.find("from Community");
	}

}
