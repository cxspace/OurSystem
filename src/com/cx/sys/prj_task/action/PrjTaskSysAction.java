package com.cx.sys.prj_task.action;

import com.cx.core.action.BaseAction;
import com.cx.core.constant.Constant;
import com.cx.core.page.PageResult;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.prj_task.entity.PrjTask;
import com.cx.sys.prj_task.service.PrjTaskService;
import com.cx.sys.project.entity.Project;
import com.cx.sys.project.entity.ProjectTask;
import com.cx.sys.project.service.ProjectService;
import com.cx.sys.user.entity.User;
import com.cx.sys.user.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cxspace on 16-11-15.
 */
    public class PrjTaskSysAction extends BaseAction {

    @Resource
    private PrjTaskService prjTaskService;

    @Resource
    private ProjectService projectService;

    @Resource
    private UserService userService;

    private PrjTask prjTask;

    private List<PrjTask> prjTaskList = new ArrayList<PrjTask>();

    private List<Project> projectList = new ArrayList<Project>();

    private Project project;

    private String [] selectedRow;

    private PageResult pageResult;

    public String editUI(){

        if (prjTask!=null){
            if (prjTask.getId()!=null){
                prjTask = prjTaskService.findObjectById(prjTask.getId());
            }
        }

        return "editUI";
    }

    public String verifyOK(){

        if (prjTask!=null){

            if (prjTask.getId()!=null){
                prjTask = prjTaskService.findObjectById(prjTask.getId());
                prjTask.setState(3);

                //加分
                long task_score = prjTask.getScore();

                User user = (User) ActionContext.getContext().getSession().get(Constant.USER);

                long user_score = user.getScore();

                user_score += task_score;

                user.setScore(user_score);

                userService.update(user);

                prjTaskService.update(prjTask);
            }

        }

        return "list_back";
    }

    public String reset(){

        if (prjTask!=null){

            if (prjTask.getId()!=null){
                prjTask = prjTaskService.findObjectById(prjTask.getId());
                prjTask.setState(0);
                prjTaskService.update(prjTask);
            }

        }

        return "list_back";
    }

    public String edit(){

        if (prjTask!=null){
            if (prjTask.getId()!=null){
                prjTaskService.update(prjTask);
            }
        }

        return "list_back";
    }

    public String add(){

        if (prjTask!=null){

            String prjId = (String)ActionContext.getContext().getSession().get("prjId");

            prjTaskService.save(prjTask);

            projectService.saveProjectTask(prjId,prjTask.getId());

        }

        return "list_back";
    }

    public String delete(){

        if (prjTask!=null){

            projectService.deletePrjTaskByTaskId(prjTask.getId());

            prjTaskService.delete(prjTask.getId());

        }

        return "list_back";
    }

    public String deleteSelected(){

        if (selectedRow!=null){

            for (String id : selectedRow){
                projectService.deletePrjTaskByTaskId(id);
                prjTaskService.delete(id);
            }

        }
        return "list_back";
    }

    public String addUI(){

        return "addUI";
    }

    public String listUI(){

        if (project!=null){
            //把项目id存入session
            ActionContext.getContext().getSession().put("prjId", project.getId());

            if (project.getId()!=null){

                List<ProjectTask> list = projectService.getPrjTasksByPrjId(project.getId());
                for (int i = 0 ; i < list.size() ; i++){
                    prjTaskList.add(list.get(i).getId().getPrjTask());
                }
            }
        }
        return "listUI";
    }

    public String listBack() throws Exception
    {

        List<ProjectTask> list = projectService.getPrjTasksByPrjId((String)ActionContext.getContext().getSession().get("prjId"));
        for (int i = 0 ; i < list.size() ; i++){
            prjTaskList.add(list.get(i).getId().getPrjTask());
        }

        return "listUI";
    }

    public String prj_list(){

//        projectList = projectService.findObjects();

        QueryHelper queryHelper = new QueryHelper(Project.class,"i");

        queryHelper.addOrderByProperty("i.createTime",QueryHelper.ORDER_BY_DESC);

        pageResult = projectService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "prj_list";
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
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

    public PrjTaskService getPrjTaskService() {
        return prjTaskService;
    }

    public void setPrjTaskService(PrjTaskService prjTaskService) {
        this.prjTaskService = prjTaskService;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public ProjectService getProjectService() {
        return projectService;
    }

    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
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
