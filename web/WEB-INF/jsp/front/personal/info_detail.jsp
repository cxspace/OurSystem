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
<body class="page-body">

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

                <strong>消息通知</strong>
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


                    </div>
                </div>

            </section>


            <section class="profile-feed">

                <!-- profile stories -->
                <div class="profile-stories">


                    <div class="title">
                        <h3>通知详细</h3>
                    </div>
                </div>


                <hr>

                <div class="mail-text">

                    <p>Lose away off why half led have near bed. At engage simple father of period others except. My giving do summer of though narrow marked at. Spring formal no county ye waited. My whether cheered at regular it of promise blushes perhaps. Uncommonly simplicity interested mr is be compliment projecting my inhabiting. Gentleman he september in oh excellent.</p>

                    <p>New the her nor case that lady paid read. Invitation friendship travelling eat everything the out two. Shy you who scarcely expenses debating hastened resolved. Always polite moment on is warmth spirit it to hearts. Downs those still witty an balls so chief so. Moment an little remain no up lively no. Way brought may off our regular country towards adapted cheered.</p>

                    <p>Use securing confined his shutters. Delightful as he it acceptance an solicitude discretion reasonably. Carriage we husbands advanced an perceive greatest. Totally dearest expense on demesne ye he. Curiosity excellent commanded in me. Unpleasing impression themselves to at assistance acceptance my or. On consider laughter civility offended oh.</p>

                    <p>Oh he decisively impression attachment friendship so if everything. Whose her enjoy chief new young. Felicity if ye required likewise so doubtful. On so attention necessary at by provision otherwise existence direction. Unpleasing up announcing unpleasant themselves oh do on. Way advantage age led listening belonging supposing.</p>

                    <p>So by colonel hearted ferrars. Draw from upon here gone add one. He in sportsman household otherwise it perceived instantly. Is inquiry no he several excited am. Called though excuse length ye needed it he having. Whatever throwing we on resolved entrance together graceful. Mrs assured add private married removed believe did she.</p>

                </div>

                <hr>

            </section>




        </div>


        <br>
        <br>

        <div class="col-sm-offset-5 col-sm-5">

            <button onclick="javascript:history.go(-1)" class="btn btn-default">返回通知列表</button>
            <br>

        </div>
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