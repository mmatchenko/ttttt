package com.app.service;

import java.util.List;

import com.app.model.User;

public interface Service {
	void addUser(User user);
	List<User> loadAll();
	
}
