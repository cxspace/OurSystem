package com.cx.sys.inform.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by cxspace on 16-11-13.
 */
public class Inform {

    private String id;

    //通知标题
    private String title;

    //创建时间
    private Timestamp createTime;

    //通知状态
    private int state;

    //通知内容
    private String content;


    public static int STATE_ON = 1;

    public static int STSTE_OFF = 0;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Inform{" +
                "content='" + content + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", createTime=" + createTime +
                ", state=" + state +
                '}';
    }

    public Inform(String content, Timestamp createTime, String id, int state, String title) {
        this.content = content;
        this.createTime = createTime;
        this.id = id;
        this.state = state;
        this.title = title;
    }

    public Inform() {
    }
}
