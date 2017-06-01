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
		detoUser.setName("��Ǭ��");
		detoUser.setAliasName("������");
		detoUser.setLoginName("maqf");
		detoUser.setPassword("111111");
		detoUser.setMobileNumber("15808122742");
		detoUser.setSex(1);
		detoUser.setNation("��");
		detoUser.setIdCardNum("523012198704021616");
		detoUser.setBirthDate(null);
		detoUser.setHeight(172);
		
		detoUserService.save(detoUser);
	}
	
	@Test
	public void update() {
		fail("��δʵ��");
	}
	
	@Test
	public void delete() {
		fail("��δʵ��");
	}
	
	@Test
	public void findAll() {
		fail("��δʵ��");
	}

}
