package com.cx.sys.user.service;

import com.cx.core.service.BaseService;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.user.entity.User;
import com.cx.sys.user.entity.UserTask;

import java.util.List;

/**
 * Created by cxspace on 16-11-11.
 */
public interface UserService extends BaseService<User>{

    public List<User> findUserByAccountAndPwd(String account , String pwd);

    public void saveUserTask(String userId , String taskId );

    public List<UserTask> getUserTasksByUserId(String userId);

    public User findUserByEmail(String email);

    public List<User> findUsersOrderByScore(QueryHelper queryHelper);

}
