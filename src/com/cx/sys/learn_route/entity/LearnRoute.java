package com.cx.sys.learn_route.entity;

/**
 * Created by cxspace on 16-11-16.
 */
public class LearnRoute {

    private String id;

    private String name;

    private String time;

    private String content;

    public String getContent() {

        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "LearnRoute{" +
                "content='" + content + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public LearnRoute(String content, String id, String name, String time) {
        this.content = content;
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public LearnRoute() {
    }
}
