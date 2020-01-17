package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TestUser;
import com.example.demo.service.TestUserService;

/**
 * 
 * @author Mawzh
 *
 */

@RestController
@RequestMapping("/testBoot")
public class UserController {

	
	@Autowired
	private TestUserService testUserService;
	
	
	@RequestMapping("/getUser")
	public TestUser getUser(@RequestParam(name = "id") String id) {
		TestUser user=testUserService.getTestUserById(id);
		return user;
	}
	
	
}
