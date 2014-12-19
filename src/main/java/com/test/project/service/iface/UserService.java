package com.test.project.service.iface;

import com.test.project.model.User;

public interface UserService {

    public void addUser(User user);
    public User getUser(int id);
    public void updateUser(User user);
    public void deleteUser(User user);
}
