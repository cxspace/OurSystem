package com.cx.sys.res_link.action;

import com.cx.core.action.BaseAction;
import com.cx.core.constant.Constant;
import com.cx.core.page.PageResult;
import com.cx.core.utils.DateTimeHelper;
import com.cx.core.utils.QueryHelper;
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
public class ResLinkSysAction extends BaseAction {

    @Resource
    private ResLinkService resLinkService;

    private ResLink resLink;

    private String [] selectedRow;

    private List<ResLink> resLinkList;

    private PageResult pageResult;

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

        QueryHelper queryHelper = new QueryHelper(ResLink.class , "i");

        queryHelper.addOrderByProperty("i.time",QueryHelper.ORDER_BY_DESC);

        pageResult = resLinkService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "listUI";
    }

    public String addUI() throws Exception {
        return "addUI";
    }

    public String add(){

        if (resLink!=null){

            User user = (User) ActionContext.getContext().getSession().get(Constant.USER);
            resLink.setCreate_person(user.getUser_name());
            resLink.setTime(DateTimeHelper.getCurrentDateTime());
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
            resLink.setTime(DateTimeHelper.getCurrentDateTime());
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

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }

    public String[] getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(String[] selectedRow) {
        this.selectedRow = selectedRow;
    }
}
