package com.cx.sys.learn_site.action;

import com.cx.core.action.BaseAction;
import com.cx.core.page.PageResult;
import com.cx.core.utils.DateTimeHelper;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.learn_site.entity.LearnSite;
import com.cx.sys.learn_site.service.LearnSiteService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.config.entities.PackageConfig;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cxspace on 16-11-16.
 */
public class LearnSiteSysAction extends BaseAction {

    @Resource
    private LearnSiteService learnSiteService;

    private LearnSite learnSite;

    private List<LearnSite> learnSiteList;

    private String [] selectedRow;

    private PageResult pageResult;

    public String listUI(){

        QueryHelper queryHelper = new QueryHelper(LearnSite.class,"i");

        queryHelper.addOrderByProperty("i.time",QueryHelper.ORDER_BY_DESC);

        pageResult = learnSiteService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "listUI";
    }

    public String delete(){

        if (learnSite!=null){
            if (learnSite.getId()!=null){
                learnSiteService.delete(learnSite.getId());
            }
        }

        return "list";
    }

    public String deleteSelected(){

        if (selectedRow!=null){

            for (String id : selectedRow){
                learnSiteService.delete(id);
            }

        }

        return "list";
    }

    public String add(){

        if (learnSite!=null) {

            learnSite.setTime(DateTimeHelper.getCurrentDateTime());
            learnSiteService.save(learnSite);
        }

        return "list";
    }

    public String addUI(){
        return "addUI";
    }

    public String editUI(){

        if (learnSite!=null) {

            learnSite = learnSiteService.findObjectById(learnSite.getId());
        }
        return "editUI";
    }

    public String edit(){

        if (learnSite!=null){

            if (learnSite.getId()!=null){

                learnSite.setTime(DateTimeHelper.getCurrentDateTime());
                learnSiteService.update(learnSite);

            }
        }

        return "list";
    }

    public LearnSite getLearnSite() {
        return learnSite;
    }

    public void setLearnSite(LearnSite learnSite) {
        this.learnSite = learnSite;
    }

    public List<LearnSite> getLearnSiteList() {
        return learnSiteList;
    }

    public void setLearnSiteList(List<LearnSite> learnSiteList) {
        this.learnSiteList = learnSiteList;
    }

    public LearnSiteService getLearnSiteService() {
        return learnSiteService;
    }

    public void setLearnSiteService(LearnSiteService learnSiteService) {
        this.learnSiteService = learnSiteService;
    }

    public String[] getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(String[] selectedRow) {
        this.selectedRow = selectedRow;
    }

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }
}
