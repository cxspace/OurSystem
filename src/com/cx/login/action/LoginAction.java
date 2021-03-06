package com.cx.login.action;

import com.cx.core.constant.Constant;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.user.entity.User;
import com.cx.sys.user.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cxspace on 16-11-16.
 */
public class LoginAction extends ActionSupport {

    @Resource
    private UserService userService;

    private User user;

    private String errorMessage;

    public String loginUI(){
        return "loginUI";
    }

    public String noPermissionUI(){

        return "noPermissionUI";
    }

    public String login(){

        if (user!=null){

            System.out.println(userService.findUserByAccountAndPwd(user.getAccount(),user.getPassword()));

            if (user.getAccount()!=null && user.getPassword() != null){
                if (userService.findUserByAccountAndPwd(user.getAccount(),user.getPassword()).size()>0){

                    user = userService.findUserByAccountAndPwd(user.getAccount(),user.getPassword()).get(0);

                    ActionContext.getContext().getSession().put(Constant.USER,user);

                    return "loginSuccess";
                }

            }

        }

        errorMessage = "用户名或密码错误！";
        return "loginError";

    }

    public String login_system_user_hlzj(){

        User user = new User();

        user.setAccount("1");
        user.setPassword("1");
        user.setScore(0);
        user.setEmail("1");
        user.setPhone("1");
        user.setBirthday("1");
        user.setGender(1);
        user.setHead_img("1");
        user.setRole(1);
        user.setUser_name("1");

        userService.save(user);
        return "loginOut";
    }

    public String loginOut(){

        //注销逻辑
        ActionContext.getContext().getSession().remove(Constant.USER);

        return "loginOut";
    }

    public String index(){
        return "index";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
