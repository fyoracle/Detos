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
		// 地区
		Region regoin = regionService.findById(4); // 户籍地
		
		SimpleDateFormat sdf  =   new  SimpleDateFormat("yyyy-MM-dd");
		Date date =null;
		try {
			date = (Date) sdf.parse("1987-04-02");
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		DetoUser detoUser = new DetoUser();
		detoUser.setName("马乾峰");
		detoUser.setAliasName("马三儿");
		detoUser.setLoginName("maqf");
		detoUser.setPassword("111111");
		detoUser.setMobileNumber("15808122742");
		detoUser.setSex(1);
		detoUser.setNation("汉");
		detoUser.setIdCardNum("523012198704021616");
		detoUser.setBirthDate(date);
		detoUser.setHeight(172);
		
		detoUser.setRegion(regoin);
		detoUser.setPermanentAddress("绵阳市涪城区丝厂家属区");
		detoUser.setPermanetPoliceStation("绵阳市涪城区公安局");
		detoUser.setResidentialAddress("绵阳市涪城区丝厂家属区");
		detoUser.setResidentialPoliceStation("绵阳市涪城区公安局");
		
		detoUserService.save(detoUser);
	}

	@Test
	public void findAll(){
		List<DetoUser> detoUserLst = detoUserService.findAll();
		for(DetoUser detoUser:detoUserLst){
			System.out.println(detoUser.getName());
			System.out.println(detoUser.getAliasName());
			System.out.println(detoUser.getRegion().getName());
		}
	}
}
