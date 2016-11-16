package com.cx.sys.project.entity;

import java.io.Serializable;

/**
 * Created by cxspace on 16-11-16.
 */
public class ProjectDoc implements Serializable {

    private ProjectDocId id;

    public ProjectDocId getId() {
        return id;
    }

    public void setId(ProjectDocId id) {
        this.id = id;
    }

    public ProjectDoc(ProjectDocId id) {
        this.id = id;
    }

    public ProjectDoc() {
    }
}
