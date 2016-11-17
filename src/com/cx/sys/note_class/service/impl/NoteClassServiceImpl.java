package com.cx.sys.note_class.service.impl;

import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.sys.note_class.dao.NoteClassDao;
import com.cx.sys.note_class.entity.NoteClass;
import com.cx.sys.note_class.service.NoteClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-17.
 */

@Service("noteClassService")
public class NoteClassServiceImpl extends BaseServiceImpl<NoteClass> implements NoteClassService {

    private NoteClassDao noteClassDao;
    @Resource
    public void setNoteClassDao(NoteClassDao noteClassDao) {
        super.setBaseDao(noteClassDao);
        this.noteClassDao = noteClassDao;
    }
}
