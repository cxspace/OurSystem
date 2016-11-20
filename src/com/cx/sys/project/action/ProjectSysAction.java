package com.cx.sys.project.action;

import com.cx.core.action.BaseAction;
import com.cx.core.page.PageResult;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.project.entity.Project;
import com.cx.sys.project.service.ProjectService;
import com.opensymphony.xwork2.ActionSupport;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cxspace on 16-11-13.
 */
public class ProjectSysAction extends BaseAction {

    private Project project;

    private List<Project> projectList = new ArrayList<Project>();

    private String [] selectedRow;

    private PageResult pageResult;

    @Resource
    private ProjectService projectService;

    public String listUI() throws Exception {

        QueryHelper queryHelper = new QueryHelper(Project.class,"i");

        queryHelper.addOrderByProperty("i.createTime",QueryHelper.ORDER_BY_DESC);

        pageResult = projectService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "listUI";
    }

    public String add(){

        if (project!=null){
            projectService.save(project);
        }

        return "list";
    }

    public String addUI() throws Exception {
        return "addUI";
    }

    public String editUI() throws Exception {

        if (project!=null){

            if (project.getId()!=null){

                project = projectService.findObjectById(project.getId());

            }

        }

        return "editUI";
    }

    public String edit(){

        if (project!=null) {

            projectService.update(project);

        }

        return "list";
    }

    public String delete() throws Exception {

        if (project!=null){

            if (project.getId()!=null){

                projectService.delete(project.getId());

            }

        }

        return "list";
    }

    public String deleteSelected(){

        if (selectedRow != null){

            for (String id : selectedRow){
                projectService.delete(id);
            }

        }

        return "list";
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

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
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
