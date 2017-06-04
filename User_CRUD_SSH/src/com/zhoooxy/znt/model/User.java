package com.zhoooxy.znt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="t_user")
public class User {
	private int Userid;
	private String UserName;
	private String PassWord;
	private String Email;
	private Date Rig_date;
	

	@Id
	@GeneratedValue
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	
	public Date getRig_date() {
		return Rig_date;
	}
	public void setRig_date(Date rig_date) {
		Rig_date = rig_date;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

}
