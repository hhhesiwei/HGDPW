<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>APP开发者登陆</title>
<!-- Bootstrap -->
   <link href="${pageContext.request.contextPath }/statics/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath }/statics/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath }/statics/css/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="https://colorlib.com/polygon/gentelella/css/animate.min.css" rel="stylesheet">
    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath }/statics/css/custom.min.css" rel="stylesheet">
  </head>

</head>
  <body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form action="${pageContext.request.contextPath }/devLogin" method="post">
              <h1>萌新APP开发者平台登陆</h1>
              <p style="color: red;font-size: 15px;">${errMsg}</p>
              <div>
                <input type="text" class="form-control" name="devCode" placeholder="请输入用户账号" required="required" />
              </div>
              <div>
                <input type="password" class="form-control"name="devPassword" placeholder="请输入用户密码" required="required" />
              </div>
              <div>
                <input class="btn btn-default submit" type="submit" value="log in"/>
                <a class="reset_pass" href="#">忘记密码?点击找回</a>
              </div>
              <div class="clearfix"></div>
              <div class="separator">
                <p class="change_link">新用户?点击这里
                  <a href="#signup" class="to_register"> 创建账号 </a>
                </p>

                <div class="clearfix"></div>
                <br />

                <div>
                  <h1><i class="fa fa-paw"></i> Gentelella Alela!</h1>
                  <p>©2016 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
                </div>
              </div>
            </form>
          </section>
        </div>
      </div>
    </div>
  </body>
</html>