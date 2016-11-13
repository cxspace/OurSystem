package com.cx.sys.user.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by cxspace on 16-11-11.
 */
public class UserFrontAction extends ActionSupport {

    public String info(){
        return "info";
    }

    public String change_information(){
        return "change_information";
    }

    public String info_detail(){

        return "info_detail";
    }

    public String prj_list(){

        return "prj_list";
    }


}
