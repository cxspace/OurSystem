package com.cx.sys.project.entity;

import com.cx.sys.prj_task.entity.PrjTask;

import java.io.Serializable;

/**
 * Created by cxspace on 16-11-16.
 */
public class ProjectTaskId implements Serializable{

    private PrjTask prjTask;

    private String prj_id;

    public String getPrj_id() {
        return prj_id;
    }

    public void setPrj_id(String prj_id) {
        this.prj_id = prj_id;
    }

    public PrjTask getPrjTask() {
        return prjTask;
    }

    public void setPrjTask(PrjTask prjTask) {
        this.prjTask = prjTask;
    }

    public ProjectTaskId(PrjTask prjTask, String prj_id) {
        this.prjTask = prjTask;
        this.prj_id = prj_id;
    }

    public ProjectTaskId() {
    }
}
