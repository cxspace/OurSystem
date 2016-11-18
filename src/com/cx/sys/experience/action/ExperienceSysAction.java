package com.cx.sys.experience.action;

import com.cx.core.constant.Constant;
import com.cx.core.utils.DateTimeHelper;
import com.cx.sys.experience.entity.Experience;
import com.cx.sys.experience.service.ExperienceService;
import com.cx.sys.user.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by cxspace on 16-11-17.
 */
public class ExperienceSysAction extends ActionSupport{

    @Resource
    private ExperienceService experienceService;

    private Experience experience;

    private List<Experience> experienceList;

    private String [] selectedRow;

    public String addUI(){
        return "addUI";
    }

    public String editUI(){

        if (experience != null){

            experience = experienceService.findObjectById(experience.getId());

        }

        return "editUI";
    }

    public String listUI(){

        experienceList = experienceService.findObjects();

        return "listUI";
    }

    public String add(){


        if (experience!=null){

            User user = (User) ActionContext.getContext().getSession().get(Constant.USER);
            experience.setCreate_person(user.getUser_name());
            experience.setTime(DateTimeHelper.getCurrentDateTime());

            experienceService.save(experience);

        }

        return "list";
    }

    public String edit(){

        if (experience!=null){

            experience.setTime(DateTimeHelper.getCurrentDateTime());
            experienceService.update(experience);

        }

        return "list";
    }

    public String delete(){

        if (experience!=null){

            if (experience.getId()!=null){

                experienceService.delete(experience.getId());

            }

        }

        return "list";
    }

    public String deleteSelected(){

        if (selectedRow!=null){

            for (String id : selectedRow){

                experienceService.delete(id);

            }

        }

        return "list";
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public List<Experience> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public ExperienceService getExperienceService() {
        return experienceService;
    }

    public void setExperienceService(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    public String[] getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(String[] selectedRow) {
        this.selectedRow = selectedRow;
    }
}
