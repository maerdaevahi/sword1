package com.dragon.vueDemo.bean;

public class AsynResult<T> {
	private String status;
	private String msg;
	private T data;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "AsynResult [status=" + status + ", msg=" + msg + ", data=" + data + "]";
	}
}
