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

        1.写基本页面跳转配置

        2.抽取baseDao

        3.改写html页面

        4.写用户的映射配置文件

              命名规定

                   user_name  统一用下划线方式命名实体类中变量

                   数据库表名加t    t_user

        5.写dao service

              注意:  interface类继承泛型接口

                     dao,service实现类,要继承自己的接口,又要继承泛型接口

        6.写头像文件上传逻辑


        7.el判断字段相等

            <s:property value="role == 1?'管理员':'一般用户'"/>

        8.手动处理单选框回显

            数据库字段用int类型

            <s:if test="%{user.gender == 1}">
                回显1对应的选择
            <s:if>
            <s:else>
                回显其他选择
            <s:else>

# 六、写通知公告模块




