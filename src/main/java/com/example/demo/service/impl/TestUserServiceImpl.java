package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TestUser;
import com.example.demo.entity.TestUserMapper;
import com.example.demo.service.TestUserService;
@Service
public class TestUserServiceImpl implements TestUserService {

	@Autowired
	TestUserMapper testUserMapper;
	
	
	
	@Override
	public TestUser getTestUserById(String id) {
		// TODO Auto-generated method stub
		return testUserMapper.selectByPrimaryKey(id);
	}

}
