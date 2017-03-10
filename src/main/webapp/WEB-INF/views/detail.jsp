<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/9
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="commons/tag.jsp" %>
<html>
<head>
    <title>用户详情</title>
    <%@include file="commons/head.jsp" %>
</head>
<body>
<div class="graphic-container">
    <div class="panel panel-default">
        <div class="panel-heading text-center">
            <h2>用户详情</h2>
        </div>
        <div class="panel-body">
            <form class="form-horizontal" method="POST" action="/user/edit" modelattribute="user">
                <input type="hidden" name="_method" value="PUT"/>
                <div class="form-group">
                    <label for="userId" class="col-md-2 control-label">用户编号: </label>
                    <div class="col-md-10">
                        <input type="text" id="userId" name="userId" class="form-control" value="${user.userId}" disabled>
                    </div>
                </div>
                <div class="form-group">
                    <label for="userName" class="col-md-2 control-label">用户名: </label>
                    <div class="col-md-10">
                        <input type="text" id="userName" name="userName" class="form-control" value="${user.userName}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-md-2 control-label">密码: </label>
                    <div class="col-md-10">
                        <input type="text" id="password" name="password" class="form-control" value="${user.password}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="createTime" class="col-md-2 control-label">创建时间: </label>
                    <div class="col-md-10">
                        <c:set var="createTime" scope="session">
                            <fmt:formatDate value="${user.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                        </c:set>
                        <input type="text" id="createTime" name="createTime" class="form-control" value="${createTime}" disabled>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-10 col-md-offset-2">
                        <button class="btn btn-default" type="submit">确认修改</button>
                        <a class="btn btn-default" onclick="window.history.back()">返回</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>
