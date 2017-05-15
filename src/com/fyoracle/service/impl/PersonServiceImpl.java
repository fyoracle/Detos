package com.fyoracle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyoracle.dao.BaseDao;
import com.fyoracle.entity.Person;
import com.fyoracle.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private BaseDao<Person> baseDao;
	
	
	public void setBaseDao(BaseDao<Person> baseDao) {
		this.baseDao = baseDao;
	}

	//
	@Override
	public void save(Person person) {
		baseDao.save(person);

	}

	@Override
	public void update(Person person) {
		baseDao.update(person);

	}

	@Override
	public void delete(Person person) {
		baseDao.delete(person);

	}

	@Override
	public Person findById(int id) {
		return baseDao.get(Person.class, id);
	}

	@Override
	public List<Person> findAll() {
		return baseDao.find("from Person");
		
	}

}
