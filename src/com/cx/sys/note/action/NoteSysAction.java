package com.cx.sys.note.action;

import com.cx.core.constant.Constant;
import com.cx.sys.note.entity.Note;
import com.cx.sys.note.service.NoteService;
import com.cx.sys.note_class.entity.NoteClass;
import com.cx.sys.note_class.service.NoteClassService;
import com.cx.sys.user.entity.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by cxspace on 16-11-17.
 */
public class NoteSysAction {

    @Resource
    private NoteService noteService;

    @Resource
    private NoteClassService noteClassService;

    private List<NoteClass> noteClassList;

    private NoteClass noteClass;

    private Note note;

    private List<Note> noteList;

    private String [] selectedRow;

    public String addUI(){

        noteClassList = noteClassService.findObjects();
        return "addUI";
    }


    public String listUI(){

        noteList = noteService.findObjects();

        return "listUI";
    }


    public String editUI(){

        if (note!=null){

            if (note.getId()!=null){

                note = noteService.findObjectById(note.getId());

            }

        }

        return "editUI";
    }


    public String add(){

        if (note!=null){

            if (note.getNote_class()==null){
                note.setNote_class("其他");
            }

            User user = (User) ActionContext.getContext().getSession().get(Constant.USER);

            note.setCreate_person(user.getUser_name());
            note.setTime(new Timestamp(new Date().getTime()));

            noteService.save(note);
        }

        return "list";
    }


    public String edit(){

        if (note!=null){

            noteService.update(note);

        }

        return "list";
    }

    public String delete(){

        if (note != null){

            if (note.getId()!=null){

                noteService.delete(note.getId());

            }

        }

        return "list";
    }

    public String deleteSelected(){

        if (selectedRow != null){
            for (String id : selectedRow){

                noteService.delete(id);

            }
        }

        return "list";
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    public NoteService getNoteService() {
        return noteService;
    }

    public void setNoteService(NoteService noteService) {
        this.noteService = noteService;
    }

    public String[] getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(String[] selectedRow) {
        this.selectedRow = selectedRow;
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


}
