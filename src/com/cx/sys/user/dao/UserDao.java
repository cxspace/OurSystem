package com.cx.sys.user.dao;

import com.cx.core.dao.BaseDao;
import com.cx.sys.user.entity.User;
import com.cx.sys.user.entity.UserTask;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;

/**
 * Created by cxspace on 16-11-11.
 */
public interface UserDao extends BaseDao<User> {

    //登录逻辑
    public List<User> findUserByAccountAndPwd(String account , String pwd);

    //保存用户任务关系
    public void saveUserTask(UserTask userTask);

    //通过项目id查到项目任务关系集合
    public List<UserTask> getUserTasksByUserId(String userId);

}
