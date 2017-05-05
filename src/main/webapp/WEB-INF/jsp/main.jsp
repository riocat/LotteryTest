<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html ng-app="main">
<head>
    <title>login</title>
    <meta charset="utf-8">
    <%@include file="/com/script.jsp" %>
    <%@include file="/com/style.jsp" %>
    <link rel="styleSheet" href="css/loginHeader.css">
    <link rel="stylesheet" href="css/main.css">
    <script src="js/myjs/main.js"></script>
</head>
<body ng-controller="mainController">
<header>
    <%@include file="loginHeader.jsp" %>
</header>
<div class="wapperDiv">
    <div id="leftMenuDiv" class="leftMenuDiv">
        <%--<div ng-repeat="">--%>
        <%--<span class="topMenu"></span>--%>
        <%--<ul>--%>
        <%--<li class="bottomMenu" ng-repeat="">--%>
        <%--Menu--%>
        <%--</li>--%>
        <%--</ul>--%>
        <%--</div>--%>
        left
    </div>
    <div id="contentDiv" class="contentDiv">
        <iframe height="100%" width="100%" src="login.jsp" scrolling="true" frameborder="0">
        </iframe>
    </div>
</div>
<footer>
    <div id="foot" class="foot">
        foot
    </div>
</footer>
</body>
</html>