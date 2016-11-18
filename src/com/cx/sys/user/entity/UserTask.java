package com.cx.sys.user.entity;

import java.io.Serializable;

/**
 * Created by cxspace on 16-11-18.
 */
public class UserTask implements Serializable {

    private UserTaskId id;

    public UserTask(UserTaskId id) {
        this.id = id;
    }

    public UserTaskId getId() {
        return id;
    }

    public void setId(UserTaskId id) {
        this.id = id;
    }

    public UserTask() {
    }
}
