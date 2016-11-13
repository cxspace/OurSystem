package com.cx.sys.prj_doc.service.impl;

import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.sys.prj_doc.dao.PrjDocDao;
import com.cx.sys.prj_doc.entity.PrjDoc;
import com.cx.sys.prj_doc.service.PrjDocService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-13.
 */

@Service("prjDocService")
public class PrjDocServiceImpl extends BaseServiceImpl<PrjDoc> implements PrjDocService {

    private PrjDocDao prjDocDao;

    @Resource
    public void setPrjDocDao(PrjDocDao prjDocDao) {
        super.setBaseDao(prjDocDao);
        this.prjDocDao = prjDocDao;
    }
}
