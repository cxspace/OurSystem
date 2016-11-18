<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="Neon Admin Panel" />
    <meta name="author" content="" />

    <title>个人主页</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font-icons/entypo/css/entypo.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/neon-core.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/neon-theme.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/neon-forms.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/custom.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/skins/white.css">


    <script src="${pageContext.request.contextPath}/assets/js/jquery-1.11.0.min.js"></script>
    <script>$.noConflict();</script>

    <!--[if lt IE 9]><script src="${pageContext.request.contextPath}/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->


</head>
<body class="page-body">

<div class="page-container"><!-- add class "sidebar-collapsed" to close sidebar by default, "chat-visible" to make chat appear always -->

    <div class="sidebar-menu">

        <div class="sidebar-menu-inner">

            <header class="logo-env">

                <!-- logo -->
                <div class="logo">
                    <a href="${pageContext.request.contextPath}/">
                        <img src="${pageContext.request.contextPath}/assets/images/logo/LOGO.png" width="120" alt="" />
                    </a>
                </div>

                <!-- logo collapse icon -->
                <div class="sidebar-collapse">
                    <a class="sidebar-collapse-icon"><!-- add class "with-animation" if you want sidebar to have animation during expanding/collapsing transition -->
                        <i class="entypo-menu"></i>
                    </a>
                </div>


                <!-- open/close menu icon (do not remove if you want to enable menu on mobile devices) -->
                <div class="sidebar-mobile-menu visible-xs">
                    <a class="with-animation"><!-- add class "with-animation" to support animation -->
                        <i class="entypo-menu"></i>
                    </a>
                </div>

            </header>


            <ul id="main-menu" class="main-menu">
                <!-- add class "multiple-expanded" to allow multiple submenus to open -->
                <!-- class "auto-inherit-active-class" will automatically add "active" class for parent elements who are marked already with class "active" -->
                <li>
                    <a>
                        <i class="entypo-user"></i>
                        <span class="title">我的工作台</span>
                    </a>
                    <ul>

                        <li>
                            <a href="${pageContext.request.contextPath}/front_user_info.action">
                                <span class="title">我收到的通知</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/front_user_change_information.action">
                                <span class="title">我的个人信息</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/front_user_prj_list.action">
                                <span class="title">我的项目任务</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a>
                        <i class="entypo-bag"></i>
                        <span class="title">学习大厅</span>
                    </a>
                    <ul>
                        <li>
                            <a href="${pageContext.request.contextPath}/front_learn_route_route_list.action">
                                <span class="title">学习路线</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/front_learn_route_route_list.action">
                                <span class="title">学习站点推荐</span>
                            </a>
                        </li>

                    </ul>
                </li>
                <li>
                    <a>
                        <i class="entypo-attach"></i>
                        <span class="title">分享大厅</span>
                    </a>

                    <ul>
                        <li>
                            <a href="${pageContext.request.contextPath}/front_share_hall_res_link_list.action">
                                <span class="title">资料链接分享</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/front_share_hall_experience_list.action">
                                <span class="title">学习经验分享</span>
                            </a>
                        </li>

                    </ul>

                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/front_prj_hall_prj_prj_list.action">
                        <i class="entypo-doc-text"></i>
                        <span class="title">项目大厅</span>
                    </a>

                </li>
                <li>
                    <a>
                        <i class="entypo-pencil"></i>
                        <span class="title">OUR NOTE</span>
                    </a>
                    <ul>
                        <li>
                            <a href="${pageContext.request.contextPath}/front_our_note_note_list.action">
                                <span class="title">查看笔记</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/front_our_note_note_add.action">
                                <span class="title">我要写笔记</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a>
                        <i class="entypo-trophy"></i>
                        <span class="title">竞赛专区</span>
                    </a>
                    <ul>
                        <li>
                            <a href="${pageContext.request.contextPath}/front_competition_competition_list.action">
                                <span class="title">相关竞赛介绍</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/front_current_competition_cur_comp_list.action">
                                <span class="title">最近可申报的竞赛</span>
                            </a>
                        </li>

                    </ul>
                </li>

                <li>
                    <a>
                        <i class="entypo-tools"></i>
                        <span class="title">系统管理</span>
                    </a>
                    <ul>
                        <li>
                            <a href="${pageContext.request.contextPath}/system_user_listUI.action">
                                <span class="title">用户管理</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/system_project_listUI.action">
                                <span class="title">项目管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/system_prj_task_prj_list.action">
                                <span class="title">项目任务管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/system_prj_doc_prj_list.action">
                                <span class="title">项目文档管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/system_learn_route_listUI.action">
                                <span class="title">学习路线管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/system_learn_site_listUI.action">
                                <span class="title">学习站点管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/system_res_link_listUI.action">
                                <span class="title">资料链接管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/system_experience_listUI.action">
                                <span class="title">经验分享管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/system_note_class_listUI.action">
                                <span class="title">笔记分类管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/system_note_listUI.action">
                                <span class="title">笔记管理</span>
                            </a>
                        </li>


                        <li>
                            <a href="${pageContext.request.contextPath}/system_competition_listUI.action">
                                <span class="title">竞赛介绍管理</span>
                            </a>
                        </li>


                        <li>
                            <a href="${pageContext.request.contextPath}/system_current_competition_listUI.action">
                                <span class="title">最近比赛管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/system_inform_listUI.action">
                                <span class="title">通知公告管理</span>
                            </a>
                        </li>
                    </ul>
                </li>

            </ul>

        </div>

    </div>

    <div class="main-content">

        <!-- Profile Info and Notifications -->
        <div class="col-md-6 col-sm-8 clearfix">

            <ul class="user-info pull-left pull-none-xsm">



            </ul>

        </div>


        <!-- Raw Links -->
        <div class="col-md-6 col-sm-4 clearfix hidden-xs">

            <ul class="list-inline links-list pull-right">


                <li>
                    <a href="${pageContext.request.contextPath}/front_user_info.action">
                        个人主页
                    </a>
                </li>



                <li>
                    <a href="${pageContext.request.contextPath}/user_loginOut.action">
                        注销 <i class="entypo-logout right"></i>
                    </a>
                </li>

            </ul>

        </div>



        <ol class="breadcrumb bc-3" >
            <li>
                <a><i class="fa-home"></i>主页</a>
            </li>

            <li>
                <a>我的工作台</a>
            </li>
            <li class="active">

                <strong>消息通知</strong>
            </li>
        </ol>

        <hr />

        <div class="profile-env">

            <header class="row">

                <div class="col-sm-2">

                    <a class="profile-picture">
                        <img src="${pageContext.request.contextPath}/upload/${sessionScope.SYSTEM_USER.head_img}" class="img-responsive img-circle" />
                    </a>

                </div>

                <div class="col-sm-7">

                    <ul class="profile-info-sections">
                        <li>
                            <div class="profile-name">
                                <h1>
                                    <a><s:property value="user.user_name"></s:property></a>
                                </h1>
                                <span>用户名</span>
                            </div>
                        </li>

                        <li>
                            <div class="profile-stat">
                                <h3><s:property value="user.score"></s:property></h3>
                                <span><a>项目积分</a></span>
                            </div>
                        </li>

                        <li>
                            <div class="profile-stat">
                                <h3><s:property value="pageResult.totalCount"/></h3>
                                <span><a>通知总数</a></span>
                            </div>
                        </li>
                    </ul>

                </div>

                <div class="col-sm-3">

                    <div class="profile-buttons">

                        <a class="btn btn-default">
                            <i class="entypo-mail"></i>
                            发送邮件给管理员
                        </a>
                    </div>
                </div>

            </header>

            <section class="profile-info-tabs">

                <div class="row">

                    <div class="col-sm-offset-2 col-sm-10">

                        <ul class="user-details">
                            <li>
                                <a>
                                    <i class="entypo-qq"></i>
                                    账号:<s:property value="user.account"></s:property>
                                </a>
                            </li>

                            <li>
                                <a>
                                    <i class="entypo-mail"></i>
                                    邮箱:<s:property value="user.email"></s:property>
                                </a>
                            </li>

                            <li>
                                <a>
                                    <i class="entypo-phone"></i>
                                    电话:<s:property value="user.phone"></s:property>
                                </a>
                            </li>

                            <li>
                                <a>
                                    <i class="entypo-calendar"></i>
                                    生日:<s:property value="user.birthday"></s:property>
                                </a>
                            </li>
                        </ul>


                        <!-- tabs for the profile links -->
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="${pageContext.request.contextPath}/front_user_info.action">消息通知</a></li>
                            <li><a href="${pageContext.request.contextPath}/front_user_change_information.action">修改个人信息</a></li>
                            <li><a href="${pageContext.request.contextPath}/front_user_prj_list.action">我的项目任务列表</a></li>

                        </ul>
                    </div>
                </div>

            </section>


            <section class="profile-feed">

                <!-- profile stories -->
                <div class="profile-stories">


                    <div class="title">
                        <h3>通知列表</h3>
                    </div>

                    <form name="form1" action="" method="post">

                    <table class="table table-bordered table-striped datatable" id="table-2">
                        <thead>
                        <tr>
                            <th>标题</th>
                            <th>发布时间</th>



                            <th>

                                操作

                            </th>


                        </tr>
                        </thead>

                        <tbody>


                        <s:iterator value="pageResult.items" status="st">



                        <tr>
                            <td><s:property value="title"></s:property></td>

                            <td><s:property value="createTime"></s:property></td>

                            <td>
                                <a href="${pageContext.request.contextPath}/front_user_info_detail.action?inform.id=<s:property value="id"></s:property>" class="btn btn-info btn-sm btn-icon icon-left">
                                    <i class="entypo-search"></i>
                                    查看通知详细
                                </a>
                            </td>

                        </tr>



                        </s:iterator>

                        </tbody>
                    </table>


                        <%--分页处理--%>
                    <s:if test="pageResult.totalCount > 0">
                    <ul class="pagination">

                        <s:if test="pageResult.pageNo > 1">

                            <li><a href="javascript:doGoPage(<s:property value="pageResult.pageNo-1"></s:property>)"><i class="entypo-left-open-mini"></i> 上一页</a></li>

                        </s:if>

                        &nbsp;&nbsp;&nbsp;&nbsp;

                        <s:if test="pageResult.pageNo < pageResult.totalPageCount">


                        <li><a href="javascript:doGoPage(<s:property value="pageResult.pageNo+1"></s:property>)"> 下一页<i class="entypo-right-open-mini"></i> </a></li>

                        </s:if>
                    </ul>


                        <hr>

                            总共 <s:property value="pageResult.totalCount"/>条记录

                            &nbsp;&nbsp;&nbsp;&nbsp;

                            当前<s:property value="pageResult.pageNo"/>页

                            &nbsp;&nbsp;&nbsp;&nbsp;


                            共<s:property value="pageResult.totalPageCount"></s:property>页


                            &nbsp;&nbsp;&nbsp;&nbsp;


                    </s:if>
                    <s:else>暂无数据！</s:else>

                        <%--分页处理--%>
                    </form>

                </div>

            </section>
        </div>

        <script type="text/javascript">

            function doGoPage(pageNo) {
                document.forms[0].action = "${pageContext.request.contextPath}/front_user_info.action?pageNo="+pageNo;
                document.forms[0].submit();
            }

        </script>

        <br>
        <br>
        <br>
        <br>
        <br>
        <br>


        <!-- Footer -->
        <footer class="main">

            &copy; 2016 <strong>PowerBy</strong>  <a href="http://github.com/cxspace" target="_blank">cxspace</a>


        </footer>
    </div>



</div>

<!-- Bottom scripts (common) -->
<script src="${pageContext.request.contextPath}/assets/js/gsap/main-gsap.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery-ui/js/jquery-ui-1.10.3.minimal.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/joinable.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/resizeable.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/neon-api.js"></script>


<!-- Imported scripts on this page -->
<script src="${pageContext.request.contextPath}/assets/js/neon-chat.js"></script>


<!-- JavaScripts initializations and stuff -->
<script src="${pageContext.request.contextPath}/assets/js/neon-custom.js"></script>


<!-- Demo Settings -->
<script src="${pageContext.request.contextPath}/assets/js/neon-demo.js"></script>

</body>
</html>