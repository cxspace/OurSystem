<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="Neon Admin Panel" />
    <meta name="author" content="" />

    <title>Neon | Profile</title>

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
<body class="page-body" data-url="http://neon.dev">

<div class="page-container"><!-- add class "sidebar-collapsed" to close sidebar by default, "chat-visible" to make chat appear always -->

    <div class="sidebar-menu">

        <div class="sidebar-menu-inner">

            <header class="logo-env">

                <!-- logo -->
                <div class="logo">
                    <a href="${pageContext.request.contextPath}/index.html">
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
                <!-- add class "multiple-expanded" to allow multiple submenus to open -->
                <!-- class "auto-inherit-active-class" will automatically add "active" class for parent elements who are marked already with class "active" -->
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
                            <a href="${pageContext.request.contextPath}/sys/user/listUI.html">
                                <span class="title">用户管理</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/sys/project/listUI.html">
                                <span class="title">项目管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/sys/prj_task/listUI.html">
                                <span class="title">项目任务管理</span>
                            </a>
                        </li>

                        <li>
                            <a href=${pageContext.request.contextPath}/sys/prj_doc/listUI.html">
                                <span class="title">项目文档管理</span>
                            </a>
                        </li>

                        <li>
                            <a href=${pageContext.request.contextPath}/sys/learn_route/listUI.html">
                                <span class="title">学习路线管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/sys/learn_site/listUI.html">
                                <span class="title">学习站点管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/sys/res_link/listUI.html">
                                <span class="title">资料链接管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/sys/experience/listUI.html">
                                <span class="title">经验分享管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/sys/note_class/listUI.html">
                                <span class="title">笔记分类管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/sys/note/listUI.html">
                                <span class="title">笔记管理</span>
                            </a>
                        </li>


                        <li>
                            <a href="${pageContext.request.contextPath}/sys/competition/listUI.html">
                                <span class="title">竞赛介绍管理</span>
                            </a>
                        </li>


                        <li>
                            <a href="${pageContext.request.contextPath}/sys/current_competion/listUI.html">
                                <span class="title">最近比赛管理</span>
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/sys/inform/listUI.html">
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
                <a href="${pageContext.request.contextPath}/index.html"><i class="fa-home"></i>主页</a>
            </li>

            <li>
                <a>我的工作台</a>
            </li>
            <li class="active">

                <strong>任务列表</strong>
            </li>
        </ol>

        <hr />

        <div class="profile-env">

            <header class="row">

                <div class="col-sm-2">

                    <a href="#" class="profile-picture">
                        <img src="${pageContext.request.contextPath}/assets/images/profile-picture.png" class="img-responsive img-circle" />
                    </a>

                </div>

                <div class="col-sm-7">

                    <ul class="profile-info-sections">
                        <li>
                            <div class="profile-name">
                                <strong>
                                    <a>张三</a>

                                </strong>
                                <span><a href="#">查看日历</a></span>
                            </div>
                        </li>

                        <li>
                            <div class="profile-stat">
                                <h3>600</h3>
                                <span><a>项目积分</a></span>
                            </div>
                        </li>

                        <li>
                            <div class="profile-stat">
                                <h3>10</h3>
                                <span><a>通知总数</a></span>
                            </div>
                        </li>
                    </ul>

                </div>

                <div class="col-sm-3">

                 
                </div>

            </header>

            <section class="profile-info-tabs">

                <div class="row">

                    <div class="col-sm-offset-2 col-sm-10">

                        <ul class="user-details">
                            <li>
                                <a>
                                    <i class="entypo-qq"></i>
                                    账号:442961832
                                </a>
                            </li>

                            <li>
                                <a>
                                    <i class="entypo-mail"></i>
                                    邮箱:442961832@qq.com
                                </a>
                            </li>

                            <li>
                                <a>
                                    <i class="entypo-phone"></i>
                                    电话:13037239781
                                </a>
                            </li>

                            <li>
                                <a>
                                    <i class="entypo-calendar"></i>
                                    生日:03/19/1996
                                </a>
                            </li>
                        </ul>


                        <!-- tabs for the profile links -->
                        <ul class="nav nav-tabs">
                            <li><a href="${pageContext.request.contextPath}/front_user_info.action">消息通知</a></li>
                            <li><a href="${pageContext.request.contextPath}/front_user_change_information.action">修改个人信息</a></li>
                            <li  class="active"><a href="${pageContext.request.contextPath}/front_user_prj_list.action">我的项目任务列表</a></li>
                        </ul>
                    </div>
                </div>

            </section>


            <section class="profile-feed">

                <!-- profile stories -->
                <div class="profile-stories">


                    <h3>我的任务列表</h3>

                    <table class="table table-bordered table-striped datatable" id="table-2">
                        <thead>
                        <tr>

                            <th>任务名</th>
                            <th>发布时间</th>
                            <th>任务期限</th>

                            <th>任务积分</th>

                            <th>任务状态</th>


                            <th>

                              操作

                            </th>


                        </tr>
                        </thead>

                        <tbody>

                        <tr>

                            <td>神通录前端页面制作</td>
                            <td>2016-09-19</td>
                            <td>2016-12-10</td>
                            <td>100</td>

                            <td>未完成/已提交/已完成</td>

                            <td>
                                <a href="#" class="btn btn-info btn-sm btn-icon icon-left">
                                    <i class="entypo-right"></i>
                                    提交任务
                                </a>
                            </td>


                        </tr>


                        </tbody>
                    </table>


                    <ul class="pagination">
                        <li><a href="#"><i class="entypo-left-open-mini"></i></a></li>
                        <li><a href="#">1</a></li>
                        <li class="active"><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li class="disabled"><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">6</a></li>
                        <li><a href="#"><i class="entypo-right-open-mini"></i></a></li>
                    </ul>

                </div>

            </section>
        </div>


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