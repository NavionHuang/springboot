package com.light.springboot.pojo;

import java.util.List;

public class Result {
	private int code;
	private List<String> msg;
	private List<TestJson> data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public List<String> getMsg() {
		return msg;
	}
	public void setMsg(List<String> msg) {
		this.msg = msg;
	}
	public List<TestJson> getData() {
		return data;
	}
	public void setData(List<TestJson> data) {
		this.data = data;
	}
	
	
}
