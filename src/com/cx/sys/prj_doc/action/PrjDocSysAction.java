package com.cx.sys.prj_doc.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by cxspace on 16-11-13.
 */
public class PrjDocSysAction extends ActionSupport {

    public String listUI() throws Exception {
        return "listUI";
    }
    public String addUI() throws Exception {
        return "addUI";
    }

    public String editUI() throws Exception {
        return "addUI";
    }

    public String prj_list() throws Exception{
        return "prj_list";
    }
    
}
