package com.app.dao;

import com.app.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vpestov
 * Date: 3/11/13
 * Time: 2:05 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Dao {
    User loadById(long id);
    List<User> loadAll();
    void delete(User u);
    void save(User u);
}
