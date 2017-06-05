package com.zhoooxy.znt.dao;

import java.util.List;

import com.zhoooxy.znt.model.User;

public interface UserDao {
	public void addUser(User u);
	public List<User> getUser();
	public void modUser();
	public boolean logUser();
	long findUserCount(User u);
}
