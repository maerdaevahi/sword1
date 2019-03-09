package com.dragon.vueDemo.bean;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.*;

@SuppressWarnings("deprecation")
public class User {
	private Integer userId;
	@NotEmpty
	private String username;
	@NotEmpty
	private String password;
	@NotEmpty
	private String address;
	@NotEmpty
	private String title;
	@NotEmpty
	private String sex;
	@Min(value = 18,message = "年龄不能小于18岁")
	@Max(value = 120,message = "年龄不能大于100岁")
	private Integer age;
	private String createTime;
	private String modifyTime;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", address=" + address
				+ ", title=" + title + ", sex=" + sex + ", age=" + age + ", createTime=" + createTime + ", modifyTime="
				+ modifyTime + "]";
	}
}
