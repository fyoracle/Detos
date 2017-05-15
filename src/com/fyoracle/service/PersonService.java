package com.fyoracle.service;

import java.util.List;

import com.fyoracle.entity.Person;

public interface PersonService {

	public void save(Person person);
	
	public void update(Person person);
	
	public void delete(Person person);
	
	public Person findById(int id);
	
	public List<Person> findAll();
}
