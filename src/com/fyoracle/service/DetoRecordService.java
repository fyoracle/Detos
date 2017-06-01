package com.fyoracle.service;

import java.util.List;

import com.fyoracle.entity.DetoRecord;

public interface DetoRecordService {

	// ���Ǽ�
	public void save(DetoRecord detoRecord);
	
	// 
	public void update(DetoRecord detoRecord);
	
	public void delete(DetoRecord detoRecord);
	
	public DetoRecord findById(int id);
	
	public List<DetoRecord> findAll();
}
