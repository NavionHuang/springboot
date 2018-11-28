package com.light.springboot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.light.springboot.pojo.Department;
@Mapper
public interface DepartmentMapper {
	public void insert(Department department);
	
	public void update(Department department);

	public void deleteById(Integer id);

	public Department selectById(Integer id);

}
