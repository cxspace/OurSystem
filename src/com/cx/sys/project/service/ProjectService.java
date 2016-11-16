package com.cx.sys.project.service;

import com.cx.core.service.BaseService;
import com.cx.sys.project.entity.Project;
import com.cx.sys.project.entity.ProjectDoc;
import com.cx.sys.project.entity.ProjectTask;

import java.util.List;


/**
 * Created by cxspace on 16-11-13.
 */
public interface ProjectService extends BaseService<Project> {
    public void saveProjectDoc(String prjId , String prjDocId);

    public void saveProjectTask(String prjId , String prjTaskId);


    //通过项目id查到项目文档的id集合
    public List<ProjectDoc> getPrjDocsByPrjId(String prjId);

    public void deletePrjDocByDocId(String docId);

    //通过项目id查到项目任务集合
    public List<ProjectTask> getPrjTasksByPrjId(String prjId);

    //根据任务id删除任务
    public void deletePrjTaskByTaskId(String taskId);

}
