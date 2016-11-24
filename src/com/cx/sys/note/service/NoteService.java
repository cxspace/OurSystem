package com.cx.sys.note.service;

import com.cx.core.service.BaseService;
import com.cx.sys.note.entity.Note;

import javax.servlet.ServletOutputStream;
import java.io.File;
import java.util.List;

/**
 * Created by cxspace on 16-11-17.
 */
public interface NoteService extends BaseService<Note>{

    public void exportExcel(List<Note> noteList , ServletOutputStream outputStream);

    public void importExcel(File userExcel , String fileType);

}
