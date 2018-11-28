package com.light.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.light.springboot.pojo.Msg;

@Controller
public class PageContcoller {
	@RequestMapping("/upload")
	public String file() {
		return "upload";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/")
	public String index(Model model) {
		Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
		model.addAttribute("msg", msg);
		return "index";
	}

	@RequestMapping("/index")
	public String index1(Model model) {
		Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
		model.addAttribute("msg", msg);
		return "index";
	}

}
