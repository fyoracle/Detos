package com.fyoracle.service;

import java.util.List;

import com.fyoracle.entity.DetoUser;

public interface DetoUserService {

	public void save(DetoUser detoUser);
	
	public void update(DetoUser detoUser);
	
	public void delete(DetoUser detoUser);
	
	public DetoUser findById(int id);
	
	public List<DetoUser> findAll();
	
	
	// 查获
	
	// ** 处置** 
	// 拘留
	
	// 强戒
	
	// 刑事羁押
	
	// 社区戒毒
	
	// 社区康复
	
	// ** 社区戒康 **
	// 接收
	
	// 签到
	
	// 尿检
	
	// 访谈
	
	// 请假
	
	// 中止
	
	// 终止
	
	// 期满解除
	
}
