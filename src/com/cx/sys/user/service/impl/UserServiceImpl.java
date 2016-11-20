package com.cx.sys.user.service.impl;

import com.cx.core.service.BaseService;
import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.prj_task.entity.PrjTask;
import com.cx.sys.user.dao.UserDao;
import com.cx.sys.user.entity.User;
import com.cx.sys.user.entity.UserTask;
import com.cx.sys.user.entity.UserTaskId;
import com.cx.sys.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cxspace on 16-11-11.
 */

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

    private UserDao userDao;

    @Resource
    public void setUserDao(UserDao userDao) {
        super.setBaseDao(userDao);
        this.userDao = userDao;
    }

    @Override
    public List<User> findUserByAccountAndPwd(String account, String pwd) {
        return userDao.findUserByAccountAndPwd(account,pwd);
    }

    @Override
    public List<UserTask> getUserTasksByUserId(String userId) {
        return userDao.getUserTasksByUserId(userId);
    }

    @Override
    public void saveUserTask(String userId, String taskId) {
        userDao.saveUserTask(new UserTask(new UserTaskId(new PrjTask(taskId),userId)));
    }

    @Override
    public User findUserByEmail(String email) {
        return userDao.findUserByEmail(email);
    }

    @Override
    public List<User> findUsersOrderByScore(QueryHelper queryHelper) {
        return userDao.findUsersOrderByScore(queryHelper);
    }
}
