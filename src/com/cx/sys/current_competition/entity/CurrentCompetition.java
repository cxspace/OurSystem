package com.cx.sys.current_competition.entity;

/**
 * Created by cxspace on 16-11-17.
 */
public class CurrentCompetition {

    private String id;

    private String name;

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

    public CurrentCompetition(String content, String id, String name) {
        this.content = content;
        this.id = id;
        this.name = name;
    }

    public CurrentCompetition() {
    }

    @Override
    public String toString() {
        return "CurrentCompetition{" +
                "content='" + content + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
