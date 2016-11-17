package com.cx.sys.res_link.entity;

import java.sql.Timestamp;

/**
 * Created by cxspace on 16-11-16.
 */
public class ResLink {

    private String id;

    private String name;

    private Timestamp time;

    private String create_person;

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreate_person() {
        return create_person;
    }

    public void setCreate_person(String create_person) {
        this.create_person = create_person;
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

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public ResLink(String content, String create_person, String id, String name, Timestamp time) {
        this.content = content;
        this.create_person = create_person;
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public ResLink() {
    }
}
