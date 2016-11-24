package com.cx.sys.note.action;

import com.cx.core.action.BaseAction;
import com.cx.core.constant.Constant;
import com.cx.core.page.PageResult;
import com.cx.core.utils.DateTimeHelper;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.note.entity.Note;
import com.cx.sys.note.service.NoteService;
import com.cx.sys.note_class.entity.NoteClass;
import com.cx.sys.note_class.service.NoteClassService;
import com.cx.sys.user.entity.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by cxspace on 16-11-17.
 */
public class NoteSysAction extends BaseAction {

    @Resource
    private NoteService noteService;

    @Resource
    private NoteClassService noteClassService;

    private List<NoteClass> noteClassList;

    private NoteClass noteClass;

    private Note note;

    private List<Note> noteList;

    private String [] selectedRow;

    private PageResult pageResult;

//    导入笔记数据文件处理
    private File noteExcel;
    private String noteExcelContentType;
    private String noteExcelFileName;


    public String addUI(){

        noteClassList = noteClassService.findObjects();
        return "addUI";
    }


    public String listUI(){

        QueryHelper queryHelper = new QueryHelper(Note.class,"i");

        queryHelper.addOrderByProperty("i.time",QueryHelper.ORDER_BY_DESC);

        pageResult = noteService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "listUI";
    }

    public void ExportNoteExcel(){

        //实现数据导出
        noteList = noteService.findObjects();

        try {

            HttpServletResponse response = ServletActionContext.getResponse();

            response.setContentType("application/x-excel");

            String filename1 = "所有笔记数据"+DateTimeHelper.getCurrentDateTime()+".xls";

            response.setHeader("Content-Disposition","attachment;filename="+new String(filename1.getBytes(),"ISO-8859-1"));

            //拿到输出到浏览器的输出流
            ServletOutputStream outputStream = response.getOutputStream();

            noteService.exportExcel(noteList,outputStream);

            if (outputStream != null){
                outputStream.close();
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public String ImportNoteExcel(){

        if (noteExcel != null){

            String fileType = noteExcelFileName.substring(noteExcelFileName.lastIndexOf("."));

            if (fileType.equals(".xls")||fileType.equals(".xlsx")){

                noteService.importExcel(noteExcel,fileType);

            }

        }

        return "list";

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

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }

    public File getNoteExcel() {
        return noteExcel;
    }

    public void setNoteExcel(File noteExcel) {
        this.noteExcel = noteExcel;
    }

    public String getNoteExcelContentType() {
        return noteExcelContentType;
    }

    public void setNoteExcelContentType(String noteExcelContentType) {
        this.noteExcelContentType = noteExcelContentType;
    }

    public String getNoteExcelFileName() {
        return noteExcelFileName;
    }

    public void setNoteExcelFileName(String noteExcelFileName) {
        this.noteExcelFileName = noteExcelFileName;
    }
}
