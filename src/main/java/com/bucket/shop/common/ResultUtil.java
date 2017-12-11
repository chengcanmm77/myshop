package com.bucket.shop.common;

public class ResultUtil {

	public static <T>Result<T> newSuccessResult(){
		return newSuccessResult(null,null,0);
	}
	
	public static <T>Result<T> newSuccessResult(T data) {
		return newSuccessResult(data,null,0);
	}
	
	public static <T>Result<T> newSuccessResult(T data,int totalRecord) {
		return newSuccessResult(data,null,totalRecord);
	}
	
	public static <T>Result<T> newSuccessResult(T data,String message) {
		return newSuccessResult(data,message,0);
	}
	
	public static <T>Result<T> newSuccessResult(T data,String message,int totalRecord){
		Result<T> result = new Result<T>();
		result.setSuccess(true);
		result.setData(data);
		result.setMessage(message);
		return result;
	}
	
	public static <T>Result<T> newFailResult(String message){
		return newFailResult(message,null);
	}
	
	public static <T>Result<T> newFailResult(String message,String errCode) {
		Result<T> result = new Result<T>();
		result.setSuccess(false);
		result.setMessage(message);
		result.setResultCode(errCode);
		return result;
	}
}
