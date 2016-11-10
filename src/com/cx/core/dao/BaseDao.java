package com.cx.core.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cxspace on 16-11-10.
 */
public interface BaseDao <T>{

//    basedao抽取

    public void save(T entity);

    public void update(T entity);

    public void delete(Serializable id);

    public T findObjectById(Serializable id);

    public List<T> findObjects();

}
