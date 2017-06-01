package com.fyoracle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyoracle.dao.BaseDao;
import com.fyoracle.entity.DetoRecord;
import com.fyoracle.service.DetoRecordService;

@Service
public class DetoRecordServiceImpl implements DetoRecordService {

	@Autowired
	private BaseDao<DetoRecord> baseDao;
	
	@Override
	public void save(DetoRecord detoRecord) {
		baseDao.save(detoRecord);

	}

	@Override
	public void update(DetoRecord detoRecord) {
		baseDao.update(detoRecord);

	}

	@Override
	public void delete(DetoRecord detoRecord) {
		baseDao.delete(detoRecord);

	}

	@Override
	public DetoRecord findById(int id) {
		return baseDao.get(DetoRecord.class, id);
	}

	@Override
	public List<DetoRecord> findAll() {
		return baseDao.find("from DetoRecord");
	}

}
