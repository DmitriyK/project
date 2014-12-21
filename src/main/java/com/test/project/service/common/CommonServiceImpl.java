package com.test.project.service.common;

import com.test.project.dao.common.CommonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonServiceImpl{

    @Autowired
    private CommonDao commonDao;

    public <T> void addEntity(T entity) {
        commonDao.addEntity(entity);
    }

    public <T> void updateEntity(T entity) {
        commonDao.updateEntity(entity);
    }

    public <T> void deleteEntity(T entity) {
        deleteEntity(entity);
    }

    public <T> T getEntity(int id, Class<T> clazz) {
        return (T) commonDao.getEntity(id, clazz);
    }

    public <T> List<T> getList(Class<T> clazz) {
        return commonDao.getList(clazz);
    }
}
