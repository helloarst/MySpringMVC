package com.tongtong.springmvc.web.service;

import java.util.List;

import com.tongtong.springmvc.entity.User;

public interface IUserService {

	String get(String name);
	List<User> list();
}
