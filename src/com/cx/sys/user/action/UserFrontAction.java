package com.cx.sys.user.action;

import com.cx.core.action.BaseAction;
import com.cx.core.constant.Constant;
import com.cx.core.page.PageResult;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.inform.entity.Inform;
import com.cx.sys.inform.service.InformService;
import com.cx.sys.user.entity.User;
import com.cx.sys.user.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by cxspace on 16-11-11.
 */

public class UserFrontAction extends BaseAction {

    private User user;

    private Inform inform;

    private List<Inform> informList = new ArrayList<>();

    @Resource
    private InformService informService;

    @Resource
    private UserService userService;

    private PageResult pageResult;


    private String phone;

    private String email;

    private String birthday;

    private String password;

    private String head_img;

    public String info(){

        //分页查询Inform中数据
        QueryHelper queryHelper = new QueryHelper(Inform.class,"i");

        queryHelper.addCondition("i.state = ? ",1);

        queryHelper.addOrderByProperty("i.createTime",QueryHelper.ORDER_BY_DESC);

        pageResult = informService.getPageResult(queryHelper,getPageNo(),getPageSize());

        user = (User) ActionContext.getContext().getSession().get(Constant.USER);

        return "info";

    }


    public String change_information(){

        user = (User) ActionContext.getContext().getSession().get(Constant.USER);
        return "change_information";

    }

    public String info_detail(){

        user = (User) ActionContext.getContext().getSession().get(Constant.USER);

        if (inform!=null){

            if (inform.getId()!=null){

                inform = informService.findObjectById(inform.getId());

            }

        }

        return "info_detail";
    }

    public String change_phone(){

        user = (User) ActionContext.getContext().getSession().get(Constant.USER);

        if (phone!=null) {
            user.setPhone(phone);
            userService.update(user);
        }

        return "change_information";
    }

    public String change_email(){

        user = (User) ActionContext.getContext().getSession().get(Constant.USER);

        if (email!=null){
            user.setEmail(email);
            userService.update(user);
        }

        return "change_information";
    }


    public String change_birthday(){

        user = (User) ActionContext.getContext().getSession().get(Constant.USER);

        if (birthday!=null){
            user.setBirthday(new Date(birthday));
        }

        return "change_information";
    }


    public String change_password(){

        return "change_information";
    }


    public String change_headImg(){

        return "change_information";
    }

    public String prj_list(){

        return "prj_list";
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

    public Inform getInform() {
        return inform;
    }

    public void setInform(Inform inform) {
        this.inform = inform;
    }

    public List<Inform> getInformList() {
        return informList;
    }

    public void setInformList(List<Inform> informList) {
        this.informList = informList;
    }

    public InformService getInformService() {
        return informService;
    }

    public void setInformService(InformService informService) {
        this.informService = informService;
    }

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHead_img() {
        return head_img;
    }

    public void setHead_img(String head_img) {
        this.head_img = head_img;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
