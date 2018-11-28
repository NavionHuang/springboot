package com.lightspringboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.light.springboot.SpringbootApplication;
import com.light.springboot.dao.DepartmentMapper;
import com.light.springboot.pojo.Department;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringbootApplication.class)
public class DepartmentTest {
	@Autowired
	private DepartmentMapper departmentMapper;

	@Test
	public void testInsert() {
		Department department = new Department();
		department.setId(2);
		department.setName("测试部");
		department.setDescr("测试产品");
		this.departmentMapper.insert(department);
		System.out.println("保存成功");
	}
	@Test
	public void testSelect() {
		Department department = this.departmentMapper.selectById(1);
		System.out.println(department);
	}
	@Test
	public void testUpdate() {
		Department department = new Department();
		department.setId(2);
		department.setDescr("测试项目");
		this.departmentMapper.update(department);
		System.out.println("更新成功");
	}
	@Test
	public void testDelete() {
		this.departmentMapper.deleteById(2);
		System.out.println("已删除");
	}
}
