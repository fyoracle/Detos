package com.fyoracle.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.fyoracle.entity.DetoPolice;
import com.fyoracle.entity.DetoRecord;
import com.fyoracle.entity.DetoUser;
import com.fyoracle.entity.PoliceStation;
import com.fyoracle.service.DetoPoliceService;
import com.fyoracle.service.DetoRecordService;
import com.fyoracle.service.DetoUserService;
import com.fyoracle.service.PoliceStationService;

@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class DetoRecordTest extends BasicTest{

	@Autowired
	private DetoRecordService detoRecordService;
	@Autowired
	private DetoUserService detoUserService;
	@Autowired
	private PoliceStationService policeStationService;
	@Autowired
	private DetoPoliceService detoPoliceService;

	@Test
	public void save() throws java.text.ParseException {
		PoliceStation policeStation = policeStationService.findById(3);// 公安局
		DetoPolice detoPolice = detoPoliceService.findById(1); // 民警
		DetoUser detoUser = detoUserService.findById(1); // 吸毒人员
		
		SimpleDateFormat sdf  =   new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date =null;
		try {
			date = (Date) sdf.parse("2017-05-23 22:13:00");
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		DetoRecord detoRecord = new DetoRecord();
		detoRecord.setDetouser(detoUser);
		detoRecord.setDetoUserName(detoUser.getName());
		detoRecord.setCatchPoliceStationID(policeStation.getId());
		detoRecord.setCatchPoliceStationName(policeStation.getName());
		detoRecord.setCatchPlace("天上人间KTV");
		detoRecord.setCatchDate(date);
		detoRecord.setDetos("冰毒;摇头丸");
		detoRecord.setDetoReality("吸毒事实确凿");
		detoRecord.setUrineTest(1);
		detoRecord.setUrineTestInfo("尿检结果：阳性");
		detoRecord.setRegisterUserId(detoPolice.getId());
		detoRecord.setRegisterUserName(detoPolice.getName());
		
		
		detoRecordService.save(detoRecord);
	}
	
	@Test
	public void delete(){
		DetoRecord detoRecord = detoRecordService.findById(1);
		detoRecordService.delete(detoRecord);
	}
	
	@Test
	public void findAll(){
		List<DetoRecord> detoRecordLst = detoRecordService.findAll();
		for(DetoRecord etoRecord:detoRecordLst){
			System.out.println(etoRecord.getDetoReality());
			System.out.println(etoRecord.getDetoUserName());
		}
	}

}
