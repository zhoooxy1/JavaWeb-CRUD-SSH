package com.zhoooxy.znt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.zhoooxy.znt.dao.UserDao;
import com.zhoooxy.znt.model.User;

@Component("UserDao")
public class UserDaoImpl implements UserDao {
	
	
	private HibernateTemplate hibernateTemplate ;
	
	public HibernateTemplate gethibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void addUser(User u) {
		this.hibernateTemplate.save(u);
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

	@Override
	public long findUserCount(User u) {
		String hql = "select count(*) as a from t_user where username = ? or email = ? ";
		long i = (long)this.hibernateTemplate.find(hql,u.getUserName(),u.getEmail()).listIterator().next();
		return i;
	}

}
