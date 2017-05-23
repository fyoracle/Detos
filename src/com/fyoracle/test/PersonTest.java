package com.fyoracle.test;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.fyoracle.entity.Person;
import com.fyoracle.service.PersonService;

@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class PersonTest extends BasicTest{
	
	@Autowired
	private PersonService personService2;
		
	@Test
	// regoin -->policeStation -->police
    //	      -->community
	public void savePerson(){
		personService2.save(new Person("��  ��","1001","13990146778","����������"));
		findAll();
	}
	
	@Test 
	public void findAll(){
		// test
		List<Person> personList = personService2.findAll();
		for(Person person:personList){
			System.out.println(person);
		}
	}
}