package com.cx.sys.inform.service.impl;

import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.sys.inform.dao.InformDao;
import com.cx.sys.inform.entity.Inform;
import com.cx.sys.inform.service.InformService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-13.
 */


@Service("infoService")
public class InformServiceImpl extends BaseServiceImpl<Inform> implements InformService {

    private InformDao informDao;

    @Resource

    public void setInformDao(InformDao informDao) {

        super.setBaseDao(informDao);
        this.informDao = informDao;
    }
}






