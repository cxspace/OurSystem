package com.cx.sys.note.entity;
import java.sql.Timestamp;
/**
 * Created by cxspace on 16-11-17.
 */
public class Note {

    private String id;

    private String name;

    private Timestamp time;

    private String create_person;

    private String note_class;

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

    public String getNote_class() {
        return note_class;
    }

    public void setNote_class(String note_class) {
        this.note_class = note_class;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Note(String content, String create_person, String id, String name, String note_class, Timestamp time) {
        this.content = content;
        this.create_person = create_person;
        this.id = id;
        this.name = name;
        this.note_class = note_class;
        this.time = time;
    }

    public Note() {
    }

    @Override
    public String toString() {
        return "Note{" +
                "content='" + content + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", create_person='" + create_person + '\'' +
                ", note_class='" + note_class + '\'' +
                '}';
    }
}
