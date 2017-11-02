package com.fyoracle.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.fyoracle.entity.Region;
import com.fyoracle.service.RegionService;

@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class RegionTest extends BasicTest{

	@Autowired
	private RegionService regionService;
	
	@Test
	public void saveRegion(){
		Region region = new Region();
		Region region1 = new Region();
		
		region1 = regionService.findById(1);
		
		region.setName("¸ßÐÂÇø");
		region.setRegionCode("A1003");
		region.setRegion(region1);
		regionService.save(region);
		
		findAll();
	}
	
	@Test
	public void findAll(){
		List<Region> regionList =regionService.findAll();
		for(Region region:regionList){
			System.out.println(region.getName());
		}
	}
}
