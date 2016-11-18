package com.cx.sys.learn_route.action;

import com.cx.core.action.BaseAction;
import com.cx.core.page.PageResult;
import com.cx.core.utils.DateTimeHelper;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.learn_route.entity.LearnRoute;
import com.cx.sys.learn_route.service.LearnRouteService;
import javax.annotation.Resource;

/**
 * Created by cxspace on 16-11-18.
 */
public class LearnRouteFrontAction extends BaseAction {


    @Resource
    private LearnRouteService learnRouteService;

    private LearnRoute learnRoute;

    private PageResult pageResult;

    public String route_add(){
        return "route_add";
    }

    public String add(){

        if (learnRoute!=null){

            learnRoute.setTime(DateTimeHelper.getCurrentDateTime());

            learnRouteService.save(learnRoute);

        }

        return "list";
    }

    public String route_detail(){

        if (learnRoute!=null){

            if (learnRoute.getId()!=null){

                learnRoute = learnRouteService.findObjectById(learnRoute.getId());

            }

        }

        return "route_detail";
    }

    public String route_list(){

        QueryHelper queryHelper = new QueryHelper(LearnRoute.class,"i");

        queryHelper.addOrderByProperty("i.time",QueryHelper.ORDER_BY_DESC);

        pageResult = learnRouteService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "route_list";
    }

    public LearnRoute getLearnRoute() {
        return learnRoute;
    }

    public void setLearnRoute(LearnRoute learnRoute) {
        this.learnRoute = learnRoute;
    }

    public LearnRouteService getLearnRouteService() {
        return learnRouteService;
    }

    public void setLearnRouteService(LearnRouteService learnRouteService) {
        this.learnRouteService = learnRouteService;
    }

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }
}
