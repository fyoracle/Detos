package com.fyoracle.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.fyoracle.entity.DetoPolice;
import com.fyoracle.entity.PoliceStation;
import com.fyoracle.service.DetoPoliceService;
import com.fyoracle.service.PoliceStationService;

@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class DetoPoliceTest extends BasicTest{
	
	@Autowired
	private DetoPoliceService detoPoliceService;
	@Autowired
	private PoliceStationService policeStationService;
	
	@Test
	public void save() {
		// policestation
		PoliceStation policeStation = policeStationService.findById(2);
		
		DetoPolice detoPolice = new DetoPolice();
		detoPolice.setName("ÐìÒøÈð");
		detoPolice.setPoliceCode("´¨00185456");
		detoPolice.setLoginName("185456");
		detoPolice.setPassword("111111");
		detoPolice.setPolicestation(policeStation);
		
		detoPoliceService.save(detoPolice);
		
	}
	
	@Test
	public void findAll() {
		List<DetoPolice> detoPoliceLst = detoPoliceService.findAll();
		for(DetoPolice detoPolice:detoPoliceLst){
			System.out.println(detoPolice.getName() + "," + detoPolice.getPolicestation().getName());
		}
	}
}
