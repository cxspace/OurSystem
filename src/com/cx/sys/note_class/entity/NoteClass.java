package com.cx.sys.note_class.entity;

/**
 * Created by cxspace on 16-11-17.
 */
public class NoteClass {

    private String id;

    private String name;

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

    public NoteClass(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public NoteClass() {
    }
}
