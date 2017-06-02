package com.fyoracle.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.fyoracle.entity.PoliceStation;
import com.fyoracle.entity.Region;
import com.fyoracle.service.PoliceStationService;
import com.fyoracle.service.RegionService;

@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class PoliceStationTest extends BasicTest{

	@Autowired
	private PoliceStationService policeStationService;
	private RegionService regionService;
	
	@Test
	public void Save() {
		// Region
		Region region = regionService.findById(5);
		// System.out.println(region.getName());
		
		PoliceStation policeStation = new PoliceStation();
		PoliceStation policeStation1 = policeStationService.findById(1);
		
		policeStation.setName("高新区公安局");
		policeStation.setRegion(region);
		policeStation.setPolicestation(policeStation1);
		policeStationService.save(policeStation);
	}
	
	@Test
	public void findAll() {
		List<PoliceStation> policeStationLst = policeStationService.findAll();
		for(PoliceStation policeStation:policeStationLst){
			System.out.println(policeStation.getName());
		}
	}

}
