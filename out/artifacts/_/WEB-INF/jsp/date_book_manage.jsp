<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 10251
  Date: 2021/6/10
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
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

    <title>图书预约系统</title>

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
            <a class="navbar-brand" href="#">图书预约系统</a>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="#">预约图书<span class="sr-only">(current)</span></a></li>
                <li><a href="#">归还图书</a></li>
                <li><a href="#">注销用户</a></li>
                <li><a href="${pageContext.request.contextPath}">退出系统</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">查询图书</h1>

            <div class="row placeholders">
                <div class="col-xs-3 placeholder">
                    <label class="col-xs-3 control-label">图书ID:</label>
                    <div class="col-xs-6 ">
                        <input id="book_id" type="text" class="form-control" placeholder="图书id" name="book_id">
                    </div>
                    <div  class="col-xs-2">
                        <button id="login" type="submit" class="btn btn-success"> 搜索 </button>
                    </div>
                </div>
            </div>

            <h2 class="sub-header">图书一览</h2>
            <form action="#" method="post" class="form-horizontal " role="form">
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>姓名</th>
                        <th>性别</th>
                        <th>生日</th>
                        <th>地址</th>
                        <th>电话号码</th>
                    </tr>
                    </thead>

                    <tbody>

                    </tbody>

                </table>
                <div  class="col-xs-2">
                    <button id="ok" type="submit" class="btn btn-success"> 预约</button>
                </div>
            </div>
            </form>
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
