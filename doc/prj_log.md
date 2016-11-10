## 开发日志 ##

# 一、创建数据库

        create  database our_sys;

        数据表由hibernate映射自动生成

# 二、导入SSH整合jar包

        1.hibernate相关jar包 hibernate3.jar

        2.JSTL-1.2 jsp标准标签的支持包

        3.junit4.4.jar 程序测试框架

        4.log4j-***.jar  日志包

        5.mail.jar       邮件发送支持包

        6.poi            文档导入导出操作包

        7.spring

            aop

            core

            jdbc

            orm

            other

            web

        8.struts2

        9.ueditor

           百度开源富文本编辑器支持jar包

# 三、idea配置

        1.把jar包加到web-inf classes

        2.配置tomcat访问路径

        3.设置将生成项目导入tomcat webapps

# 四、测试ssh整合

        1.编写测试的一套逻辑代码

        2.配置spring,struts

             在web.xml中配置启动加载

        3.测试spring

                  com.cx.test.TestMerge 里面 loadCtx() 测试spring容器

        4.测试hibernate框架

                  从容器中拿到sessionFactory

        5.测试service和dao层

                  从容器中拿testService,新存入一个对象

        6.测试service 的 readOnly和事务回滚

        7.测试日志输出

#  五、写用户管理模块

        写基本页面跳转配置

        抽取baseDao









