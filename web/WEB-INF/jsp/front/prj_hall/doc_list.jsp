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

    <title>文档列表</title>

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

<body class="page-body  page-fade">

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
                            <a href="${pageContext.request.contextPath}/front_learn_site_site_list.action">
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

        <div class="row">


            <!-- Profile Info and Notifications -->
            <div class="col-md-6 col-sm-8 clearfix">

                <ul class="user-info pull-left pull-none-xsm">

                    <!-- Profile Info -->
                    <li class="profile-info dropdown"><!-- add class "pull-right" if you want to place this from right -->

                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="${pageContext.request.contextPath}/upload/${sessionScope.SYSTEM_USER.head_img}" alt="" class="img-circle" width="44" />

                            ${sessionScope.SYSTEM_USER.user_name}

                        </a>

                    </li>

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

        </div>

        <script type="text/javascript">
            jQuery(document).ready(function($) {
                // Sample Toastr Notification
                setTimeout(function () {
                    var opts = {
                        "closeButton": true,
                        "debug": false,
                        "positionClass": rtl() || public_vars.$pageContainer.hasClass('right-sidebar') ? "toast-top-left" : "toast-top-right",
                        "toastClass": "black",
                        "onclick": null,
                        "showDuration": "300",
                        "hideDuration": "1000",
                        "timeOut": "5000",
                        "extendedTimeOut": "1000",
                        "showEasing": "swing",
                        "hideEasing": "linear",
                        "showMethod": "fadeIn",
                        "hideMethod": "fadeOut"
                    };


                }, 3000);


            });

        </script>

        <hr />


        <script type="text/javascript">
            // Code used to add Todo Tasks
            jQuery(document).ready(function($)
            {
                var $todo_tasks = $("#todo_tasks");

                $todo_tasks.find('input[type="text"]').on('keydown', function(ev)
                {
                    if(ev.keyCode == 13)
                    {
                        ev.preventDefault();

                        if($.trim($(this).val()).length)
                        {
                            var $todo_entry = $('<li><div class="checkbox checkbox-replace color-white"><input type="checkbox" /><label>'+$(this).val()+'</label></div></li>');
                            $(this).val('');

                            $todo_entry.appendTo($todo_tasks.find('.todo-list'));
                            $todo_entry.hide().slideDown('fast');
                            replaceCheckboxes();
                        }
                    }
                });
            });
        </script>


        <ol class="breadcrumb bc-3" >
            <li>
                <a><i class="fa-home"></i>主页</a>
            </li>

            <li>
                <a>项目大厅</a>
            </li>

            <li>
                <a>所有项目</a>
            </li>

            <li>
                <a>项目文档</a>
            </li>


        </ol>

        <!-- Mail Body -->
        <div class="mail-body">

            <div class="mail-header">
                <!-- title -->
                <h3 class="mail-title">
                    文档列表
                    <span class="count"></span>
                </h3>

            </div>


            <!-- mail table -->
            <table class="table mail-table">

        <!-- email list -->
        <tbody>

        <tr class="unread"><!-- new email class: unread -->

            <td class="col-name">
                <a href="#" class="star stared">
                    <i class="entypo-doc-text"></i>
                </a>
                文档名
            </td>

            <td class="col-options">
                <i class="entypo-search">
                </i>

                查看

            </td>

            <td class="col-options">
                <i class="entypo-star">
                </i>

                发布人

            </td>


            <td class="col-time">

                <i class="entypo-back-in-time">

                </i>

                文档发布时间
            </td>


        </tr>


        <s:iterator value="prjDocList" status="st">

        <tr class="unread"><!-- new email class: unread -->

            <td class="col-name">

                <s:property value="name"></s:property>
            </td>

            <td class="col-options">
                <i class="entypo-search">
                </i>

                <a href="${pageContext.request.contextPath}/front_prj_hall_prjDoc_doc_detail.action?prjDoc.id=<s:property value="id"></s:property>">
                    点击查看
                </a>

            </td>

            <td class="col-options">
                <i class="entypo-star">
                </i>

                <s:property value="create_person"></s:property>

            </td>


            <td class="col-time">

                <i class="entypo-back-in-time">

                </i>
                <s:property value="createTime"></s:property>
            </td>

        </tr>

        </s:iterator>

        </tbody>


        </table>
    </div>



    <br>
    <br>

    <div class="col-sm-offset-5 col-sm-5">

        <button onclick="javascript:history.go(-1)" class="btn btn-default">返回项目列表</button>
        <br>

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



</div>





<!-- Imported styles on this page -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/js/jvectormap/jquery-jvectormap-1.2.2.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/js/rickshaw/rickshaw.min.css">

<!-- Bottom scripts (common) -->
<script src="${pageContext.request.contextPath}/assets/js/gsap/main-gsap.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery-ui/js/jquery-ui-1.10.3.minimal.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/joinable.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/resizeable.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/neon-api.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>


<!-- Imported scripts on this page -->
<script src="${pageContext.request.contextPath}/assets/js/jvectormap/jquery-jvectormap-europe-merc-en.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.sparkline.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/rickshaw/vendor/d3.v3.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/rickshaw/rickshaw.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/raphael-min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/morris.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/toastr.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/neon-chat.js"></script>


<!-- JavaScripts initializations and stuff -->
<script src="${pageContext.request.contextPath}/assets/js/neon-custom.js"></script>


<!-- Demo Settings -->
<script src="${pageContext.request.contextPath}/assets/js/neon-demo.js"></script>

</body>
</html>