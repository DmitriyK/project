package com.test.project.dao.impl;

import com.test.project.dao.iface.UserDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void show() {
        System.out.println(sessionFactory);
    }
}
