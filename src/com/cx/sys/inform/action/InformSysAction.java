package com.cx.sys.inform.action;

import com.cx.core.action.BaseAction;
import com.cx.core.page.PageResult;
import com.cx.core.utils.QueryHelper;
import com.cx.sys.inform.entity.Inform;
import com.cx.sys.inform.service.InformService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import sun.print.PrinterJobWrapper;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by cxspace on 16-11-13.
 */
public class InformSysAction extends BaseAction {

    @Resource
    private InformService informService;

    private Inform inform;

    private List<Inform> informList = new ArrayList<Inform>();

    private String [] selectedRow;

    private PageResult pageResult;

    public String listUI() {

//        informList =  informService.findObjects();
        //分页查询Inform中数据
        QueryHelper queryHelper = new QueryHelper(Inform.class,"i");

        queryHelper.addCondition("i.state = ? ",1);

        queryHelper.addOrderByProperty("i.createTime",QueryHelper.ORDER_BY_DESC);

        pageResult = informService.getPageResult(queryHelper,getPageNo(),getPageSize());

        return "listUI";
    }

    public String addUI(){

        inform = new Inform();

        inform.setCreateTime(new Timestamp(new Date().getTime()));

        return "addUI";
    }

//  通知公告添加逻辑
    public String add(){

        if (inform != null){
            informService.save(inform);
        }

        return "list";
    }

    public String delete(){

        if (inform!= null)
        {
            if (inform.getId() != null) {
                informService.delete(inform.getId());
            }
        }

        return "list";
    }

    public String deleteAll(){

        if (selectedRow != null){

            for (String id : selectedRow){
                informService.delete(id);
            }

        }

        return "list";
    }

    public String editUI(){

        if (inform.getId()!= null){

            inform = informService.findObjectById(inform.getId());

        }

        return "editUI";

    }

    public String edit(){

        if (inform!=null)
        {
            if (inform.getId() != null){
                informService.update(inform);
            }
        }

        return "list";
    }

//    ajax异步处理用户的状态
    public void publicInform(){

        try {

            if (inform != null){

                //更新要修改状态的记录
                Inform temp = informService.findObjectById(inform.getId());

                temp.setState(inform.getState());

                informService.update(temp);

                //输出结果到前台
                HttpServletResponse response = ServletActionContext.getResponse();

                response.setContentType("text/html;charset=utf-8");

                PrintWriter pw = response.getWriter();
                pw.write("ok");
                pw.flush();
                pw.close();

            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public InformService getInformService() {
        return informService;
    }

    public void setInformService(InformService informService) {
        this.informService = informService;
    }


    public Inform getInform() {
        return inform;
    }

    public void setInform(Inform inform) {
        this.inform = inform;
    }

    public List<Inform> getInformList() {
        return informList;
    }

    public void setInformList(List<Inform> informList) {
        this.informList = informList;
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