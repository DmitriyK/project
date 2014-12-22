package com.test.project.dao.impl;

import com.test.project.dao.common.CommonDaoImpl;
import com.test.project.dao.iface.UserDao;
import com.test.project.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends CommonDaoImpl implements UserDao {

    @Override
    public User findByUserName(String username) {
        User user = (User) getSession().createQuery("from user where username=?").setParameter(0, username).uniqueResult();
        return user;
    }
}