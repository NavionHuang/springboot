package com.light.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.light.springboot.dao.SysUserMapper;
import com.light.springboot.pojo.SysUser;

public class CustomUserService implements UserDetailsService {
	@Autowired
	private SysUserMapper sysUserMapper;

	/**
	 * 实现该接口中的loadUserByUsername方法
	 */
	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		SysUser user = sysUserMapper.queryByName(arg0);
		if(null==user) {
			throw new UsernameNotFoundException("用户名不存在");
		}
		System.out.println("param:"+arg0);
		System.out.println("username:"+user.getUsername()+",password:"+user.getPassword());
		return user;
	}
}
