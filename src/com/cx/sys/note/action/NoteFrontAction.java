package com.cx.sys.note.action;

import com.cx.core.action.BaseAction;
import com.cx.core.constant.Constant;
import com.cx.core.page.PageResult;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.note.entity.Note;
import com.cx.sys.note.service.NoteService;
import com.cx.sys.note_class.entity.NoteClass;
import com.cx.sys.note_class.service.NoteClassService;
import com.cx.sys.user.entity.User;
import com.opensymphony.xwork2.ActionContext;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by cxspace on 16-11-18.
 */
public class NoteFrontAction extends BaseAction {

    private Note note;

    private NoteClass noteClass;

    private List<Note> noteList = new ArrayList<>();

    private List<NoteClass> noteClassList = new ArrayList<>();

    @Resource
    private NoteService noteService;

    @Resource
    private NoteClassService noteClassService;

    private PageResult pageResult;

    public String note_add(){

        noteClassList = noteClassService.findObjects();
        return "note_add";
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

    public String note_search(){

        QueryHelper queryHelper = new QueryHelper(Note.class,"i");

        if (note!=null){

            if (StringUtils.isNotBlank(note.getName())){
                queryHelper.addCondition("i.name like ? ","%"+note.getName()+"%");

                pageResult = noteService.getPageResult(queryHelper,getPageNo(),getPageSize());

            }
        }
        return "note_list";
    }

    public String note_detail(){

        if (note!=null){

            if (note.getId()!=null){

                note = noteService.findObjectById(note.getId());

            }

        }

        return "note_detail";
    }



    public String note_list(){

        //分页查询Inform中数据
        QueryHelper queryHelper = new QueryHelper(Note.class,"i");

        queryHelper.addOrderByProperty("i.time",QueryHelper.ORDER_BY_DESC);

        pageResult = noteService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "note_list";
    }

    public Note getNote() {


        return note;
    }

    public void setNote(Note note) {

        this.note = note;
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

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }
}
