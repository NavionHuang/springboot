package com.light.springboot.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.light.springboot.pojo.User;

@RestController
@RequestMapping("/fastJson")
public class FastjsonController {
	@RequestMapping("/test")
	public User fastJsonTest() {
		User user = new User();
		user.setId(1);
		user.setUsername("jack");
		user.setPassword("jack123");
		user.setBirthday(new Date());
		return user;
	}
}
