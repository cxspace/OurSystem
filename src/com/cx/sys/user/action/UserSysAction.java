package com.cx.sys.user.action;

import com.cx.core.utils.ImageHelper;
import com.cx.sys.user.entity.User;
import com.cx.sys.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by cxspace on 16-11-10.
 */
public class UserSysAction extends ActionSupport {

    @Resource
    private UserService userService;


    private User user;


    private File headImg;
    private String headImgContentType;
    private String headImgFileName;


    private List<User> userList = new ArrayList<User>();
    public String[] selectedRow;


    public String listUI(){

        userList = userService.findObjects();

        return "listUI";
    }

    public String list(){
        return "list";
    }

    public String addUI(){
        return "addUI";
    }

    //添加用户
    public String add(){

      //  System.out.println(headImgFileName);

       // System.out.println(user);

        if (user != null && (headImgFileName != null))

        {
            //设置用户的初始密码和帐号一样
            user.setPassword(user.getAccount());

            //设置头像存储路径,保存头像文件
            ImageHelper.saveHeadImg(headImg,user,headImgFileName);

            System.out.println("0");
            userService.save(user);

            System.out.println("1");

            return "list";
        }else {

            HttpServletRequest request = ServletActionContext.getRequest();

            request.setAttribute("errorMessage","添加失败,请选择头像文件！");

            return "addUI";
        }


    }

    //删除用户
    public String delete(){

        if (user.getId() != null){

            userService.delete(user.getId());

        }

        return "list";
    }


    //删除选中用户
    public String deleteSelected(){

        if (selectedRow != null)
        {
            for (String id : selectedRow) {
                userService.delete(id);
            }
        }

        return "list";
    }

    //编辑用户页面
    public String editUI(){

        if (user.getId()!=null){

            user = userService.findObjectById(user.getId());

            return "editUI";
        }else {

            return "list";
        }

    }


    //编辑逻辑处理
    public String edit(){
        System.out.println(user.getId());

        if (user.getId()!=null){

          //  user.setPassword(user.getAccount());
            userService.update(user);
        }

        return "list";
    }


//    //保存头像
//    public void saveHeadImg(File headImg , User user ){
//
//        try {
//
//            //处理头像上传
//            if (headImg != null){
//                //1.保存头像文件到指定目录
//                String filePath = ServletActionContext.getServletContext().getRealPath("upload/user");
//
//                String fileName = UUID.randomUUID().toString().replaceAll("-","")+headImgFileName.substring(headImgFileName.lastIndexOf("."));
//
//                FileUtils.copyFile(headImg,new File(filePath,fileName));
//
//                //设置好数据库中要存储的图像路径
//                user.setHead_img("user/"+fileName);
//
//                System.out.println(fileName);
//            }
//
//        }catch (Exception e){
//            LOG.error(e.getMessage());
//            e.printStackTrace();
//        }
//
//    }


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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


    public String[] getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(String[] selectedRow) {
        this.selectedRow = selectedRow;
    }


    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

}
