package com.yang.lotterytest.util;

public class JsonResult {
	public static final String SUCCESS = "success";
	public static final String FAIL = "fail";
	private String result;
	private Object data;
	private String message;

	public JsonResult() {
	}

	public JsonResult(String result, Object data, String message) {
		this.result = result;
		this.data = data;
		this.message = message;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
