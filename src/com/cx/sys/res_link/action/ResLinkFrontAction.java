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

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-18.
 */
public class ResLinkFrontAction extends BaseAction{

    @Resource
    private ResLinkService resLinkService;

    private ResLink resLink;

    private PageResult pageResult;


    public String link_list(){

        QueryHelper queryHelper = new QueryHelper(ResLink.class , "i");

        queryHelper.addOrderByProperty("i.time",QueryHelper.ORDER_BY_DESC);

        pageResult = resLinkService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "link_list";
    }

    public String addLink(){

        if (resLink != null){
            User user = (User) ActionContext.getContext().getSession().get(Constant.USER);
            resLink.setCreate_person(user.getUser_name());
            resLink.setTime(DateTimeHelper.getCurrentDateTime());

            resLinkService.save(resLink);
        }


        return "list";
    }

    public String link_add(){

        return "link_add";
    }

    public String link_detail(){

        if (resLink!=null){

            if (resLink.getId()!=null){

                resLink = resLinkService.findObjectById(resLink.getId());

            }

        }

        return "link_detail";
    }

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }

    public ResLink getResLink() {
        return resLink;
    }

    public void setResLink(ResLink resLink) {
        this.resLink = resLink;
    }

    public ResLinkService getResLinkService() {
        return resLinkService;
    }

    public void setResLinkService(ResLinkService resLinkService) {
        this.resLinkService = resLinkService;
    }
}
