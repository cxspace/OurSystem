package com.cx.sys.learn_site.entity;

/**
 * Created by cxspace on 16-11-16.
 */
public class LearnSite {

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

    public LearnSite(String content, String id, String name, String time) {
        this.content = content;
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public LearnSite() {
    }
}
