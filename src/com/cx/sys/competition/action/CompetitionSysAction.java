package com.cx.sys.competition.action;

import com.cx.core.action.BaseAction;
import com.cx.core.page.PageResult;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.competition.entity.Competition;
import com.cx.sys.competition.service.CompetitionService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cxspace on 16-11-17.
 */
public class CompetitionSysAction extends BaseAction {

    @Resource
    private CompetitionService competitionService;

    private PageResult pageResult;

    private Competition  competition;

    private List<Competition> competitionList;

    private String [] selectedRow;

    public String delete(){

        if (competition!=null){

            if (competition.getId()!=null){

                competitionService.delete(competition.getId());

            }

        }

        return "list";
    }

    public String deleteSelected(){

        if (selectedRow != null){

            for (String id : selectedRow){

                competitionService.delete(id);

            }

        }

        return "list";
    }

    public String listUI(){

        QueryHelper queryHelper = new QueryHelper(Competition.class , "i");

        queryHelper.addOrderByProperty("i.name",QueryHelper.ORDER_BY_DESC);

        pageResult = competitionService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "listUI";
    }

    public String addUI(){

        return "addUI";
    }

    public String add(){

        if (competition!=null){
            competitionService.save(competition);
        }
        return "list";
    }

    public String editUI(){

        if (competition!=null){
            competition = competitionService.findObjectById(competition.getId());
        }

        return "editUI";
    }

    public String edit(){

        if (competition!=null){

            competitionService.update(competition);

        }

        return "list";
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public List<Competition> getCompetitionList() {
        return competitionList;
    }

    public void setCompetitionList(List<Competition> competitionList) {
        this.competitionList = competitionList;
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

    public String[] getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(String[] selectedRow) {
        this.selectedRow = selectedRow;
    }
}
