package com.test.project.dao.iface;

import com.test.project.model.User;

public interface UserDao {

    public void addUser(User user);
    public User getUser(int id);
    public void updateUser(User user);
    public void deleteUser(User user);
}
