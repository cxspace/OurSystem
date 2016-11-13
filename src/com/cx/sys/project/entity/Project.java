package com.cx.sys.project.entity;

/**
 * Created by cxspace on 16-11-13.
 */
public class Project {

    private String id;

    private String name;

    private String createTime;

    private int join_number;

    private String deadline;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getJoin_number() {
        return join_number;
    }

    public void setJoin_number(int join_number) {
        this.join_number = join_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Project{" +
                "createTime='" + createTime + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", join_number=" + join_number +
                ", deadline='" + deadline + '\'' +
                '}';
    }

    public Project(String createTime, String deadline, String id, int join_number, String name) {
        this.createTime = createTime;
        this.deadline = deadline;
        this.id = id;
        this.join_number = join_number;
        this.name = name;
    }

    public Project() {
    }
}
