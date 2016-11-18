package com.cx.sys.experience.action;

import com.cx.core.action.BaseAction;
import com.cx.core.constant.Constant;
import com.cx.core.page.PageResult;
import com.cx.core.utils.DateTimeHelper;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.experience.entity.Experience;
import com.cx.sys.experience.service.ExperienceService;
import com.cx.sys.user.entity.User;
import com.opensymphony.xwork2.ActionContext;

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-18.
 */
public class ExperienceFrontAction extends BaseAction {

    @Resource
    private ExperienceService experienceService;

    private Experience experience;

    private PageResult pageResult;


    public String experience_list(){

        QueryHelper queryHelper = new QueryHelper(Experience.class , "i");

        queryHelper.addOrderByProperty("i.time",QueryHelper.ORDER_BY_DESC);

        pageResult = experienceService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "experience_list";
    }

    public String addExperience(){

        if (experience != null){
            User user = (User) ActionContext.getContext().getSession().get(Constant.USER);
            experience.setCreate_person(user.getUser_name());
            experience.setTime(DateTimeHelper.getCurrentDateTime());

            experienceService.save(experience);
        }

        return "list";
    }

    public String experience_add(){

        return "experience_add";
    }

    public String experience_detail(){

        if (experience!=null){

            if (experience.getId()!=null){

                experience = experienceService.findObjectById(experience.getId());

            }

        }

        return "experience_detail";
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public ExperienceService getExperienceService() {
        return experienceService;
    }

    public void setExperienceService(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }
}
