package com.cx.sys.learn_site.action;

import com.cx.core.action.BaseAction;
import com.cx.core.page.PageResult;
import com.cx.core.utils.DateTimeHelper;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.learn_site.entity.LearnSite;
import com.cx.sys.learn_site.service.LearnSiteService;
import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-18.
 */
public class LearnSiteFrontAction extends BaseAction{

    @Resource
    private LearnSiteService learnSiteService;

    private LearnSite learnSite;

    private PageResult pageResult;

    public String site_list(){

        QueryHelper queryHelper = new QueryHelper(LearnSite.class,"i");

        queryHelper.addOrderByProperty("i.time",QueryHelper.ORDER_BY_DESC);

        pageResult = learnSiteService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "site_list";
    }

    public String site_add(){

        return "site_add";
    }

    public String site_detail(){

        if (learnSite!=null){

            if (learnSite.getId()!=null){

                learnSite = learnSiteService.findObjectById(learnSite.getId());

            }

        }

        return "site_detail";
    }

    public String add(){

        if (learnSite!=null){

            learnSite.setTime(DateTimeHelper.getCurrentDateTime());

            learnSiteService.save(learnSite);

        }

        return "list";
    }


    public LearnSite getLearnSite() {
        return learnSite;
    }

    public void setLearnSite(LearnSite learnSite) {
        this.learnSite = learnSite;
    }

    public LearnSiteService getLearnSiteService() {
        return learnSiteService;
    }

    public void setLearnSiteService(LearnSiteService learnSiteService) {
        this.learnSiteService = learnSiteService;
    }

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }
}
