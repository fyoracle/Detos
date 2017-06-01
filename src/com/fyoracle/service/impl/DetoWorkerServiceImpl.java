package com.fyoracle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyoracle.dao.BaseDao;
import com.fyoracle.entity.DetoWorker;
import com.fyoracle.service.DetoWorkerService;

@Service
public class DetoWorkerServiceImpl implements DetoWorkerService {

	@Autowired
	private BaseDao<DetoWorker> baseDao;
	@Override
	public void save(DetoWorker detoWorker) {
		baseDao.save(detoWorker);

	}

	@Override
	public void update(DetoWorker detoWorker) {
		baseDao.update(detoWorker);

	}

	@Override
	public void delete(DetoWorker detoWorker) {
		baseDao.delete(detoWorker);

	}

	@Override
	public DetoWorker findById(int id) {
		return baseDao.get(DetoWorker.class, id);
	}

	@Override
	public List<DetoWorker> findAll() {
		return baseDao.find("from DetoWorker");
	}

}
