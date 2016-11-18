package com.cx.sys.current_competition.action;

import com.cx.core.action.BaseAction;
import com.cx.core.page.PageResult;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.current_competition.entity.CurrentCompetition;
import com.cx.sys.current_competition.service.CurrentCompetitionService;
import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-18.
 */
public class CurrentCompetitionFrontAction extends BaseAction {

    @Resource
    private CurrentCompetitionService currentCompetitionService;

    private CurrentCompetition currentCompetition;

    private PageResult pageResult;

    public String cur_comp_list(){

        QueryHelper queryHelper = new QueryHelper(CurrentCompetition.class , "i");

        queryHelper.addOrderByProperty("i.name",QueryHelper.ORDER_BY_DESC);

        pageResult = currentCompetitionService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "cur_comp_list";
    }

    public String cur_comp_detail(){

        if (currentCompetition!=null){

            if (currentCompetition.getId()!=null){

                currentCompetition = currentCompetitionService.findObjectById(currentCompetition.getId());

            }

        }

        return "cur_comp_detail";
    }


    public CurrentCompetitionService getCurrentCompetitionService() {
        return currentCompetitionService;
    }

    public void setCurrentCompetitionService(CurrentCompetitionService currentCompetitionService) {
        this.currentCompetitionService = currentCompetitionService;
    }

    public CurrentCompetition getCurrentCompetition() {
        return currentCompetition;
    }

    public void setCurrentCompetition(CurrentCompetition currentCompetition) {
        this.currentCompetition = currentCompetition;
    }

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }
}
