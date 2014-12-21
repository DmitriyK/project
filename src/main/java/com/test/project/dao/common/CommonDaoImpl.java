package com.test.project.dao.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CommonDaoImpl{

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Transactional
    public <T> void addEntity(T entity) {
        sessionFactory.getCurrentSession().saveOrUpdate(entity);
    }

    public <T> void updateEntity(T entity) {
        sessionFactory.getCurrentSession().saveOrUpdate(entity);
    }

    public <T> void deleteEntity(T entity) {
        sessionFactory.getCurrentSession().delete(entity);
    }

    public <T> T getEntity(int id, Class<T> clazz) {
        return (T) sessionFactory.getCurrentSession().get(clazz, id);
    }

    public <T> List<T> getList(Class<T> clazz) {
        return sessionFactory.getCurrentSession().createCriteria(clazz).list();
    }
}
