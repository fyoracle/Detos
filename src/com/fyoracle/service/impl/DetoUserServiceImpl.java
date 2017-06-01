package com.fyoracle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyoracle.dao.BaseDao;
import com.fyoracle.entity.DetoUser;
import com.fyoracle.service.DetoUserService;

@Service
public class DetoUserServiceImpl implements DetoUserService {

	@Autowired
	private BaseDao<DetoUser> baseDao;
	
	@Override
	public void save(DetoUser detoUser) {
		baseDao.save(detoUser);

	}

	@Override
	public void update(DetoUser detoUser) {
		baseDao.update(detoUser);

	}

	@Override
	public void delete(DetoUser detoUser) {
		baseDao.delete(detoUser);

	}

	@Override
	public DetoUser findById(int id) {
		return baseDao.get(DetoUser.class, id);
	}

	@Override
	public List<DetoUser> findAll() {
		return baseDao.find("from DetoUser");
	}

}
