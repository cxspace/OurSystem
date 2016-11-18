package com.cx.sys.user.entity;

import com.cx.sys.prj_task.entity.PrjTask;

import java.io.Serializable;

/**
 * Created by cxspace on 16-11-18.
 */
public class UserTaskId implements Serializable{

    private PrjTask prjTask;

    private String user_id;

    public PrjTask getPrjTask() {
        return prjTask;
    }

    public void setPrjTask(PrjTask prjTask) {
        this.prjTask = prjTask;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public UserTaskId(PrjTask prjTask, String user_id) {
        this.prjTask = prjTask;
        this.user_id = user_id;
    }

    public UserTaskId() {
    }
}
