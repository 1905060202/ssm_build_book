<%--
  Created by IntelliJ IDEA.
  User: 10251
  Date: 2021/6/10
  Time: 9:44
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

  <title>Dashboard Template for Bootstrap</title>

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
      <a class="navbar-brand" href="#">图书管理系统</a>
    </div>
  </div>
</nav>

<div class="container-fluid">
  <div class="row">
    <div class="col-sm-3 col-md-2 sidebar">
      <ul class="nav nav-sidebar">
        <li class="active"><a href="#">图书总览 <span class="sr-only">(current)</span></a></li>
        <li><a href="#">借书列表</a></li>
        <li><a href="#">管理图书</a></li>
        <li><a href="about_book_me.jsp">关于我</a></li>
      </ul>

    </div>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
      <h1 class="page-header">部分图书展览</h1>

      <div class="row placeholders">
        <div class="col-xs-6 col-sm-3 placeholder">
          <img src="../images/rljs.jpg" width="200" height="150" class="img-responsive" alt="Generic placeholder thumbnail">
          <h4>《人类简史》</h4>
          <span class="text-muted">一次波澜壮阔的征途</span>
        </div>
      </div>

      <h2 class="sub-header">图书总览</h2>
      <div class="table-responsive">
        <table class="table table-striped">
          <thead>
          <tr>
            <th>#</th>
            <th>书名</th>
            <th>作者</th>
            <th>出版社</th>
            <th>ISBN</th>
            <th>介绍</th>
            <th>语言</th>
            <th>价格</th>
            <th>数量</th>
            <th>类别</th>
          </tr>
          </thead>
          <tbody>
          <tr>
            <td>1,001</td>
            <td>《大雪中的山庄》</td>
            <td>东野圭吾 </td>
            <td>北京十月文艺出版社</td>
            <td>9787530216835</td>
            <td>东野圭吾长篇小说杰作，中文简体首次出版。 一出没有剧本的舞台剧，为什么能让七个演员赌上全部人生.东野圭吾就是有这样过人的本领，能从充满悬念的案子写出荡气回肠的情感，在极其周密曲折的同时写出人性的黑暗与美丽。 一家与外界隔绝的民宿里，七个演员被要求住满四天，接受导演的考验，但不断有人失踪。难道这并非正常排练，而是有人布下陷阱要杀他们。 那时候我开始喜欢上戏剧和音乐，《大雪中的山庄》一书的灵感就来源于此。我相信这次的诡计肯定会让人大吃一惊。——东野圭吾</td>
            <td>中文</td>
            <td>35.00</td>
            <td>5</td>、
            <td>9</td>
          </tr>
          <tr>
            <td>1,002</td>
            <td>《人类简史》</td>
            <td>[以色列] 尤瓦尔·赫拉利 </td>
            <td>中信出版社</td>
            <td>9787508647357</td>
            <td>十万年前，地球上至少有六种不同的人
              但今日，世界舞台为什么只剩下了我们自己？
              从只能啃食虎狼吃剩的残骨的猿人，到跃居食物链顶端的智人，
              从雪维洞穴壁上的原始人手印，到阿姆斯壮踩上月球的脚印，
              从认知革命、农业革命，到科学革命、生物科技革命，
              我们如何登上世界舞台成为万物之灵的？
              从公元前1776年的《汉摩拉比法典》，到1776年的美国独立宣言，
              从帝国主义、资本主义，到自由主义、消费主义，
              从兽欲，到物欲，从兽性、人性，到神性，
              我们了解自己吗？我们过得更快乐吗？
              我们究竟希望自己得到什么、变成什么？</td>
            <td>英文</td>
            <td>68.00</td>
            <td>100</td>
            <td>9</td>

          </tr>

          </tbody>
        </table>
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
