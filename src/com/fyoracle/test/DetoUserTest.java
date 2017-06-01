package com.fyoracle.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.fyoracle.entity.DetoUser;
import com.fyoracle.service.DetoUserService;

@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class DetoUserTest {

	@Autowired
	private DetoUserService detoUserService;
	
	@Test
	public void save() {
		DetoUser detoUser = new DetoUser();
		detoUser.setName("马乾峰");
		detoUser.setAliasName("马三儿");
		detoUser.setLoginName("maqf");
		detoUser.setPassword("111111");
		detoUser.setMobileNumber("15808122742");
		detoUser.setSex(1);
		detoUser.setNation("汉");
		detoUser.setIdCardNum("523012198704021616");
		detoUser.setBirthDate(null);
		detoUser.setHeight(172);
		
		detoUserService.save(detoUser);
	}
	
	@Test
	public void update() {
		fail("尚未实现");
	}
	
	@Test
	public void delete() {
		fail("尚未实现");
	}
	
	@Test
	public void findAll() {
		fail("尚未实现");
	}

}
