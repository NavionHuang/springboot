package com.light.springboot.service;

import com.light.springboot.pojo.Department;

public interface DepartmentService {
	public Department save(Department dapartment);

	public Department update(Department department);

	public Department getDepartmentById(Integer id);

	public void delete(Integer id);
}
