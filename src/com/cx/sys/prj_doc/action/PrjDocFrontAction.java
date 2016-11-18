package com.cx.sys.prj_doc.action;

import com.cx.core.action.BaseAction;
import com.cx.sys.prj_doc.entity.PrjDoc;
import com.cx.sys.prj_doc.service.PrjDocService;
import com.cx.sys.project.entity.Project;
import com.cx.sys.project.entity.ProjectDoc;
import com.cx.sys.project.service.ProjectService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cxspace on 16-11-18.
 */
public class PrjDocFrontAction extends BaseAction{

    private Project project;

    @Resource
    private ProjectService projectService;

    private ProjectDoc projectDoc;

    private List<ProjectDoc> projectDocList;

    private PrjDoc prjDoc;

    private List<PrjDoc> prjDocList = new ArrayList<>();

    @Resource
    private PrjDocService prjDocService;

    public String doc_detail(){

        if (prjDoc!=null){

            if (prjDoc.getId()!=null){

                prjDoc = prjDocService.findObjectById(prjDoc.getId());

            }

        }

        return "doc_detail";
    }

    public String doc_list(){

        if (project != null) {
            if (project.getId() != null) {

                //拿到项目文档列表
                List<ProjectDoc> list = projectService.getPrjDocsByPrjId(project.getId());

                for (int i = 0; i < list.size(); i++) {
                    prjDocList.add(list.get(i).getId().getPrjDoc());
                }
            }
        }

        return "doc_list";
    }


    public PrjDocService getPrjDocService() {
        return prjDocService;
    }

    public void setPrjDocService(PrjDocService prjDocService) {
        this.prjDocService = prjDocService;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public ProjectDoc getProjectDoc() {
        return projectDoc;
    }

    public void setProjectDoc(ProjectDoc projectDoc) {
        this.projectDoc = projectDoc;
    }

    public ProjectService getProjectService() {
        return projectService;
    }

    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }

    public List<ProjectDoc> getProjectDocList() {
        return projectDocList;
    }

    public void setProjectDocList(List<ProjectDoc> projectDocList) {
        this.projectDocList = projectDocList;
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
}
