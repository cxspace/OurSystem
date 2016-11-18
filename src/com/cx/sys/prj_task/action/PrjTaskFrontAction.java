package com.cx.sys.prj_task.action;

import com.cx.core.constant.Constant;
import com.cx.sys.prj_task.entity.PrjTask;
import com.cx.sys.prj_task.service.PrjTaskService;
import com.cx.sys.project.entity.Project;
import com.cx.sys.project.entity.ProjectTask;
import com.cx.sys.project.service.ProjectService;
import com.cx.sys.user.entity.User;
import com.cx.sys.user.entity.UserTask;
import com.cx.sys.user.service.UserService;
import com.opensymphony.xwork2.ActionContext;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cxspace on 16-11-18.
 */
public class PrjTaskFrontAction {

    private Project project;

    @Resource
    private ProjectService projectService;

    @Resource
    private UserService userService;

    @Resource
    private PrjTaskService prjTaskService;

    private ProjectTask projectTask;

    private PrjTask prjTask;

    private List<PrjTask> prjTaskList = new ArrayList<>();

    //选择任务
    public String task_select(){

        if (prjTask!=null){

            if (prjTask.getId()!=null){

                prjTask = prjTaskService.findObjectById(prjTask.getId());

                //设置任务负责人
                prjTask.setSelect_person(((User) ActionContext.getContext().getSession().get(Constant.USER)).getUser_name());

                //设置任务状态,被选中
                prjTask.setState(1);

                boolean isSelected = false;

                List<UserTask> list = userService.getUserTasksByUserId(((User)ActionContext.getContext().getSession().get(Constant.USER)).getId());

                for (int i = 0 ; i < list.size() ; i++ ){
                    if (prjTask.getId().equals(list.get(i).getId().getPrjTask().getId())) {
                        isSelected = true;
                    }
                }

                //没选中过
                if (!isSelected) {
                    //把任务添加到用户下
                    userService.saveUserTask(((User) ActionContext.getContext().getSession().get(Constant.USER)).getId(), prjTask.getId());
                }
                //更新任务信息
                prjTaskService.update(prjTask);
            }

        }

        return "list_back";
    }

    public String task_list(){

        if (project != null) {

            if (project.getId() != null) {

                ActionContext.getContext().getSession().put("prjId", project.getId());

                //拿到项目任务列表
                List<ProjectTask> list = projectService.getPrjTasksByPrjId(project.getId());

                for (int i = 0; i < list.size(); i++) {

                    prjTaskList.add(list.get(i).getId().getPrjTask());

                }
            }
        }

        return "task_list";

    }

    public String listBack(){

        //拿到项目任务列表
        List<ProjectTask> list = projectService.getPrjTasksByPrjId((String)ActionContext.getContext().getSession().get("prjId"));

        for (int i = 0; i < list.size(); i++) {
            prjTaskList.add(list.get(i).getId().getPrjTask());
        }

        return "task_list";
    }


    public String task_detail(){

        if (prjTask!=null){

            if (prjTask.getId()!=null){

                prjTask = prjTaskService.findObjectById(prjTask.getId());

            }

        }

        return "task_detail";
    }

    public PrjTask getPrjTask() {
        return prjTask;
    }

    public void setPrjTask(PrjTask prjTask) {
        this.prjTask = prjTask;
    }

    public List<PrjTask> getPrjTaskList() {
        return prjTaskList;
    }

    public void setPrjTaskList(List<PrjTask> prjTaskList) {
        this.prjTaskList = prjTaskList;
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

    public ProjectTask getProjectTask() {
        return projectTask;
    }

    public void setProjectTask(ProjectTask projectTask) {
        this.projectTask = projectTask;
    }

    public PrjTaskService getPrjTaskService() {
        return prjTaskService;
    }

    public void setPrjTaskService(PrjTaskService prjTaskService) {
        this.prjTaskService = prjTaskService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
