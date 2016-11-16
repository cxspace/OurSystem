package com.cx.sys.project.entity;

import com.cx.sys.prj_doc.entity.PrjDoc;
import com.cx.sys.prj_task.entity.PrjTask;

import java.util.List;
import java.util.Set;

/**
 * Created by cxspace on 16-11-13.
 */
public class Project {

    private String id;

    private String name;

    private String createTime;

    private int join_number;

    private String deadline;

    //一个项目对应多个文档
    private List<PrjDoc> prjDocs;

    //一个项目对应多个任务
    private List<PrjTask> prjTasks;

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

    public List<PrjDoc> getPrjDocs() {
        return prjDocs;
    }

    public void setPrjDocs(List<PrjDoc> prjDocs) {
        this.prjDocs = prjDocs;
    }

    public List<PrjTask> getPrjTasks() {
        return prjTasks;
    }

    public void setPrjTasks(List<PrjTask> prjTasks) {
        this.prjTasks = prjTasks;
    }


    public Project(String createTime, String deadline, String id, int join_number, String name, List<PrjDoc> prjDocs, List<PrjTask> prjTasks) {
        this.createTime = createTime;
        this.deadline = deadline;
        this.id = id;
        this.join_number = join_number;
        this.name = name;
        this.prjDocs = prjDocs;
        this.prjTasks = prjTasks;
    }

    @Override
    public String toString() {
        return "Project{" +
                "createTime='" + createTime + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", join_number=" + join_number +
                ", deadline='" + deadline + '\'' +
                ", prjDocs=" + prjDocs +
                ", prjTasks=" + prjTasks +
                '}';
    }

    public Project() {
    }
}
