<%--
  Created by IntelliJ IDEA.
  User: 10251
  Date: 2021/6/11
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>邂逅海棠</title>
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>自由而无用</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <style>
        body{
            padding-top: 50px;
        }
        .start{
            padding:40px 15px;
            text-align: center;
        }
        .xh{
            padding-left: 415px;
            margin-top: 80px;
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
                <li class="active"><a href="#">首页</a></li>
                <li><a href="${pageContext.request.contextPath}/book/book_manage_2">图书管理系统</a></li>
                <li><a href="${pageContext.request.contextPath}/book/user_manage">用户管理系统</a></li>
                <li><a href="${pageContext.request.contextPath}/book/user_login">图书预约系统</a></li>
                <li><a href="${pageContext.request.contextPath}/book/course_manage">课程管理系统</a></li>
                <li><a href="${pageContext.request.contextPath}/book/about">关于我</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class=" container xh">
    <img src="images/计算机学院院徽.png" alt="..." class="img-circle">
</div>
<div class="container ">
    <div class="start">
        <h1 id="note1" class="text-primary">唯实惟新 至诚致志</h1>
        <p class="lead">欢迎来到自由而无用</p>
    </div>
</div>
</body>
</html>