package com.cx.sys.project.action;

import com.cx.sys.project.entity.Project;
import com.cx.sys.project.service.ProjectService;
import com.opensymphony.xwork2.ActionSupport;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cxspace on 16-11-13.
 */
public class ProjectSysAction extends ActionSupport {

    private Project project;

    private List<Project> projectList = new ArrayList<Project>();

    private String [] selectedRow;

    @Resource
    private ProjectService projectService;

    public String listUI() throws Exception {

        projectList = projectService.findObjects();

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

}
