package com.cx.sys.project.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by cxspace on 16-11-13.
 */
public class ProjectSysAction extends ActionSupport {

    public String listUI() throws Exception {
        return "listUI";
    }

    public String addUI() throws Exception {
        return "addUI";
    }

    public String editUI() throws Exception {
        return "editUI";
    }

}
