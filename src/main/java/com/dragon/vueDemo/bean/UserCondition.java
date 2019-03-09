package com.dragon.vueDemo.bean;

public class UserCondition {
	private Integer userId;
	private String username;
	private String password;
	private String address;
	private String title;
	private String sex;
	private Integer minAge;
	private Integer maxAge;
	private String minCreateTime;
	private String maxCreateTime;
	private String minModifyTime;
	private String maxModifyTime;
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
	
	public Integer getMinAge() {
		return minAge;
	}
	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}
	public Integer getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}
	public String getMinCreateTime() {
		return minCreateTime;
	}
	public void setMinCreateTime(String minCreateTime) {
		this.minCreateTime = minCreateTime;
	}
	public String getMaxCreateTime() {
		return maxCreateTime;
	}
	public void setMaxCreateTime(String maxCreateTime) {
		this.maxCreateTime = maxCreateTime;
	}
	public String getMinModifyTime() {
		return minModifyTime;
	}
	public void setMinModifyTime(String minModifyTime) {
		this.minModifyTime = minModifyTime;
	}
	public String getMaxModifyTime() {
		return maxModifyTime;
	}
	public void setMaxModifyTime(String maxModifyTime) {
		this.maxModifyTime = maxModifyTime;
	}
	@Override
	public String toString() {
		return "UserCondition [userId=" + userId + ", username=" + username + ", password=" + password + ", address="
				+ address + ", title=" + title + ", sex=" + sex + ", minAge=" + minAge + ", maxAge=" + maxAge
				+ ", minCreateTime=" + minCreateTime + ", maxCreateTime=" + maxCreateTime + ", minModifyTime="
				+ minModifyTime + ", maxModifyTime=" + maxModifyTime + "]";
	}
}
