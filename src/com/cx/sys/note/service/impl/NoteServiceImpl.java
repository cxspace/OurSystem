package com.cx.sys.note.service.impl;

import com.cx.core.service.BaseService;
import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.sys.note.dao.NoteDao;
import com.cx.sys.note.entity.Note;
import com.cx.sys.note.service.NoteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-17.
 */

@Service("noteService")
public class NoteServiceImpl extends BaseServiceImpl<Note> implements NoteService{

    private NoteDao noteDao;

    @Resource

    public void setNoteDao(NoteDao noteDao) {
        super.setBaseDao(noteDao);
        this.noteDao = noteDao;
    }
}
