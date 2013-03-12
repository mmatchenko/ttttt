package com.app.service.com.app.user;

import com.app.dao.DaoImpl;
import com.app.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements IUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private DaoImpl simpleDao;

    @Override
    public void deleteUser(User user) {
        simpleDao.delete(user);
    }

    @Override
    public void deleteUserById(long id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public User getUser(long id) {
        return simpleDao.getById(User.class,id);
    }

    @Override
    public void save(User user) {
        simpleDao.save(user);
    }

    public void setSimpleDao(DaoImpl simpleDao) {
        this.simpleDao = simpleDao;
    }
}
