package com.cx.sys.res_link.service.impl;

import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.sys.res_link.dao.ResLinkDao;
import com.cx.sys.res_link.entity.ResLink;
import com.cx.sys.res_link.service.ResLinkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-16.
 */

@Service("resLinkService")
public class ResLinkServiceImpl extends BaseServiceImpl<ResLink> implements ResLinkService {

    private ResLinkDao resLinkDao;
    @Resource
    public void setResLinkDao(ResLinkDao resLinkDao) {
        super.setBaseDao(resLinkDao);
        this.resLinkDao = resLinkDao;
    }
}
