package com.light.springboot.pojo;

import java.util.Map;

public class TestJson {
	private String sn;
	private String productLine;
	private String processCode;
	private String name;
	private String result;
	private Map<String, String> data;

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getProcessCode() {
		return processCode;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "TestJson [sn=" + sn + ", productLine=" + productLine + ", processCode=" + processCode + ", name=" + name
				+ ", result=" + result + ", data=" + data + "]";
	}

	public TestJson(String sn, String productLine, String processCode, String name, String result,
			Map<String, String> data) {
		super();
		this.sn = sn;
		this.productLine = productLine;
		this.processCode = processCode;
		this.name = name;
		this.result = result;
		this.data = data;
	}

	public TestJson() {
	}

}
