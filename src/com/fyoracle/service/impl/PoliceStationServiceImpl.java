package com.fyoracle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyoracle.dao.BaseDao;
import com.fyoracle.entity.PoliceStation;
import com.fyoracle.service.PoliceStationService;

@Service
public class PoliceStationServiceImpl implements PoliceStationService {

	@Autowired
	private BaseDao<PoliceStation> baseDao;
	
	@Override
	public void save(PoliceStation policeStation) {
		baseDao.save(policeStation);

	}

	@Override
	public void update(PoliceStation policeStation) {
		baseDao.update(policeStation);

	}

	@Override
	public void delete(PoliceStation policeStation) {
		baseDao.delete(policeStation);

	}

	@Override
	public PoliceStation findById(int id) {
		return baseDao.get(PoliceStation.class, id);
		
	}

	@Override
	public List<PoliceStation> findAll() {
		return baseDao.find("from PoliceStation");
		
	}

}
