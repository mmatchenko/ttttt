package com.app.service.com.app.user;

import com.app.model.User;

public interface IUserService {
    public void deleteUser(User user);
    public void deleteUserById(long id);
    public User getUser(long id);
    public void save(User user);


}
