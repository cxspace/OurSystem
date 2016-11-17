package com.cx.sys.note_class.action;


import com.cx.sys.note_class.entity.NoteClass;
import com.cx.sys.note_class.service.NoteClassService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cxspace on 16-11-17.
 */
public class NoteClassSysAction extends ActionSupport{

    private NoteClass noteClass;

    @Resource
    private NoteClassService noteClassService;

    private List<NoteClass> noteClassList;

    private String [] selectedRow;

    public String addUI(){
        return "addUI";
    }

    public String listUI(){

        noteClassList = noteClassService.findObjects();

        return "listUI";
    }
    public String editUI(){

        if (noteClass!=null){

            if (noteClass.getId()!=null){

                noteClass = noteClassService.findObjectById(noteClass.getId());

            }

        }

        return "editUI";
    }

    public String add(){

        if (noteClass != null){

            noteClassService.save(noteClass);

        }

        return "list";
    }

    public String edit(){

        if (noteClass!=null){

            noteClassService.update(noteClass);

        }

        return "list";
    }

    public String delete(){

        if (noteClass!=null){

            if (noteClass.getId()!=null)
            {
                noteClassService.delete(noteClass.getId());
            }

        }

        return "list";
    }

    public String deleteSelected(){

        if (selectedRow!=null){

            for (String id : selectedRow){

                noteClassService.delete(id);

            }

        }

        return "list";
    }

    public NoteClass getNoteClass() {
        return noteClass;
    }

    public void setNoteClass(NoteClass noteClass) {
        this.noteClass = noteClass;
    }

    public List<NoteClass> getNoteClassList() {
        return noteClassList;
    }

    public void setNoteClassList(List<NoteClass> noteClassList) {
        this.noteClassList = noteClassList;
    }

    public NoteClassService getNoteClassService() {
        return noteClassService;
    }

    public void setNoteClassService(NoteClassService noteClassService) {
        this.noteClassService = noteClassService;
    }

    public String[] getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(String[] selectedRow) {
        this.selectedRow = selectedRow;
    }
}
