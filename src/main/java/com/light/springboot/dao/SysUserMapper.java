package com.light.springboot.dao;

import com.light.springboot.pojo.SysUser;

public interface SysUserMapper {
	public SysUser queryByName(String username);
}
