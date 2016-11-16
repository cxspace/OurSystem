package com.cx.sys.project.dao;

import com.cx.core.dao.BaseDao;
import com.cx.sys.project.entity.Project;
import com.cx.sys.project.entity.ProjectDoc;
import com.cx.sys.project.entity.ProjectTask;

import java.util.List;

/**
 * Created by cxspace on 16-11-13.
 */
public interface ProjectDao extends BaseDao<Project> {

    //保存项目文档
    public void saveProjectDoc(ProjectDoc projectDoc);

    //保存项目任务
    public void saveProjectTask(ProjectTask projectTask);

    //通过项目id查到项目任务集合
    public List<ProjectTask> getPrjTasksByPrjId(String prjId);

    //通过项目id查到项目文档的id集合
    public List<ProjectDoc> getPrjDocsByPrjId(String prjId);

    //更具文档id删除文档
    public void deletePrjDocByDocId(String docId);

    //根据任务id删除任务
    public void deletePrjTaskByTaskId(String taskId);
}
