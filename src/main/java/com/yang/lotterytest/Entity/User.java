package com.yang.lotterytest.Entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = -8098476265201703703L;

	private int id;
	private String name;
	private String password;
	private String email;
	private Date createTime;
	private Date resetPwdAvilibaleTime;
	private String identifyingCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getResetPwdAvilibaleTime() {
		return resetPwdAvilibaleTime;
	}

	public void setResetPwdAvilibaleTime(Date resetPwdAvilibaleTime) {
		this.resetPwdAvilibaleTime = resetPwdAvilibaleTime;
	}

	public String getIdentifyingCode() {
		return identifyingCode;
	}

	public void setIdentifyingCode(String identifyingCode) {
		this.identifyingCode = identifyingCode;
	}
}
