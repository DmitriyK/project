package com.test.project.service.impl;

import com.test.project.dao.iface.UserDao;
import com.test.project.service.iface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void show() {
        userDao.show();
    }
}
