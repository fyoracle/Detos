package com.fyoracle.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.fyoracle.entity.Community;
import com.fyoracle.entity.DetoWorker;
import com.fyoracle.service.CommunityService;
import com.fyoracle.service.DetoWorkerService;

@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class DetoWorkerTest extends BasicTest{
	
	@Autowired
	private DetoWorkerService detoWorkerService;

	@Autowired 
	private CommunityService communityService;
	
	@Test
	public void save() {
		String name = "«Ò Á’Í";
		String loginName = "qiusz";
		String password = "111111";
		Community community = communityService.findById(1);
		
		DetoWorker detoWorker = new DetoWorker();
		detoWorker.setName(name);;
		detoWorker.setLoginName(loginName);
		detoWorker.setPassword(password);
		detoWorker.setCommunity(community);
		
		detoWorkerService.save(detoWorker);
	}
	@Test
	public void update(){
		DetoWorker detoWorker = detoWorkerService.findById(1);
		Community community = communityService.findById(1);
		detoWorker.setCommunity(community);
		detoWorkerService.update(detoWorker);
	}
	
	@Test
	public void findAll(){
		List<DetoWorker> detoWorkerLst = detoWorkerService.findAll();
		for(DetoWorker detoWorker:detoWorkerLst){
			System.out.println(detoWorker);
		}
		
	}

}
