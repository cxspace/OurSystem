package com.cx.sys.project.service.impl;

import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.sys.project.dao.ProjectDao;
import com.cx.sys.project.entity.Project;
import com.cx.sys.project.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

}
