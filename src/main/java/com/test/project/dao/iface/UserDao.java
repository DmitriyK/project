package com.test.project.dao.iface;

import com.test.project.dao.common.CommonDao;
import com.test.project.domain.User;

public interface UserDao extends CommonDao{

    public User findByUserName(String username);
}
