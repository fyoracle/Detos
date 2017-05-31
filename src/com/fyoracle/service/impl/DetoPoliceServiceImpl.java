package com.fyoracle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyoracle.dao.BaseDao;
import com.fyoracle.entity.DetoPolice;
import com.fyoracle.service.DetoPoliceService;

@Service
public class DetoPoliceServiceImpl implements DetoPoliceService {

	@Autowired
	private BaseDao<DetoPolice> baseDao;
	
	@Override
	public void save(DetoPolice detoPolice) {
		baseDao.save(detoPolice);

	}

	@Override
	public void update(DetoPolice detoPolice) {
		baseDao.update(detoPolice);

	}

	@Override
	public void delete(DetoPolice detoPolice) {
		baseDao.delete(detoPolice);

	}

	@Override
	public DetoPolice findById(int id) {
		return baseDao.get(DetoPolice.class, id);
	}

	@Override
	public List<DetoPolice> findAll() {
		return baseDao.find("from DetoPolice");
	}

}
