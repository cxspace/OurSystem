package com.cx.sys.experience.service.impl;

import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.sys.experience.dao.ExperienceDao;
import com.cx.sys.experience.entity.Experience;
import com.cx.sys.experience.service.ExperienceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-17.
 */

@Service("experienceService")
public class ExperienceServiceImpl extends BaseServiceImpl<Experience> implements ExperienceService {

    private ExperienceDao experienceDao;

    @Resource
    public void setExperienceDao(ExperienceDao experienceDao) {
        super.setBaseDao(experienceDao);
        this.experienceDao = experienceDao;
    }

}
