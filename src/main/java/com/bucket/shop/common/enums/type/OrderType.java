package com.bucket.shop.common.enums.type;

public enum OrderType {
	
	new_create(1,"待付款"),
	close(4,"交易关闭");

	private int code;
	
	private String name;
	
	private OrderType(int code,String name) {
		this.code = code;
		this.name = name;
	}
	
	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
}

	
