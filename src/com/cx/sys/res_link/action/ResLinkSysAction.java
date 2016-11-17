package com.cx.sys.res_link.action;

import com.cx.core.constant.Constant;
import com.cx.sys.res_link.entity.ResLink;
import com.cx.sys.res_link.service.ResLinkService;
import com.cx.sys.user.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by cxspace on 16-11-16.
 */
public class ResLinkSysAction extends ActionSupport {

    @Resource
    private ResLinkService resLinkService;

    private ResLink resLink;

    private String [] selectedRow;

    private List<ResLink> resLinkList;

    public String delete(){

        if (resLink!=null){

            if (resLink.getId()!=null){

                resLinkService.delete(resLink.getId());

            }

        }

        return "list";
    }

    public String deleteSelected(){

        if (selectedRow!=null){

            for (String id : selectedRow){
                resLinkService.delete(id);
            }

        }


        return "list";
    }

    public String listUI() throws Exception {

        resLinkList = resLinkService.findObjects();

        return "listUI";
    }

    public String addUI() throws Exception {
        return "addUI";
    }

    public String add(){

        if (resLink!=null){

            User user = (User) ActionContext.getContext().getSession().get(Constant.USER);
            resLink.setCreate_person(user.getUser_name());
            resLink.setTime(new Timestamp(new Date().getTime()));
            resLinkService.save(resLink);

        }

        return "list";
    }

    public String editUI() throws Exception {

        if (resLink!=null){

            if (resLink.getId()!=null){

                resLink = resLinkService.findObjectById(resLink.getId());

            }

        }

        return "editUI";
    }

    public String edit(){

        if (resLink!=null){

            resLinkService.update(resLink);

        }

        return "list";
    }

    public ResLink getResLink() {
        return resLink;
    }

    public void setResLink(ResLink resLink) {
        this.resLink = resLink;
    }

    public List<ResLink> getResLinkList() {
        return resLinkList;
    }

    public void setResLinkList(List<ResLink> resLinkList) {
        this.resLinkList = resLinkList;
    }

    public ResLinkService getResLinkService() {
        return resLinkService;
    }

    public void setResLinkService(ResLinkService resLinkService) {
        this.resLinkService = resLinkService;
    }

    public String[] getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(String[] selectedRow) {
        this.selectedRow = selectedRow;
    }
}
