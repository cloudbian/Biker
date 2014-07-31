package com.bjj.biker.service.model;

import java.io.Serializable;

/**
 *Author:cloudbian
 *CreateTime:2014年7月29日下午2:24:19
 */
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -65976707594490855L;
	private String id;
	private String userName;
	private String password;
	private String mobile;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
