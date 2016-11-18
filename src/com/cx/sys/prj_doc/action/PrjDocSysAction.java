package com.cx.sys.prj_doc.action;

import com.cx.core.utils.DateTimeHelper;
import com.cx.sys.prj_doc.entity.PrjDoc;
import com.cx.sys.prj_doc.service.PrjDocService;
import com.cx.sys.project.entity.Project;
import com.cx.sys.project.entity.ProjectDoc;
import com.cx.sys.project.service.ProjectService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cxspace on 16-11-13.
 */
public class PrjDocSysAction extends ActionSupport {

    @Resource
    private PrjDocService prjDocService;

    @Resource
    private ProjectService projectService;

    private PrjDoc prjDoc;

    private List<PrjDoc> prjDocList = new ArrayList<PrjDoc>();

    private List<Project> projectList = new ArrayList<Project>();

    private Project project;

    private String [] selectedRow;

    public String add() throws Exception{

        if (prjDoc!=null){

               String prjId = (String)ActionContext.getContext().getSession().get("prjId");

               prjDoc.setCreateTime(DateTimeHelper.getCurrentDateTime());

               prjDocService.save(prjDoc);

               projectService.saveProjectDoc(prjId,prjDoc.getId());

        }

        return "list_back";
    }

    public String deleteSelected(){

        if (selectedRow!=null){

            for (String id : selectedRow){

                projectService.deletePrjDocByDocId(id);
                prjDocService.delete(id);
            }
        }

        return "list_back";
    }

    public String listUI() throws Exception {

        if (project!=null){
            //把项目id存入session
            ActionContext.getContext().getSession().put("prjId", project.getId());

            if (project.getId()!=null){

                List<ProjectDoc> list = projectService.getPrjDocsByPrjId(project.getId());
                for (int i = 0 ; i < list.size() ; i++){
                    prjDocList.add(list.get(i).getId().getPrjDoc());
                }
            }
        }

        return "listUI";
    }

    public String listBack() throws Exception
    {

                List<ProjectDoc> list = projectService.getPrjDocsByPrjId((String)ActionContext.getContext().getSession().get("prjId"));
                for (int i = 0 ; i < list.size() ; i++){
                    prjDocList.add(list.get(i).getId().getPrjDoc());
                }

        return "listUI";
    }

    public String delete(){

        if (prjDoc!=null){

            projectService.deletePrjDocByDocId(prjDoc.getId());

            prjDocService.delete(prjDoc.getId());

        }
        return "list_back";
    }


    public String addUI() throws Exception {

        return "addUI";
    }

    public String editUI() throws Exception {

        if (prjDoc!=null){

            if (prjDoc.getId()!=null){
                prjDoc = prjDocService.findObjectById(prjDoc.getId());
            }

        }

        return "editUI";
    }

    public String edit() throws Exception{

        if (prjDoc!=null){
            if (prjDoc.getId()!=null) {

                        prjDoc.setCreateTime(DateTimeHelper.getCurrentDateTime());
                        prjDocService.update(prjDoc);

            }
        }

        return "list_back";

    }

    public String prj_list() throws Exception{

        //拿到项目列表
        projectList = projectService.findObjects();

        return "prj_list";
    }

    public PrjDocService getPrjDocService() {
        return prjDocService;
    }

    public void setPrjDocService(PrjDocService prjDocService) {
        this.prjDocService = prjDocService;
    }

    public PrjDoc getPrjDoc() {
        return prjDoc;
    }

    public void setPrjDoc(PrjDoc prjDoc) {
        this.prjDoc = prjDoc;
    }

    public List<PrjDoc> getPrjDocList() {
        return prjDocList;
    }

    public void setPrjDocList(List<PrjDoc> prjDocList) {
        this.prjDocList = prjDocList;
    }

    public String[] getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(String[] selectedRow) {
        this.selectedRow = selectedRow;
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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
