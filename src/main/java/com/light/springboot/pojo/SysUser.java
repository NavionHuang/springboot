package com.light.springboot.pojo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * secutity测试
 * 
 * @author 2018040005 1.实现UserDetails接口 2.重写getAuthorities方法，将用户的角色和权限关联起来
 */
public class SysUser implements UserDetails {
	private int id;
	private String username;
	private String password;
	private SysRole roles;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SysRole getRoles() {
		return roles;
	}

	public void setRoles(SysRole roles) {
		this.roles = roles;
	}

	/**
	 * 2.重写getAuthorities方法，将用户的角色和权限关联起来
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
		SysRole roles = getRoles();
		//for (SysRole role : roles) {
			auths.add(new SimpleGrantedAuthority(roles.getName()));
		//}
		return auths;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
