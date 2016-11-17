package com.cx.sys.user.service;

import com.cx.core.service.BaseService;
import com.cx.sys.user.entity.User;

import java.util.List;

/**
 * Created by cxspace on 16-11-11.
 */
public interface UserService extends BaseService<User>{

    public List<User> findUserByAccountAndPwd(String account , String pwd);

}
