package com.cx.sys.project.service.impl;

import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.sys.prj_doc.entity.PrjDoc;
import com.cx.sys.prj_task.entity.PrjTask;
import com.cx.sys.project.dao.ProjectDao;
import com.cx.sys.project.entity.*;
import com.cx.sys.project.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cxspace on 16-11-13.
 */

@Service("projectService")
public class ProjectServiceImpl extends BaseServiceImpl<Project> implements ProjectService{

    private ProjectDao projectDao;

    @Resource
    public void setProjectDao(ProjectDao projectDao) {
        super.setBaseDao(projectDao);
        this.projectDao = projectDao;
    }

    @Override
    public void saveProjectDoc(String prjId, String prjDocId) {
        projectDao.saveProjectDoc(new ProjectDoc(new ProjectDocId(prjId,new PrjDoc(prjDocId))));
    }

    @Override
    public void saveProjectTask(String prjId, String prjTaskId) {
        projectDao.saveProjectTask(new ProjectTask(new ProjectTaskId(new PrjTask(prjTaskId),prjId)));
    }

    @Override
    public List<ProjectDoc> getPrjDocsByPrjId(String prjId) {
        return projectDao.getPrjDocsByPrjId(prjId);
    }

    @Override
    public void deletePrjDocByDocId(String docId) {
        projectDao.deletePrjDocByDocId(docId);
    }

    @Override
    public void deletePrjTaskByTaskId(String taskId) {
        projectDao.deletePrjTaskByTaskId(taskId);
    }

    @Override
    public List<ProjectTask> getPrjTasksByPrjId(String prjId) {
        return projectDao.getPrjTasksByPrjId(prjId);
    }


}
