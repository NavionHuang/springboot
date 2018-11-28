package com.light.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/hell")
	public String test() {
		return "HellWorld!!!";
	}
	@RequestMapping("/hell0")
	public String test1() {
		return "HellWorld!!!";
	}
}
