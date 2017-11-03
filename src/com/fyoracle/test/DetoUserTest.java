package com.fyoracle.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.fyoracle.entity.DetoUser;
import com.fyoracle.entity.Region;
import com.fyoracle.service.DetoUserService;
import com.fyoracle.service.RegionService;

@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class DetoUserTest extends BasicTest{

	@Autowired
	private DetoUserService detoUserService;
	@Autowired
	private RegionService regionService;
	
	@Test
	public void save() throws java.text.ParseException {
		// ����
		Region regoin = regionService.findById(3); // ������
		
		SimpleDateFormat sdf  =   new  SimpleDateFormat("yyyy-MM-dd");
		Date date =null;
		try {
			date = (Date) sdf.parse("1985-05-03");
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		DetoUser detoUser = new DetoUser();
		detoUser.setName("����");
		detoUser.setAliasName("���϶�");
		detoUser.setLoginName("mafc");
		detoUser.setPassword("111111");
		detoUser.setMobileNumber("15808122002");
		detoUser.setSex(1);
		detoUser.setNation("��");
		detoUser.setIdCardNum("523012198505031235");
		detoUser.setBirthDate(date);
		detoUser.setHeight(166);
		
		detoUser.setRegion(regoin);
		detoUser.setPermanentAddress("�����и�������������11��");
		detoUser.setPermanetPoliceStation("�����и�����������");
		detoUser.setResidentialAddress("�����и�������������11��");
		detoUser.setResidentialPoliceStation("�����и�����������");
		
		detoUserService.save(detoUser);
	}

	@Test
	public void findAll(){
		List<DetoUser> detoUserLst = detoUserService.findAll();
		for(DetoUser detoUser:detoUserLst){
			System.out.println(detoUser);
			System.out.println(detoUser.getName());
			System.out.println(detoUser.getAliasName());
			System.out.println(detoUser.getRegion().getName());
		}
	}
}
