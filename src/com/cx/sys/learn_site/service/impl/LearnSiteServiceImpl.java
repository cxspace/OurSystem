package com.cx.sys.learn_site.service.impl;

import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.sys.learn_site.dao.LearnSiteDao;
import com.cx.sys.learn_site.entity.LearnSite;
import com.cx.sys.learn_site.service.LearnSiteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-16.
 */

@Service("learnSiteService")
public class LearnSiteServiceImpl extends BaseServiceImpl<LearnSite> implements LearnSiteService {

    private LearnSiteDao learnSiteDao;

    @Resource
    public void setLearnSiteDao(LearnSiteDao learnSiteDao) {
        super.setBaseDao(learnSiteDao);
        this.learnSiteDao = learnSiteDao;
    }
}
