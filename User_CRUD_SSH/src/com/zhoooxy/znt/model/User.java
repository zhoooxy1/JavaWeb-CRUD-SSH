package com.zhoooxy.znt.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="t_user")
public class User {
	private int Userid;
	private String UserName;
	private String PassWord;
	private String Email;
	private String Rig_date;
	

	public String getRig_date() {
		return Rig_date;
	}
	public void setRig_date(String rig_date) {
		Rig_date = rig_date;
	}
	@Id
	@GeneratedValue
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
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
