package com.spring.learn.test.dao.impl;

import com.spring.learn.test.dao.UserDao;

public class UserDaoImpl implements UserDao {

	public void add() {
		System.out.println("用户添加........");
	}

	public void update() {
		System.out.println("用户更新........");
	}

	public void delete() {
		System.out.println("用户删除........");
	}

	public void select() {
		System.out.println("用户查询........");
	}

}
