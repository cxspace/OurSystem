package com.cx.sys.competition.service.impl;

import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.sys.competition.dao.CompetitionDao;
import com.cx.sys.competition.entity.Competition;
import com.cx.sys.competition.service.CompetitionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-17.
 */

@Service("competitionService")
public class CompetitionServiceImpl extends BaseServiceImpl<Competition> implements CompetitionService {

    private CompetitionDao competitionDao;
    @Resource
    public void setCompetitionDao(CompetitionDao competitionDao) {
        super.setBaseDao(competitionDao);
        this.competitionDao = competitionDao;
    }
}
