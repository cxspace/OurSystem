package com.cx.sys.prj_task.entity;

/**
 * Created by cxspace on 16-11-15.
 */
public class PrjTask {

    private String id;

    private String name;

    private String createTime;

    private String deadline;

    private String select_person;

    private int score;

    private int state;

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSelect_person() {
        return select_person;
    }

    public void setSelect_person(String select_person) {
        this.select_person = select_person;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "PrjTask{" +
                "content='" + content + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createTime='" + createTime + '\'' +
                ", deadline='" + deadline + '\'' +
                ", select_person='" + select_person + '\'' +
                ", score=" + score +
                ", state=" + state +
                '}';
    }

    public PrjTask() {
    }

    public PrjTask(String content, String createTime, String deadline, String id, String name, int score, String select_person, int state) {
        this.content = content;
        this.createTime = createTime;
        this.deadline = deadline;
        this.id = id;
        this.name = name;
        this.score = score;
        this.select_person = select_person;
        this.state = state;
    }

    public PrjTask(String id) {
        this.id = id;
    }


}
