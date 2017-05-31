package com.fyoracle.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.fyoracle.entity.Community;
import com.fyoracle.entity.PoliceStation;
import com.fyoracle.service.CommunityService;
import com.fyoracle.service.PoliceStationService;

@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class CommunityTest extends BasicTest{

	@Autowired
	private CommunityService communityService;
	@Autowired
	private PoliceStationService policeStationService;

	@Test
	public void save() {
		// ��������
		PoliceStation policeStation = policeStationService.findById(2);
		
		Community community = new Community();
		community.setName("�����������䶾������������");
		community.setAddress("�����г������ж�25��");
		community.setContactNum("0816 - 2580888");
		community.setPolicestation(policeStation);
		
		communityService.save(community);
	}
	
	@Test
	public void findAll() {
		List<Community> communityLst = communityService.findAll();
		for(Community community:communityLst){
			System.out.println(community.getName());
			System.out.println(community.getAddress());
			System.out.println(community.getContactNum());
			System.out.println(community.getPolicestation().getName());
		}
	}

}
