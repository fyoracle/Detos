package com.fyoracle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyoracle.dao.BaseDao;
import com.fyoracle.entity.Region;
import com.fyoracle.service.RegionService;

@Service
public class RegionServiceImpl implements RegionService {

	@Autowired
	private BaseDao<Region> baseDao;
	
	@Override
	public void save(Region region) {
		baseDao.save(region);
	}

	@Override
	public void update(Region region) {
		baseDao.update(region);
	}

	@Override
	public void delete(Region region) {
		baseDao.delete(region);
	}

	@Override
	public Region findById(int id) {
		return baseDao.get(Region.class, id);
	}

	@Override
	public List<Region> findAll() {
		return baseDao.find("from Region");
	}

}
