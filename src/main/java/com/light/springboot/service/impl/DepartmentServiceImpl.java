package com.light.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.light.springboot.dao.DepartmentMapper;
import com.light.springboot.pojo.Department;
import com.light.springboot.service.DepartmentService;

/**
 * 启用缓存
 * 
 * @author 2018040005
 *
 */
@CacheConfig(cacheNames = "department")
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;

	@CachePut(key = "#department.id")
	@Override
	public Department save(Department department) {
		System.out.println("保存id=" + department.getId() + "的数据");
		departmentMapper.insert(department);
		return department;
	}

	@CachePut(key = "#department.id")
	@Override
	public Department update(Department department) {
		System.out.println("修改id" + department.getId() + "的数据");
		departmentMapper.update(department);
		return department;
	}

	@Cacheable(key = "#id")
	@Override
	public Department getDepartmentById(Integer id) {
		System.out.println("获取id=" + id + "的数据");
		Department department = departmentMapper.selectById(id);
		return department;
	}

	@CacheEvict(key = "#id")
	@Override
	public void delete(Integer id) {
		System.out.println("删除id=" + id + "的数据");
		departmentMapper.deleteById(id);
	}

}
