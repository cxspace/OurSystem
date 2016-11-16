package com.cx.sys.project.dao.impl;

import com.cx.core.dao.impl.BaseDaoImpl;
import com.cx.sys.project.dao.ProjectDao;
import com.cx.sys.project.entity.Project;
import com.cx.sys.project.entity.ProjectDoc;
import com.cx.sys.project.entity.ProjectTask;
import org.hibernate.Query;
import org.hibernate.SQLQuery;

import java.util.List;

/**
 * Created by cxspace on 16-11-13.
 */
public class ProjectDaoImpl extends BaseDaoImpl<Project> implements ProjectDao {

    @Override
    public void saveProjectDoc(ProjectDoc projectDoc) {
        getHibernateTemplate().save(projectDoc);
    }

    @Override
    public void saveProjectTask(ProjectTask projectTask) {
        getHibernateTemplate().save(projectTask);
    }

    @Override
    public List<ProjectDoc> getPrjDocsByPrjId(String prjId) {

        Query query = getSession().createQuery("FROM ProjectDoc WHERE id.prj_id=?");

        query.setParameter(0,prjId);

        return query.list();
    }

    @Override
    public void deletePrjDocByDocId(String docId) {

        SQLQuery query = getSession().createSQLQuery("DELETE FROM t_r_prj_doc WHERE doc_id = '" +docId+ "'");

        query.executeUpdate();
    }

    @Override
    public void deletePrjTaskByTaskId(String taskId) {
        SQLQuery query = getSession().createSQLQuery("DELETE FROM t_r_prj_task WHERE task_id = '" +taskId+ "'");

        query.executeUpdate();
    }

    @Override
    public List<ProjectTask> getPrjTasksByPrjId(String prjId) {
        Query query = getSession().createQuery("FROM ProjectTask WHERE id.prj_id=?");

        query.setParameter(0,prjId);

        return query.list();
    }
}
