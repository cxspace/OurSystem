package com.cx.sys.prj_doc.entity;

/**
 * Created by cxspace on 16-11-13.
 */
public class PrjDoc {

    private String id;

    private String name;

    private String createTime;

    private String content;

    private String create_person;

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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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


    @Override
    public String toString() {
        return "PrjDoc{" +
                "content='" + content + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createTime='" + createTime + '\'' +
                ", create_person='" + create_person + '\'' +
                '}';
    }

    public PrjDoc(String content, String create_person, String createTime, String id, String name) {
        this.content = content;
        this.create_person = create_person;
        this.createTime = createTime;
        this.id = id;
        this.name = name;
    }

    public PrjDoc() {
    }
}
