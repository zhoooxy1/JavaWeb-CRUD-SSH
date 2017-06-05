package com.zhoooxy.znt.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zhoooxy.znt.model.User;
import com.zhoooxy.znt.service.UserService;
import com.zhoooxy.znt.vo.UserInfo;

import org.apache.struts2.ServletActionContext;
import org.json.JSONObject;

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



	public String execute() throws ServletException, IOException{
		User u = new User();
		u.setUserName(info.getUsername());
		u.setPassWord(info.getPassword());
		u.setEmail(info.getEmail());
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		String date = sdf.format(new Date());
		u.setRig_date(date);
		JSONObject jb = new JSONObject();
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpServletResponse resp = ServletActionContext.getResponse();
		PrintWriter out = resp.getWriter();
		System.out.print(userservice.findUserCount(u));
		if(userservice.findUserCount(u)){
			jb.put("code", -1);
		}else{
			jb.put("code", 1);
			userservice.addUser(u);
			req.getSession().setAttribute("Userlog", u);
		}
		out.print(jb);
		out.flush();
		out.close();
		return "success";
	}

	@Override
	public UserInfo getModel() {
		// TODO Auto-generated method stub
		return this.info;
	}
}
