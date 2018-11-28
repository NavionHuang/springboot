package com.light.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.light.springboot.pojo.Department;
import com.light.springboot.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@RequestMapping("/save")
	public Map<String, Object> save(Department dapartment) {
		this.departmentService.save(dapartment);
		Map<String, Object> map = new HashMap<>();
		map.put("code", 200);
		map.put("msg", "保存成功");
		return map;
	}

	@RequestMapping("/get/{id}")
	public Map<String, Object> get(@PathVariable Integer id) {
		Department department = this.departmentService.getDepartmentById(id);
		Map<String, Object> map = new HashMap<>();
		map.put("code", 200);
		map.put("msg", "获取成功");
		map.put("data", department);
		return map;
	}

	@RequestMapping("/update")
	public Map<String, Object> update(Department dapartment) {
		this.departmentService.update(dapartment);
		Map<String, Object> map = new HashMap<>();
		map.put("code", 200);
		map.put("msg", "修改成功");
		return map;
	}

	@RequestMapping("/delete/{id}")
	public Map<String, Object> delete(Integer id) {
		this.departmentService.delete(id);
		Map<String, Object> map = new HashMap<>();
		map.put("code", 200);
		map.put("msg", "删除成功");
		return map;
	}
}
