package com.cx.sys.project.entity;

import java.io.Serializable;

/**
 * Created by cxspace on 16-11-16.
 */
public class ProjectTask implements Serializable{

    private ProjectTaskId id;

    public ProjectTaskId getId() {
        return id;
    }

    public void setId(ProjectTaskId id) {
        this.id = id;
    }

    public ProjectTask(ProjectTaskId id) {
        this.id = id;
    }

    public ProjectTask() {
    }
}

