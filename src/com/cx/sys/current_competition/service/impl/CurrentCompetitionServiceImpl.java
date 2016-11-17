package com.cx.sys.current_competition.service.impl;

import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.sys.competition.entity.Competition;
import com.cx.sys.current_competition.dao.CurrentCompetitionDao;
import com.cx.sys.current_competition.entity.CurrentCompetition;
import com.cx.sys.current_competition.service.CurrentCompetitionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-17.
 */

@Service("currentCompetitionService")
public class CurrentCompetitionServiceImpl extends BaseServiceImpl<CurrentCompetition> implements CurrentCompetitionService {

    private CurrentCompetitionDao currentCompetitionDao;

    @Resource
    public void setCurrentCompetitionDao(CurrentCompetitionDao currentCompetitionDao) {
        super.setBaseDao(currentCompetitionDao);
        this.currentCompetitionDao = currentCompetitionDao;
    }

}
