package com.test.project.service.common;

import java.util.List;

public interface CommonService {

    public <T> void addEntity(T entity);

    public <T> void updateEntity(T entity);

    public <T> void deleteEntity(T entity);

    public <T> T getEntity(int id, Class<T> clazz);

    public <T> List<T> getList(Class<T> clazz);
}
