<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.9/favicon.ico">
    <link rel="canonical" href="https://getbootstrap.com/docs/3.4/examples/dashboard/">
    <style>
        #login{
            width: 300px;
        }
    </style>
    <title>课程管理系统</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.9/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.9/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.9/examples/dashboard/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.9/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.9/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">课程管理系统</a>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li><a href="${pageContext.request.contextPath}/book/admin_overview_course">总览 <span class="sr-only">(current)</span></a></li>
                <li ><a href="${pageContext.request.contextPath}/book/add_course" >上新课程</a></li>
                <li class="active"><a href="#">更新课程</a></li>
<%--                因为就在本页面，所以无需跳转--%>
                <li><a href="${pageContext.request.contextPath}/book/delete_book">下架课程</a></li>
                <li><a href="${pageContext.request.contextPath}">退出系统</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">更新课程</h1>

            <div class="row placeholders">
                <div class="col-xs-6 col-sm-3 placeholder">
                    <form action="${pageContext.request.contextPath}/book/real_update_course" method="post" class="form-horizontal " role="form" modelAttribute="list"  enctype="multipart/form-data">
                        <div class="form-group">
                            <label class="col-sm-4 control-label">id:</label>
                            <div class="col-sm-8">
                                <input id="book_id" type="text" class="form-control" placeholder="id" name="id">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">课程名:</label>
                            <div class="col-sm-8">
                                <input id="zh" type="text" class="form-control" placeholder="课程名" name="name">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">课时:</label>
                            <div class="col-sm-8">
                                <input id="pwd_real" type="text" class="form-control" placeholder="课时" name="hours">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">所属学院:</label>
                            <div class="col-sm-8">
                                <input id="pb" type="text" class="form-control" placeholder="所属学院" name="schools">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-4 control-label">图片pic:</label>
                            <div class="col-sm-8">
                                <input id="pic" type="file" class="form-control-file"  name="course_pic">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-8">
                                <button id="login" type="submit" class="btn btn-success" >更新</button>
                            </div>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.9/assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.9/dist/js/bootstrap.min.js"></script>
<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.9/assets/js/vendor/holder.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.9/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
