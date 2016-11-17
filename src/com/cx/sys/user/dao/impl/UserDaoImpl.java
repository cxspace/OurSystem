package com.cx.sys.user.dao.impl;

import com.cx.core.dao.impl.BaseDaoImpl;
import com.cx.sys.user.dao.UserDao;
import com.cx.sys.user.entity.User;
import org.hibernate.Query;

import java.util.List;

/**
 * Created by cxspace on 16-11-11.
 */

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
    @Override
    public List<User> findUserByAccountAndPwd(String account, String pwd) {

        Query query = getSession().createQuery("FROM User WHERE account = ? and password = ?");

        query.setParameter(0,account);

        query.setParameter(1,pwd);

        return query.list();
    }
}
