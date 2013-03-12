package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DaoImpl;
import com.app.model.User;


@org.springframework.stereotype.Service
public class UserService implements Service {
	@Autowired
    private DaoImpl dao;
	
	@Transactional
	public void addUser(User user) {
		dao.save(user);
	}
	@Transactional
	public List<User> loadAll() {
		return dao.getAll();
	}

	 public User getUser(long id) {
	        return dao.getById(User.class,id);
	 }
	
	public void setDao(DaoImpl dao) {
		this.dao = dao;
	}
	public DaoImpl getDao() {
		return dao;
	}

}
