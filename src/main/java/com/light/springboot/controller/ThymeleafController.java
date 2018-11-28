package com.light.springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
	@RequestMapping("/test")
	public String testThymeleaf(Map<String, Object> map) {
		map.put("msg", "hell,thymeleaf");
		return "thymeleaf";
	}
}
