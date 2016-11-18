package com.cx.sys.competition.action;

import com.cx.core.action.BaseAction;
import com.cx.core.page.PageResult;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.competition.entity.Competition;
import com.cx.sys.competition.service.CompetitionService;

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-18.
 */
public class CompetitionFrontAction extends BaseAction {

    @Resource
    private CompetitionService competitionService;

    private Competition competition;

    private PageResult pageResult;

    public String competition_list(){

        QueryHelper queryHelper = new QueryHelper(Competition.class , "i");

        queryHelper.addOrderByProperty("i.name",QueryHelper.ORDER_BY_DESC);

        pageResult = competitionService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "competition_list";
    }
    public String competition_detail(){

        if (competition!=null){

            if (competition.getId()!=null){

                competition = competitionService.findObjectById(competition.getId());

            }

        }

        return "competition_detail";
    }


    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public CompetitionService getCompetitionService() {
        return competitionService;
    }

    public void setCompetitionService(CompetitionService competitionService) {
        this.competitionService = competitionService;
    }

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }
}
