<%--
  Created by IntelliJ IDEA.
  User: 10251
  Date: 2021/6/9
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>图书管理系统</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <script src="../js/JQuery.js"></script>
    <style>
        #login{
            width: 443px;
        }
        .form-control{
            width: 443px;
        }
        .btn-success{
            width: 150px;
        }
        .btn-warning{
            width: 150px;
        }
        .form-group{
            margin: 5px;
            padding: 10px;
            padding-left: 375px;
        }
        .form-horizontal{
            padding-top: 180px;
        }

    </style>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <a href="#" class="navbar-brand">自由而无用</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}">首页</a></li>
                <li class="active"><a href="#">图书管理系统</a></li>
                <li><a href="${pageContext.request.contextPath}/book/user_manage">用户管理系统</a></li>
                <li><a href="${pageContext.request.contextPath}/book/user_login">图书预约系统</a></li>
                <li><a href="${pageContext.request.contextPath}/book/course_manage">课程管理系统</a></li>
                <li><a href="${pageContext.request.contextPath}/book/about">关于我</a></li>
            </ul>
        </div>
    </div>
</nav>

<form action="${pageContext.request.contextPath}/book/book_manage_2" method="post" class="form-horizontal " role="form">
    <div class="form-group">
        <label class="col-sm-2 control-label">账号：</label>
        <div class="col-sm-10">
            <input id="zh" type="text" class="form-control" placeholder="账号" name="admin_id">
        </div>
    </div>
    <div class="form-group">
        <label id="pwd" class="col-sm-2 control-label">密码：</label>
        <div class="col-sm-10">
            <input id="pwd_real" type="password" class="form-control" placeholder="密码" name="password">
        </div>
    </div>
    <div class="form-group">
    </div>
    <div class="form-group">
        <div  class="col-sm-offset-2 col-sm-5">
            <button id="login" type="submit" class="btn btn-success"> 登录 </button>
        </div>
    </div>
</form>
<script type="text/javascript">
    $("#login").click(function checkpwdAndzh(){
        var name = $("#zh").val();
        var pass = $("#pwd_real").val();
        if (name == "") {
            alert("用户名不能为空");
            return false;
        } else if (pass == "") {
            alert("密码不能为空");
            return false;
        } else{
            return true;
        }
    });

</script>
</body>
</html>