package com.zhoooxy.znt.service;

import java.util.List;

import com.zhoooxy.znt.model.User;

public interface UserService {
	public void addUser(User u);
	public List<User> getUser();
	public void modUser();
	public boolean logUser();
}
