<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html ng-app="app">
<head>
<%@include file="/com/script.jsp"%>
<%@include file="/com/style.jsp"%>
<title>lotterys</title>
<meta charset="utf-8">
<link rel="styleSheet" href="css/showLotterys.css">
<link rel="styleSheet" href="css/header.css">
<script src="js/myjs/showLotterys.js"></script>
</head>
<body ng-controller="lotteryController">
	<%@include file="/com/header.jsp"%>
	<div class="content">
		<div class="left">
			<ul>
				<li>1</li>
				<li>2</li>
				<li>3</li>
			</ul>
		</div>
		<div class="right">
			<table id="lotteryTable"
				class="table table-striped table-bordered table-hover table-condensed">
				<caption>lottery</caption>
				<thead>
					<tr>
						<th>ID</th>
						<th>期数</th>
						<th>一号</th>
						<th>二号</th>
						<th>三号</th>
						<th>四号</th>
						<th>五号</th>
						<th>六号</th>
						<th>七号</th>
						<th>结果</th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="lot in lotterys">
						<td>{{$index+1}}</td>
						<td>{{lot.no}}</td>
						<td>{{lot.ball1}}</td>
						<td>{{lot.ball2}}</td>
						<td>{{lot.ball3}}</td>
						<td>{{lot.ball4}}</td>
						<td>{{lot.ball5}}</td>
						<td>{{lot.ball6}}</td>
						<td>{{lot.ball7}}</td>
						<td>{{lot.resultString}}</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="bottom"></div>
	</div>
</body>
</html>