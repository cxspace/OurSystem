package com.cx.core.dao.impl;

import com.cx.core.dao.BaseDao;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by cxspace on 16-11-11.
 */
public abstract class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T>{

    Class<T> clazz;

    public BaseDaoImpl(){

        //反射拿到对象的类型
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();

        clazz = (Class<T>)pt.getActualTypeArguments()[0];

    }

    @Override
    public void delete(Serializable id) {

        getHibernateTemplate().delete(findObjectById(id));

    }

    @Override
    public void save(T entity) {
        getHibernateTemplate().save(entity);
    }

    @Override
    public void update(T entity) {
        getHibernateTemplate().update(entity);
    }

    @Override
    public T findObjectById(Serializable id) {
        return getHibernateTemplate().get(clazz,id);
    }

    @Override
    public List<T> findObjects() {

        Query query = getSession().createQuery("FROM "+clazz.getSimpleName());

        return query.list();
    }
}
