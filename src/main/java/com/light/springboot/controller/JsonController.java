package com.light.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.light.springboot.pojo.Json;
import com.light.springboot.pojo.Result;
import com.light.springboot.pojo.TestJson;
import com.mysql.fabric.xmlrpc.base.Array;

/**
 * 测试JSON
 * 
 * @author 2018040005
 *
 */
@RestController
public class JsonController {
	@RequestMapping("/json")
	public TestJson test() {
		Map<String, String> data = new HashMap<>();
		data.put("n1", "50.1");
		data.put("n2", "50.2");
		data.put("n3", "50.3");
		TestJson json = new TestJson("001", "C9", "T01", "张三", "ok", data);
		return json;
	}

	@PostMapping("/json1")
	public Json test1(@RequestBody Json json) {
		// Map<String, String> date = json.getDate();
		System.out.println(json.getJson().get(0));
		return json;
	}

	@PostMapping("/json2")
	public Result test2(@RequestBody Json json) {
		Result result = new Result();
		List<TestJson> testJsonList = new ArrayList<>();
		List<String> error = new ArrayList<>();
		List<TestJson> data = new ArrayList<>();
		testJsonList = json.getJson();
		for (int i = 0; i < testJsonList.size(); i++) {
			TestJson testJson = testJsonList.get(i);
			data.add(testJson);
			error.add("校验结果:"+(i+1));
		}
		result.setData(data);
		result.setCode(200);
		result.setMsg(error);
		return result;
	}
	@RequestMapping("/json3")
	public int test3(String sn) {
		System.out.println(sn);
		Map<String,Integer> map=new HashMap<>();
		map.put("status", 0);
		return  0;
	}
}
