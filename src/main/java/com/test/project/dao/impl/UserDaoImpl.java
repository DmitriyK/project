package com.test.project.dao.impl;

import com.test.project.dao.common.CommonDaoImpl;
import com.test.project.dao.iface.UserDao;
import com.test.project.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDaoImpl extends CommonDaoImpl implements UserDao {

    @Override
    @Transactional
    public User findByUserName(String username) {
        User user = (User) getSession().createQuery("from User where username = :username").setParameter("username", username).uniqueResult();
        return user;
    }
}