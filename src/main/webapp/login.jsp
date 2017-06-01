<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html ng-app="login">
<head>
<%-- <base href="<%=request.getContextPath()%>/"> --%>
<title>login</title>
<meta charset="utf-8">
<%@include file="/com/script.jsp"%>
<%@include file="/com/style.jsp"%>
<link rel="styleSheet" href="css/login.css">
<link rel="styleSheet" href="css/header.css">
<script src="js/myjs/login.js"></script>
</head>
<body ng-controller="loginController">
	<header>
		<div id="tagWapper">
			<span class="login">Login</span>
			<div class="userButtons">
<!-- 				<div class="userButton" data-toggle="modal" data-target="#dataDialog" data-toggle="modal" data-target="#dataDialog" ng-click="type = 'login'"> -->
<!-- 					<span>登录</span> -->
<!-- 				</div> -->
<!-- 				<div class="userButton" data-toggle="modal" data-target="#dataDialog" data-toggle="modal" data-target="#dataDialog" ng-click="type = 'regester'"> -->
<!-- 					<span>注册</span> -->
<!-- 				</div> -->
				
				<div class="userButton" data-toggle="modal"
					data-target="#dataDialog" data-toggle="modal" data-target="#dataDialog" ng-click="showLogin()">
					<span>登录</span>
				</div>
				<div class="userButton" data-toggle="modal"
					data-target="#dataDialog" data-toggle="modal" data-target="#dataDialog" ng-click="showRegester()">
					<span>注册</span>
				</div>
			</div>
		</div>
	</header>
	<div id="content">
		<div id="choosepanel">
			<table id="contable">
				<tr>
					<td><span><label ng-click="toshowLotterys()"><strong>最新彩票</strong></label></span></td>
				</tr>
				<tr>
					<td><span><label><strong><a href="FtpTest.jsp">赤座灯里</a></strong></label></span></td>
				</tr>
				<tr>
					<td><span><label><strong><a href="test">test</a></strong></label></span></td>
				</tr>
				<tr>
					<td><span><label><strong>三上姐我老婆</strong></label></span></td>
				</tr>
			</table>
		</div>
	</div>
	<div class="modal fade" id="dataDialog" role="dialog"
		aria-hidden="true" airia-labelledby="dataDailog" data-backdrop='static'>
		<div class="modal-dialog">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title" id="dataDailog">
					{{type=='login'?'登录':'注册'}}</h4>
			</div>
			<div class="modal-body">
			<div id="successAlert" class="alert alert-success" ng-show="successMessage">
<!-- 			   <a href="#" class="close" data-dismiss="alert">&times;</a> -->
			   <strong>成功！</strong>{{successMessage}}。
			</div>
			<div id="failAlert" class="alert alert-warning" ng-show="errorMessage">
<!-- 			   <a href="#" class="close" data-dismiss="alert">&times;</a> -->
			   <strong>警告！</strong>{{errorMessage}}。
			</div>
				<form class="form-horizontal" role="form">
					<div class="form-group">
						<label for="userName" class="col-sm-2 control-label">
							用户名
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="userName" ng-model="user.name" placeholder="用户名">
						</div>
					</div>
					<div class="form-group">
						<label for="password" class="col-sm-2 control-label">
							密码
						</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="password" ng-model="user.password" placeholder="密码">
						</div>
					</div>
					<div class="form-group" ng-show="type=='regester'">
						<label for="password" class="col-sm-2 control-label">
							确认密码
						</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="repassword" ng-model="rePassword" placeholder="确认密码">
						</div>
					</div>
					<div class="form-group" ng-show="type=='regester'">
						<label for="email" class="col-sm-2 control-label">
							邮箱
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="email" ng-model="user.email" placeholder="邮箱">
						</div>
					</div>
					<div class="form-group" ng-show="type=='regester'">
						<label for="checkcode" class="col-sm-2 control-label">
							验证码
						</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="checkcode" ng-model="user.checkKey" placeholder="验证码">
						</div>
						<div class="col-sm-3">
							<img alt="验证码" src="rescource/checkImg" id="checkImage">
						</div>
						<div class="col-sm-3" ng-click='refreshCheckCode()'>
							<h4><label class="label label-default" >刷新</label></h4>
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default"
					ng-show="type=='login'" ng-click="login()">登录</button>
				<button type="button" class="btn btn-default"
					ng-show="type=='regester'" ng-click="regester()">提交</button>
				<button type="reset" class="btn btn-default" >重置</button>
			</div>
		</div>
	</div>
</body>
</html>
