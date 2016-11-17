package com.cx.sys.current_competition.action;
import com.cx.sys.current_competition.entity.CurrentCompetition;
import com.cx.sys.current_competition.service.CurrentCompetitionService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cxspace on 16-11-17.
 */
public class CurrentCompetitionSysAction extends ActionSupport {

    private CurrentCompetition currentCompetition;

    @Resource
    private CurrentCompetitionService currentCompetitionService;

    private List<CurrentCompetition> currentCompetitionList;

    private String [] selectedRow;

    public String delete(){

        if (currentCompetition!=null){

            if (currentCompetition.getId()!=null){

                currentCompetitionService.delete(currentCompetition.getId());

            }

        }

        return "list";
    }

    public String deleteSelected(){

        if (selectedRow != null){

            for (String id : selectedRow){

                currentCompetitionService.delete(id);

            }
        }

        return "list";
    }

    public String listUI(){

        currentCompetitionList = currentCompetitionService.findObjects();

        return "listUI";
    }


    public String addUI(){

        return "addUI";
    }


    public String editUI(){

        if (currentCompetition != null){

            if (currentCompetition.getId()!=null){

                currentCompetition = currentCompetitionService.findObjectById(currentCompetition.getId());

            }

        }

        return "editUI";
    }

    public String add(){

        if (currentCompetition!=null){

            currentCompetitionService.save(currentCompetition);

        }

        return "list";
    }

    public String edit(){

        if (currentCompetition !=null){
            currentCompetitionService.update(currentCompetition);
        }

        return "list";
    }

    public CurrentCompetition getCurrentCompetition() {
        return currentCompetition;
    }

    public void setCurrentCompetition(CurrentCompetition currentCompetition) {
        this.currentCompetition = currentCompetition;
    }

    public List<CurrentCompetition> getCurrentCompetitionList() {
        return currentCompetitionList;
    }

    public void setCurrentCompetitionList(List<CurrentCompetition> currentCompetitionList) {
        this.currentCompetitionList = currentCompetitionList;
    }

    public CurrentCompetitionService getCurrentCompetitionService() {
        return currentCompetitionService;
    }

    public void setCurrentCompetitionService(CurrentCompetitionService currentCompetitionService) {
        this.currentCompetitionService = currentCompetitionService;
    }

    public String[] getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(String[] selectedRow) {
        this.selectedRow = selectedRow;
    }
}

