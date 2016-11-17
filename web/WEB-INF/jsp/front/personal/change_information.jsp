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

    <title>OUR_SYS | 修改个人信息</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/js/jquery-ui/css/no-theme/jquery-ui-1.10.3.custom.min.css">
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
                    <a href="../../index.html">
                        <img src="${pageContext.request.contextPath}/assets/images/logo/LOGO.png" width="120" alt="" />
                    </a>
                </div>

                <!-- logo collapse icon -->
                <div class="sidebar-collapse">
                    <a href="#" class="sidebar-collapse-icon"><!-- add class "with-animation" if you want sidebar to have animation during expanding/collapsing transition -->
                        <i class="entypo-menu"></i>
                    </a>
                </div>


                <!-- open/close menu icon (do not remove if you want to enable menu on mobile devices) -->
                <div class="sidebar-mobile-menu visible-xs">
                    <a href="#" class="with-animation"><!-- add class "with-animation" to support animation -->
                        <i class="entypo-menu"></i>
                    </a>
                </div>

            </header>


            <ul id="main-menu" class="main-menu">
                <li>
                    <a>
                        <i class="entypo-user"></i>
                        <span class="title">我的工作台</span>
                    </a>
                    <ul>
                        <li>
                            <a href="info.html">
                                <span class="title">我的个人信息</span>
                            </a>
                        </li>
                        <li>
                            <a href="info.html">
                                <span class="title">我收到的通知</span>
                            </a>
                        </li>
                        <li>
                            <a href="prj_list.html">
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
                            <a href="../learn_hall/route_list.html">
                                <span class="title">学习路线</span>
                            </a>
                        </li>
                        <li>
                            <a href="../learn_hall/site_list.html">
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
                            <a href="../share_hall/link_list.html">
                                <span class="title">资料链接分享</span>
                            </a>
                        </li>
                        <li>
                            <a href="../share_hall/experience_list.html">
                                <span class="title">学习经验分享</span>
                            </a>
                        </li>

                    </ul>

                </li>
                <li>
                    <a>
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
                            <a href="../our_note/note_list.html">
                                <span class="title">查看笔记</span>
                            </a>
                        </li>
                        <li>
                            <a href="../our_note/note_add.html">
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
                            <a href="../competition/competition_list.html">
                                <span class="title">相关竞赛介绍</span>
                            </a>
                        </li>
                        <li>
                            <a href="../competition/cur_comp_list.html">
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
                            <a href="../../sys/user/listUI.html">
                                <span class="title">用户管理</span>
                            </a>
                        </li>
                        <li>
                            <a href="../../sys/project/listUI.html">
                                <span class="title">项目管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="../../sys/prj_task/listUI.html">
                                <span class="title">项目任务管理</span>
                            </a>
                        </li>

                        <li>
                            <a href=../../sys/prj_doc/listUI.html">
                                <span class="title">项目文档管理</span>
                            </a>
                        </li>

                        <li>
                            <a href=../../sys/learn_route/listUI.html">
                                <span class="title">学习路线管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="../../sys/learn_site/listUI.html">
                                <span class="title">学习站点管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="../../sys/res_link/listUI.html">
                                <span class="title">资料链接管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="../../sys/experience/listUI.html">
                                <span class="title">经验分享管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="../../sys/note_class/listUI.html">
                                <span class="title">笔记分类管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="../../sys/note/listUI.html">
                                <span class="title">笔记管理</span>
                            </a>
                        </li>


                        <li>
                            <a href="../../sys/competition/listUI.html">
                                <span class="title">竞赛介绍管理</span>
                            </a>
                        </li>


                        <li>
                            <a href="../../sys/current_competion/listUI.html">
                                <span class="title">最近比赛管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="../../sys/inform/listUI.html">
                                <span class="title">通知公告管理</span>
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>

        </div>

    </div>

    <div class="main-content">



        <ol class="breadcrumb bc-3" >
            <li>
                <a href="../../index.html"><i class="fa-home"></i>主页</a>
            </li>

            <li>
                <a>我的工作台</a>
            </li>
            <li class="active">

                <strong>修改个人信息</strong>
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
                                <strong>
                                    <a><s:property value="user.user_name"></s:property></a>
                                </strong>

                                <span>用户名</span>
                            </div>
                        </li>

                        <li>
                            <div class="profile-stat">
                                <h3><s:property value="user.score"></s:property></h3>
                                <span><a>项目积分</a></span>
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
                            <li><a href="${pageContext.request.contextPath}/front_user_info.action">消息通知</a></li>
                            <li  class="active"><a href="${pageContext.request.contextPath}/front_user_change_information.action">修改个人信息</a></li>
                            <li><a href="${pageContext.request.contextPath}/front_user_prj_list.action">我的项目任务列表</a></li>

                        </ul>
                    </div>
                </div>

            </section>


            <section class="profile-feed">

                <!-- profile stories -->
                <div class="profile-stories">

                    <div class="title">
                        <h3>个人信息修改</h3>
                    </div>

                    <table class="table table-bordered table-striped datatable" id="table-2">
                        <thead>
                        <tr>
                            <th>信息</th>

                            <th>

                                操作

                            </th>


                        </tr>
                        </thead>

                        <tbody>

                        <tr>
                            <td>电话</td>

                            <td>
                                <a href="javascript:;" onclick="jQuery('#modal-2').modal('show', {backdrop: 'static'});" class="btn btn-default">修改</a>
                            </td>


                        </tr>
                        <tr>
                            <td>邮箱</td>

                            <td>
                                <a href="javascript:;" onclick="jQuery('#modal-3').modal('show', {backdrop: 'static'});" class="btn btn-default">修改</a>
                            </td>
                        </tr>

                        <tr>
                            <td>生日</td>

                            <td>
                                <a href="javascript:;" onclick="jQuery('#modal-4').modal('show', {backdrop: 'static'});" class="btn btn-default">修改</a>
                            </td>
                        </tr>

                        <tr>
                            <td>密码</td>

                            <td>
                                <a href="javascript:;" onclick="jQuery('#modal-5').modal('show', {backdrop: 'static'});" class="btn btn-default">修改</a>
                            </td>
                        </tr>

                        <tr>
                            <td>修改头像</td>

                            <td>
                                <a href="javascript:;" onclick="jQuery('#modal-6').modal('show', {backdrop: 'static'});" class="btn btn-default">修改</a>
                            </td>
                        </tr>

                        </tbody>
                    </table>

                </div>

            </section>
        </div>


        <br>
        <br>
        <br>
        <br>
        <br>
        <br>

        <!-- Modal 2 修改电话-->
        <div class="modal fade" id="modal-2">
            <div class="modal-dialog">
                <div class="modal-content">

                    <form action="${pageContext.request.contextPath}/front_user_change_phone.action" method="post">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title">修改电话</h4>
                        </div>

                        <div class="modal-body">


                            <div class="row">
                                <div class="col-md-12">

                                    <div class="form-group no-margin">
                                        <div class="col-sm-12">
                                            <input name="phone" type="text" class="form-control" value="<s:property value="user.phone"></s:property>" id="field-2">
                                        </div>
                                    </div>

                                </div>
                            </div>

                        </div>

                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="submit" class="btn btn-info">提交</button>
                        </div>

                    </form>

                </div>
            </div>
        </div>

        <!--修改电话-->

        <!-- Modal 3 修改邮箱-->
        <div class="modal fade" id="modal-3">
            <div class="modal-dialog">
                <div class="modal-content">

                    <form action="${pageContext.request.contextPath}/front_user_change_email.action" method="post">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title">修改邮箱</h4>
                        </div>

                        <div class="modal-body">


                            <div class="row">
                                <div class="col-md-12">

                                    <div class="form-group no-margin">
                                        <div class="col-sm-12">
                                            <input type="text" class="form-control" name="email" id="field-3" value="<s:property value="user.email"></s:property>">
                                        </div>
                                    </div>

                                </div>
                            </div>

                        </div>

                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="submit" class="btn btn-info">提交</button>
                        </div>

                    </form>

                </div>
            </div>
        </div>

        <!--修改邮箱-->

        <!-- Modal 4 修改生日-->
        <div class="modal fade" id="modal-4">
            <div class="modal-dialog">
                <div class="modal-content">

                    <form action="${pageContext.request.contextPath}/front_user_change_birthday.action" method="post">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title">修改生日</h4>
                        </div>

                        <div class="modal-body">


                            <div class="row">
                                <div class="col-md-12">

                                    <div class="form-group no-margin">
                                        <div class="col-sm-12">
                                            <input type="text" name="birthday" class="form-control datepicker" value="<s:property value="user.birthday"></s:property>" data-start-view="2" readonly>
                                        </div>
                                    </div>

                                </div>
                            </div>

                        </div>

                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="submit" class="btn btn-info">提交</button>
                        </div>

                    </form>

                </div>
            </div>
        </div>

        <!--修改生日-->



        <!-- Modal 5 修改密码-->
        <div class="modal fade" id="modal-5">
            <div class="modal-dialog">
                <div class="modal-content">

                    <form action="${pageContext.request.contextPath}/front_user_change_password.action" method="post">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title">修改密码</h4>
                        </div>

                        <div class="modal-body">


                            <div class="row">
                                <div class="col-md-12">

                                    <div class="form-group no-margin">


                                        <div class="col-sm-12">
                                            <input type="password" name="password_one" class="form-control" id="pwd1">
                                        </div>

                                        <br>

                                        <div class="col-sm-12">
                                            <input type="password" name="password" class="form-control" id="pwd2">
                                        </div>
                                        
                                    </div>

                                </div>
                            </div>

                        </div>

                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="submit" class="btn btn-info">提交</button>
                        </div>

                    </form>

                </div>
            </div>
        </div>

        <!--修改密码-->

        <!-- Modal 6 修改头像-->
        <div class="modal fade" id="modal-6">
            <div class="modal-dialog">
                <div class="modal-content">

                    <form action="${pageContext.request.contextPath}/front_user_change_headImg.action" method="post" enctype="multipart/form-data">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title">修改头像</h4>
                        </div>

                        <div class="modal-body">

                            <div class="row">
                                <div class="col-md-12">

                                    <div class="form-group no-margin">
                                        <div class="col-sm-12">
                                            <input type="file" name="headImg" class="form-control" id="field-8">
                                        </div>
                                    </div>

                                </div>
                            </div>

                        </div>

                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="submit" class="btn btn-info">提交</button>
                        </div>

                    </form>

                </div>
            </div>
        </div>

        <!--修改头像-->





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

    <script src="${pageContext.request.contextPath}/assets/js/bootstrap-datepicker.js"></script>


    <!-- Imported scripts on this page -->
    <script src="${pageContext.request.contextPath}/assets/js/neon-chat.js"></script>


    <!-- JavaScripts initializations and stuff -->
    <script src="${pageContext.request.contextPath}/assets/js/neon-custom.js"></script>


    <!-- Demo Settings -->
    <script src="${pageContext.request.contextPath}/assets/js/neon-demo.js"></script>

</body>
</html>