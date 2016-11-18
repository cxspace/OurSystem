package com.cx.sys.user.action;

import com.cx.core.action.BaseAction;
import com.cx.core.constant.Constant;
import com.cx.core.page.PageResult;
import com.cx.core.utils.ImageHelper;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.inform.entity.Inform;
import com.cx.sys.inform.service.InformService;
import com.cx.sys.prj_task.entity.PrjTask;
import com.cx.sys.prj_task.service.PrjTaskService;
import com.cx.sys.user.entity.User;
import com.cx.sys.user.entity.UserTask;
import com.cx.sys.user.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import javax.annotation.Resource;
import java.io.File;
import java.sql.Timestamp;
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

    private PrjTask prjTask;

    private List<PrjTask> prjTaskList = new ArrayList<>();

    @Resource
    private InformService informService;

    @Resource
    private UserService userService;

    @Resource
    private PrjTaskService prjTaskService;

    //分页结果集合

    private PageResult pageResult;

    private String password_old;

    private String phone;

    private String email;

    private String birthday;

    private String password;

    private File headImg;

    private String headImgContentType;

    private String headImgFileName;

    private String Msg;

    public String info(){

        //分页查询Inform中数据
        QueryHelper queryHelper = new QueryHelper(Inform.class,"i");

        queryHelper.addCondition("i.state = ? ",1);

        queryHelper.addOrderByProperty("i.createTime",QueryHelper.ORDER_BY_DESC);

        pageResult = informService.getPageResult(queryHelper,getPageNo(),getPageSize());

        user = userService.findObjectById(((User) ActionContext.getContext().getSession().get(Constant.USER)).getId());

        return "info";

    }




    //修改信息页面
    public String change_information(){

        user = userService.findObjectById(((User) ActionContext.getContext().getSession().get(Constant.USER)).getId());

        return "change_information";

    }

    //通知详细
    public String info_detail(){

        user = (User) ActionContext.getContext().getSession().get(Constant.USER);

        if (inform!=null){

            if (inform.getId()!=null){

                inform = informService.findObjectById(inform.getId());

            }

        }

        return "info_detail";
    }

    //修改电话
    public String change_phone(){

        user = (User) ActionContext.getContext().getSession().get(Constant.USER);

        if (phone!=null) {
            user.setPhone(phone);
            userService.update(user);
        }else {
            Msg ="请填写新电话!";
        }

        return "change_information";
    }

    //修改邮箱
    public String change_email(){

        user = (User) ActionContext.getContext().getSession().get(Constant.USER);

        if (email!=null){
            user.setEmail(email);
            userService.update(user);
        }else {
            Msg = "请填写新的邮箱号!";
        }

        return "change_information";
    }


    //修改生日
    public String change_birthday(){

        user = (User) ActionContext.getContext().getSession().get(Constant.USER);

        if (birthday!=null){
            user.setBirthday(birthday);
            userService.update(user);
        }else {
            Msg = "请选择日期!";
        }

        return "change_information";
    }


    //修改密码
    public String change_password(){

        if (password_old.equals("")||password.equals("")){
             Msg="输入密码不能为空!";
        }else {
            if (password_old.equals(password)){

                user = (User) ActionContext.getContext().getSession().get(Constant.USER);

                user.setPassword(password);

                userService.update(user);

                 Msg = "修改密码成功,请用新密码登录";

                return "toLoginUI";

            }else {
                 Msg = "两次输入密码不一致!";
            }

        }


        return "change_information";
    }


    public String change_headImg(){

        if (headImg != null){

            user = (User) ActionContext.getContext().getSession().get(Constant.USER);

            ImageHelper.saveHeadImg(headImg,user,headImgFileName);

            userService.update(user);

        }else {
            Msg = "请选择上传图片!";
        }

        return "change_information";
    }

    //查看用户项目任务列表
    public String prj_list(){

        User user1 = (User) ActionContext.getContext().getSession().get(Constant.USER);

        //要显示用户信息
        user = userService.findObjectById(user1.getId());
        //拿到用户项目任务关系集合
        List<UserTask> list = userService.getUserTasksByUserId(user1.getId());

        for (int i = 0 ; i < list.size() ; i++){

            prjTaskList.add(list.get(i).getId().getPrjTask());

        }


        return "prj_list";
    }

    //提交任务
    public String submit_task(){

        if (prjTask!=null){

            if (prjTask.getId()!=null){

                prjTask = prjTaskService.findObjectById(prjTask.getId());

                //状态改为提交
                prjTask.setState(2);

                prjTaskService.update(prjTask);

            }

        }

        return "list";
    }


    public String getPassword_old() {
        return password_old;
    }

    public void setPassword_old(String password_old) {
        this.password_old = password_old;
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


    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
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

    public File getHeadImg() {
        return headImg;
    }

    public void setHeadImg(File headImg) {
        this.headImg = headImg;
    }

    public String getHeadImgContentType() {
        return headImgContentType;
    }

    public void setHeadImgContentType(String headImgContentType) {
        this.headImgContentType = headImgContentType;
    }

    public String getHeadImgFileName() {
        return headImgFileName;
    }

    public void setHeadImgFileName(String headImgFileName) {
        this.headImgFileName = headImgFileName;
    }

    public PrjTask getPrjTask() {
        return prjTask;
    }

    public void setPrjTask(PrjTask prjTask) {
        this.prjTask = prjTask;
    }

    public List<PrjTask> getPrjTaskList() {
        return prjTaskList;
    }

    public void setPrjTaskList(List<PrjTask> prjTaskList) {
        this.prjTaskList = prjTaskList;
    }

    public PrjTaskService getPrjTaskService() {
        return prjTaskService;
    }

    public void setPrjTaskService(PrjTaskService prjTaskService) {
        this.prjTaskService = prjTaskService;
    }
}
