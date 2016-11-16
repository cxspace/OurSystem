package com.cx.sys.project.entity;

import com.cx.sys.prj_doc.entity.PrjDoc;

import java.io.Serializable;

/**
 * Created by cxspace on 16-11-16.
 */
public class ProjectDocId implements Serializable {

    private PrjDoc prjDoc;

    private String prj_id;

    public String getPrj_id() {
        return prj_id;
    }

    public void setPrj_id(String prj_id) {
        this.prj_id = prj_id;
    }

    public PrjDoc getPrjDoc() {
        return prjDoc;
    }

    public void setPrjDoc(PrjDoc prjDoc) {
        this.prjDoc = prjDoc;
    }

    public ProjectDocId(String prj_id, PrjDoc prjDoc) {
        this.prj_id = prj_id;
        this.prjDoc = prjDoc;
    }

    public ProjectDocId() {
    }
}
