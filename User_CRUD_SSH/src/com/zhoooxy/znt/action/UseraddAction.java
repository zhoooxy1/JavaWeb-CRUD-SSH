package com.zhoooxy.znt.action;

import java.util.Date;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zhoooxy.znt.model.User;
import com.zhoooxy.znt.service.UserService;
import com.zhoooxy.znt.vo.UserInfo;

public class UseraddAction extends ActionSupport implements ModelDriven<UserInfo>{

	UserService userservice ;
	UserInfo info = new UserInfo();
	
	

	public UserService getUserservice() {
		return userservice;
	}


	@Resource(name="UserService")
	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}



	public UserInfo getInfo() {
		return info;
	}



	public void setInfo(UserInfo info) {
		this.info = info;
	}



	public String execute(){
		User u = new User();
		u.setUserName(info.getUsername());
		u.setPassWord(info.getPassword());
		u.setEmail(info.getEmail());
		u.setRig_date(new Date());
		userservice.addUser(u);
		
		return "success";
		
	}


	@Override
	public UserInfo getModel() {
		// TODO Auto-generated method stub
		return this.info;
	}
}
