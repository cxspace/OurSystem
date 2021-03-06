package com.cx.sys.learn_route.action;

import com.cx.core.action.BaseAction;
import com.cx.core.page.PageResult;
import com.cx.core.utils.DateTimeHelper;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.learn_route.entity.LearnRoute;
import com.cx.sys.learn_route.service.LearnRouteService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cxspace on 16-11-16.
 */
public class LearnRouteSysAction extends BaseAction {

    @Resource
    private LearnRouteService learnRouteService;

    private LearnRoute learnRoute;

    private List<LearnRoute> learnRouteList = new ArrayList<>();

    private String [] selectedRow;

    private PageResult pageResult;

    public String listUI() throws Exception {

        QueryHelper queryHelper = new QueryHelper(LearnRoute.class,"i");

        queryHelper.addOrderByProperty("i.time",QueryHelper.ORDER_BY_DESC);

        pageResult = learnRouteService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "listUI";
    }


    public String add(){

        if (learnRoute!=null) {

            learnRoute.setTime(DateTimeHelper.getCurrentDateTime());

            learnRouteService.save(learnRoute);

        }
        return "list";
    }

    public String addUI() throws Exception {
        return "addUI";
    }

    public String delete(){

        if (learnRoute!=null){

            if (learnRoute.getId()!=null){

                learnRouteService.delete(learnRoute.getId());

            }

        }

        return "list";
    }

    public String deleteSelected(){

        if (selectedRow!=null){

            for (String id : selectedRow){

                learnRouteService.delete(id);

            }

        }

        return "list";
    }

    public String edit(){

        if (learnRoute!=null){

            if (learnRoute.getId()!=null){

                learnRoute.setTime(DateTimeHelper.getCurrentDateTime());
                learnRouteService.update(learnRoute);
            }

        }

        return "list";
    }

    public String editUI() throws Exception {

        if (learnRoute!=null){

            if (learnRoute.getId()!=null){

                learnRoute = learnRouteService.findObjectById(learnRoute.getId());

            }

        }

        return "editUI";
    }

    public LearnRouteService getLearnRouteService() {
        return learnRouteService;
    }

    public void setLearnRouteService(LearnRouteService learnRouteService) {
        this.learnRouteService = learnRouteService;
    }

    public LearnRoute getLearnRoute() {
        return learnRoute;
    }

    public void setLearnRoute(LearnRoute learnRoute) {
        this.learnRoute = learnRoute;
    }

    public List<LearnRoute> getLearnRouteList() {
        return learnRouteList;
    }

    public void setLearnRouteList(List<LearnRoute> learnRouteList) {
        this.learnRouteList = learnRouteList;
    }

    public String[] getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(String[] selectedRow) {
        this.selectedRow = selectedRow;
    }

    public PageResult getPageResult() {
        return pageResult;
    }

    public void setPageResult(PageResult pageResult) {
        this.pageResult = pageResult;
    }
}
