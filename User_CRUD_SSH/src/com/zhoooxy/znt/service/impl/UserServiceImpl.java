package com.zhoooxy.znt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zhoooxy.znt.dao.UserDao;
import com.zhoooxy.znt.model.User;
import com.zhoooxy.znt.service.UserService;

@Component("UserService")
public class UserServiceImpl implements UserService {

	
	private UserDao userdao ;
	
	public UserDao getUserdao() {
		return userdao;
	}

	@Resource(name="UserDao")
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public void addUser(User u) {
		this.userdao.addUser(u);

	}

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean logUser() {
		// TODO Auto-generated method stub
		return false;
	}

}
