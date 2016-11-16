package com.cx.sys.prj_task.service.impl;

import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.sys.prj_task.dao.PrjTaskDao;
import com.cx.sys.prj_task.entity.PrjTask;
import com.cx.sys.prj_task.service.PrjTaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-15.
 */

@Service("prjTaskServiceImpl")
public class PrjTaskServiceImpl extends BaseServiceImpl<PrjTask> implements PrjTaskService {

    private PrjTaskDao prjTaskDao;
    @Resource
    public void setPrjTaskDao(PrjTaskDao prjTaskDao) {
        super.setBaseDao(prjTaskDao);
        this.prjTaskDao = prjTaskDao;
    }
}
