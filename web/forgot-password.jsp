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

	<title>OUR_SYS_forgot_password</title>

	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/js/jquery-ui/css/no-theme/jquery-ui-1.10.3.custom.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font-icons/entypo/css/entypo.css">

	<!--<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Noto+Sans:400,700,400italic">-->
	<!---->

	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/neon-core.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/neon-theme.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/neon-forms.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/custom.css">

	<script src="${pageContext.request.contextPath}/assets/js/jquery-1.11.0.min.js"></script>
	<script>$.noConflict();</script>

	<!--[if lt IE 9]>
	<script src="${pageContext.request.contextPath}/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->


</head>
<body class="page-body login-page login-form-fall" data-url="http://neon.dev">


<!-- This is needed when you send requests via Ajax -->
<script type="text/javascript">
var baseurl = '';
</script>

<div class="login-container">

	<div class="login-header login-caret">

		<div class="login-content">

			<a href="index.html" class="logo">
				<img src="${pageContext.request.contextPath}/assets/images/logo/LOGO.png" width="120" alt="" />
			</a>

			<p class="description">输入你的邮箱号,系统将发送一串验证码接到你的邮箱</p>

			<!-- progress bar indicator -->
			<div class="login-progressbar-indicator">
				<h3>43%</h3>
				<span>logging in...</span>
			</div>
		</div>

	</div>

	<div class="login-progressbar">
		<div></div>
	</div>

	<div class="login-form">

		<div class="login-content">

			<form method="post" role="form" action="">


				<div class="form-steps">

					<div class="step current" id="step-1">

						<div class="form-group">
							<div class="input-group">
								<div class="input-group-addon">
									<i class="entypo-mail"></i>
								</div>

								<input type="text" class="form-control" value="<s:property value="user.email"/>" name="email" id="email" placeholder="请输入你的邮箱号"/>

								</div>
						</div>

						<div class="form-group">

							<button onclick="doSendCode()" class="btn btn-info btn-block btn-login">
								第一步-发送验证码
								<i class="entypo-right-open-mini"></i>
							</button>

						</div>

						<p>
							<font color="red">
								<s:property value="Msg"></s:property>
							</font>

						</p>

						<div class="form-group">

							<div class="input-group">
								<div class="input-group-addon">
									<i class="entypo-key"></i>
								</div>
								<input type="text" class="form-control" name="code" id="verify_password" placeholder="输入收到验证码"/>
							</div>
							<br>


							<a onclick="toEmailLogin()" class="btn btn-info btn-block">

								<font color="black">
								第二步-登录邮箱查看
								</font>
								<i class="entypo-right-open-mini"></i>
							</a>

							<br>

							<button onclick="doVerifyCode()" class="btn btn-info btn-block btn-login">
								第三步-重置密码
								<i class="entypo-right-open-mini"></i>
							</button>

						</div>

					</div>

				</div>

			</form>

			<script type=text/javascript>
				function toEmailLogin() {

					var uurl = document.getElementById("email").value;

					if (uurl==""){
						alert("请输入邮箱号");
					}else {
						uurl = gotoEmail(uurl);
						if (uurl != "") {
							if (uurl=="other"){
								alert("没有找到相应的邮箱地址哦。。。,请您自行登录");
							}else {
								window.open("http://" + uurl, "_blank", "toolbar=yes, location=yes, directories=no, status=no, menubar=yes, scrollbars=yes, resizable=no, copyhistory=yes, width=800, height=600");
							}
						}
					}
				}
				//功能：根据用户输入的Email跳转到相应的电子邮箱首页
				function gotoEmail(mail) {
					var t = mail.split('@')[1];
					t = t.toLowerCase();
					if (t == '163.com') {
						return 'mail.163.com';
					} else if (t == 'vip.163.com') {
						return 'vip.163.com';
					} else if (t == '126.com') {
						return 'mail.126.com';
					} else if (t == 'qq.com' || $t == 'vip.qq.com' || $t == 'foxmail.com') {
						return 'mail.qq.com';
					} else if (t == 'gmail.com') {
						return 'mail.google.com';
					} else if (t == 'sohu.com') {
						return 'mail.sohu.com';
					} else if (t == 'tom.com') {
						return 'mail.tom.com';
					} else if (t == 'vip.sina.com') {
						return 'vip.sina.com';
					} else if (t == 'sina.com.cn' || $t == 'sina.com') {
						return 'mail.sina.com.cn';
					} else if (t == 'tom.com') {
						return 'mail.tom.com';
					} else if (t == 'yahoo.com.cn' || $t == 'yahoo.cn') {
						return 'mail.cn.yahoo.com';
					} else if (t == 'tom.com') {
						return 'mail.tom.com';
					} else if (t == 'yeah.net') {
						return 'www.yeah.net';
					} else if (t == '21cn.com') {
						return 'mail.21cn.com';
					} else if (t == 'hotmail.com') {
						return 'www.hotmail.com';
					} else if (t == 'sogou.com') {
						return 'mail.sogou.com';
					} else if (t == '188.com') {
						return 'www.188.com';
					} else if (t == '139.com') {
						return 'mail.10086.cn';
					} else if (t == '189.cn') {
						return 'webmail15.189.cn/webmail';
					} else if (t == 'wo.com.cn') {
						return 'mail.wo.com.cn/smsmail';
					} else if (t == '139.com') {
						return 'mail.10086.cn';
					} else {

					}
				};

				//到发送验证码后台
				function doSendCode() {

					document.forms[0].action="${pageContext.request.contextPath}/front_user_login_send_code.action";
					document.forms[0].submit();

				}
				//到发送验证码后台
				function doVerifyCode() {

					document.forms[0].action="${pageContext.request.contextPath}/front_user_login_verify_code.action";
					document.forms[0].submit();

				}

			</script>

			<div class="login-bottom-links">

				<a href="${pageContext.request.contextPath}/front_user_login_change_password" class="link">
					<i class="entypo-lock"></i>
					返回登录页面
				</a>

				<br />

				<a href="#"></a>  <a href="#">Power By - cxspace</a>

			</div>

		</div>

	</div>

</div>


	<!-- Bottom scripts (common) -->
	<script src="${pageContext.request.contextPath}/assets/js/gsap/main-gsap.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/jquery-ui/js/jquery-ui-1.10.3.minimal.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/bootstrap.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/joinable.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/resizeable.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/neon-api.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/jquery.validate.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/neon-forgotpassword.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/jquery.inputmask.bundle.min.js"></script>


	<!-- JavaScripts initializations and stuff -->
	<script src="${pageContext.request.contextPath}/assets/js/neon-custom.js"></script>


	<!-- Demo Settings -->
	<script src="${pageContext.request.contextPath}/assets/js/neon-demo.js"></script>

</body>
</html>