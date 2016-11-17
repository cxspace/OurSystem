<%@ page import="com.cx.core.constant.Constant" %><%--
  Created by IntelliJ IDEA.
  User: cxspace
  Date: 16-11-10
  Time: 上午8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //解决初次启动没有被拦截问题
    if (request.getSession().getAttribute(Constant.USER)==null){
        response.sendRedirect(request.getContextPath()+"/user_loginUI.action");
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <title>OUR_SYS | 主页</title>

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
                    <a href="${pageContext.request.contextPath}/index.html">
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
                            <a href="${pageContext.request.contextPath}/front/learn_hall/route_list.html">
                                <span class="title">学习路线</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/front/learn_hall/site_list.html">
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
                            <a href="${pageContext.request.contextPath}/front/share_hall/link_list.html">
                                <span class="title">资料链接分享</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/front/share_hall/experience_list.html">
                                <span class="title">学习经验分享</span>
                            </a>
                        </li>

                    </ul>

                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/front/prj_hall/prj_list.html">
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
                            <a href="${pageContext.request.contextPath}/front/our_note/note_class.html">
                                <span class="title">查看笔记</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/front/our_note/note_add.html">
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
                            <a href="${pageContext.request.contextPath}/front/competition/competition_list.html">
                                <span class="title">相关竞赛介绍</span>
                            </a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/front/competition/cur_comp_list.html">
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

        <hr />


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



        <div class="jumbotron">
            <h1>What's OUR_SYS?</h1>

            <p>
                OUR_SYS是软件组集成化学习以及开发办公平台。
            </p>
            <br />

            <p>
                大家可以在这里参与选择软件组的开发任务，也可以在这个平台上分享和获取学习资源。
            </p>

            <p>
                希望通过这个平台，大家可以得到最大程度的个人能力的提升,让BAT不再是梦想。
            </p>

        </div>


        <ul class="version-highlights">

            <li>
                <div class="screenshot">
                    <a>
                        <img src="${pageContext.request.contextPath}/assets/images/jitang/ji_tang_2.jpg" style="height: 200px;width: 200px"/>
                    </a>
                </div>

                <div class="notes">
                    <h3>鸡汤第一碗</h3>
                    <p>
                        你不能修改人生的长度,但你可以修改人生的广度和宽度!
                    </p>
                </div>
            </li>


            <li>
                <div class="screenshot">
                    <a>
                        <img src="${pageContext.request.contextPath}/assets/images/jitang/ji_tang_1.jpg" style="height: 200px;width: 200px"/>
                    </a>
                </div>

                <div class="notes" >
                    <h3>鸡汤再来一碗</h3>
                    <p>
                        傻逼一样的坚持,会有牛逼一样的结果!
                    </p>
                </div>
            </li>


            <li>
                <div class="screenshot">
                    <a>
                        <img src="${pageContext.request.contextPath}/assets/images/jitang/ji_tang_3.jpeg" style="height: 200px;width: 200px"/>
                    </a>
                </div>

                <div class="notes">
                    <h3>干了这碗,还有三碗</h3>
                    <p>
                        你不需要向任何人证明你的努力,你的付出总有一天会给予你最大的回报!
                    </p>
                </div>
            </li>

        </ul>


        <hr>

        <div class="jumbotron">
            <h1>积分排行榜</h1>
        </div>

        <div class="row">



            <div class="col-sm-3 col-xs-6">

                <div class="tile-stats tile-aqua">
                    <div class="icon"><i class="entypo-mail"></i></div>
                    <div class="num" data-start="0" data-end="323" data-postfix="" data-duration="1500" data-delay="1200">0</div>

                    <h3>张三</h3>
                    <p>第1名</p>
                </div>


            </div>

            <div class="col-sm-3 col-xs-6">


                <div class="tile-stats tile-aqua">
                    <div class="icon"><i class="entypo-mail"></i></div>
                    <div class="num" data-start="0" data-end="223" data-postfix="" data-duration="1500" data-delay="1200">0</div>

                    <h3>李四</h3>
                    <p>第2名</p>
                </div>

            </div>

            <div class="col-sm-3 col-xs-6">

                <div class="tile-stats tile-aqua">
                    <div class="icon"><i class="entypo-mail"></i></div>
                    <div class="num" data-start="0" data-end="123" data-postfix="" data-duration="1500" data-delay="1200">0</div>

                    <h3>王五</h3>
                    <p>第3名</p>
                </div>

            </div>

            <div class="col-sm-3 col-xs-6">

                <div class="tile-stats tile-aqua">
                    <div class="icon"><i class="entypo-mail"></i></div>
                    <div class="num" data-start="0" data-end="23" data-postfix="" data-duration="1500" data-delay="1200">0</div>

                    <h3>老六</h3>
                    <p>第4名</p>
                </div>

            </div>


        </div>

        <hr>

        <div class="jumbotron">
            <h1>访问次数排行榜</h1>
        </div>

        <div class="col-sm-3 col-xs-6">

            <div class="tile-stats tile-green">
                <div class="icon"><i class="entypo-chart-bar"></i></div>
                <div class="num" data-start="0" data-end="135" data-postfix="" data-duration="1500" data-delay="600">0</div>

                <h3>张三</h3>
                <p>第1名</p>
            </div>

        </div>

        <div class="col-sm-3 col-xs-6">

            <div class="tile-stats tile-green">
                <div class="icon"><i class="entypo-chart-bar"></i></div>
                <div class="num" data-start="0" data-end="135" data-postfix="" data-duration="1500" data-delay="600">0</div>

                <h3>李四</h3>
                <p>第2名</p>
            </div>

        </div>

        <div class="col-sm-3 col-xs-6">

            <div class="tile-stats tile-green">
                <div class="icon"><i class="entypo-chart-bar"></i></div>
                <div class="num" data-start="0" data-end="135" data-postfix="" data-duration="1500" data-delay="600">0</div>

                <h3>王五</h3>
                <p>第3名</p>
            </div>

        </div>

        <div class="col-sm-3 col-xs-6">

            <div class="tile-stats tile-green">
                <div class="icon"><i class="entypo-chart-bar"></i></div>
                <div class="num" data-start="0" data-end="135" data-postfix="" data-duration="1500" data-delay="600">0</div>

                <h3>老六</h3>
                <p>第4名</p>
            </div>

        </div>

        <br />


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



        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
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
