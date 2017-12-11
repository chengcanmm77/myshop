package com.bucket.shop.common;

import java.io.Serializable;

public class Result<T> implements Serializable {
	private static final long serialVersionUID = 9050338434877548128L;
	
	private T data;
	
	private Boolean success;
	
	private String message;
	
	private String resultCode;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}


}
