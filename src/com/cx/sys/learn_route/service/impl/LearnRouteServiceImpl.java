package com.cx.sys.learn_route.service.impl;

import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.sys.learn_route.dao.LearnRouteDao;
import com.cx.sys.learn_route.entity.LearnRoute;
import com.cx.sys.learn_route.service.LearnRouteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-16.
 */

@Service("learnRouteService")
public class LearnRouteServiceImpl extends BaseServiceImpl<LearnRoute> implements LearnRouteService {

    private LearnRouteDao learnRouteDao;

    @Resource
    public void setLearnRouteDao(LearnRouteDao learnRouteDao) {
        super.setBaseDao(learnRouteDao);
        this.learnRouteDao = learnRouteDao;
    }

}
