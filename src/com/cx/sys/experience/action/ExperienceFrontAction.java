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
import org.apache.struts2.ServletActionContext;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by cxspace on 16-11-18.
 */
public class ExperienceFrontAction extends BaseAction {

    @Resource
    private ExperienceService experienceService;

    private Experience experience;

    private PageResult pageResult;

    private String content;


    public String experience_list(){

//        if (ActionContext.getContext().getSession().get("content")!=null){
//
//
//            User user = (User) ActionContext.getContext().getSession().get(Constant.USER);
//
//            Experience experience1 = new Experience();
//            experience1.setCreate_person(user.getUser_name());
//            experience1.setTime(DateTimeHelper.getCurrentDateTime());
//            experience1.setContent((String) ActionContext.getContext().getSession().get("content"));
//            experience1.setName("自动保存的草稿");
//            experienceService.save(experience1);
//
//        }

        QueryHelper queryHelper = new QueryHelper(Experience.class , "i");



        queryHelper.addOrderByProperty("i.time",QueryHelper.ORDER_BY_DESC);

        pageResult = experienceService.getPageResult(queryHelper,getPageNo(),getPageSize());

//        ActionContext.getContext().getSession().remove("content");

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

    public void autoSaveContent(){

        try{

            String experId =  (String)ActionContext.getContext().getSession().get("experId");

            experience = experienceService.findObjectById(experId);



          //  System.out.println(content.length());

            if (content.length()>30)

            {
                experience.setContent(content);

                experienceService.update(experience);
            }

           // System.out.println(content);

            //输出结果到前台
            HttpServletResponse response = ServletActionContext.getResponse();

            response.setContentType("text/html;charset=utf-8");

            PrintWriter pw = response.getWriter();
            pw.write("ok");
            pw.flush();
            pw.close();

        }catch (Exception e){

            e.printStackTrace();

        }

    }

    public String experience_detail(){

        if (experience!=null){

            if (experience.getId()!=null){

                experience = experienceService.findObjectById(experience.getId());

            }

        }

        return "experience_detail";
    }


    public String edit_experience(){

        if (experience != null){
            experience.setTime(DateTimeHelper.getCurrentDateTime());
            experienceService.update(experience);
        }
        return "list";
    }

    public String experience_edit(){

        if (experience != null){
            experience = experienceService.findObjectById(experience.getId());
            ActionContext.getContext().getSession().put("experId",experience.getId());
        }

        return "experience_edit";
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
