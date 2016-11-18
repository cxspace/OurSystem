package com.cx.sys.project.action;
import com.cx.core.action.BaseAction;
import com.cx.core.page.PageResult;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.project.entity.Project;
import com.cx.sys.project.service.ProjectService;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-13.
 */
public class ProjectFrontAction extends BaseAction{

    private Project project;

    @Resource
    private ProjectService projectService;

    private PageResult pageResult;


    public String prj_list(){

        QueryHelper queryHelper = new QueryHelper(Project.class , "i");

        queryHelper.addOrderByProperty("i.createTime",QueryHelper.ORDER_BY_DESC);

        pageResult = projectService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "prj_list";
    }


    //项目模糊搜索
    public String prj_search(){

        QueryHelper queryHelper = new QueryHelper(Project.class,"i");

        if (project!=null){

            if (StringUtils.isNotBlank(project.getName())){
                queryHelper.addCondition("i.name like ? ","%"+project.getName()+"%");

                pageResult = projectService.getPageResult(queryHelper,getPageNo(),getPageSize());

            }

        }

        return "prj_list";
    }



    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public ProjectService getProjectService() {
        return projectService;
    }

    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }
}
