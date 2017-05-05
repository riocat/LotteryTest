<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2017/4/1
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Responsive Bootstrap Advance Admin Template</title>

    <!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!--CUSTOM BASIC STYLES-->
    <link href="assets/css/basic.css" rel="stylesheet" />
    <!--CUSTOM MAIN STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>

<div id="wrapper">
    <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0px;">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html">COMPANY NAME</a>
        </div>

        <div class="header-right">

            <a href="message-task.html" class="btn btn-info" title="New Message"><b>30 </b><i class="fa fa-envelope-o fa-2x"></i></a>
            <a href="message-task.html" class="btn btn-primary" title="New Task"><b>40 </b><i class="fa fa-bars fa-2x"></i></a>
            <a href="login.html" class="btn btn-danger" title="Logout"><i class="fa fa-exclamation-circle fa-2x"></i></a>

        </div>
    </nav>
    <!-- /. NAV TOP  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">
                <li>
                    <div class="user-img-div">
                        <img src="assets/img/user.png" class="img-thumbnail" />

                        <div class="inner-text">
                            ${user.name}
                            <br />
                            <small>Last Login : 2 Weeks Ago </small>
                        </div>
                    </div>

                </li>

                <li>
                    <a  href="index.html">Dashboard</a>
                </li>

                <c:if test="${menuList != null}">
                    <c:forEach items="${menuList}" var="menu1">
                        <c:choose>
                            <c:when test="${menu1.subList == null}">
                                <li>
                                    <a class="active-menu" href="${menu1.url}" onclick="activeMenu()">${menu1.name}个人信息</a>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li>
                                    <a href="#">${menu1.name} <span class="fa arrow"></span></a>
                                    <ul class="nav nav-second-level">
                                        <c:forEach items="${menu1.subList}" var="menu2">
                                            <c:choose>
                                                <c:when test="${menu2.subList == null}">
                                                    <li>
                                                        <a href="${menu2.url}" onclick="activeMenu()">${menu2.name}</a>
                                                    </li>
                                                </c:when>
                                                <c:otherwise>
                                                    <li>
                                                        <a href="#">${menu2.name} <span class="fa arrow"></span></a>
                                                        <ul class="nav nav-third-level">
                                                            <c:forEach items="${menu2.subList}" var="menu3">
                                                                <c:choose>
                                                                    <c:when test="${menu3.subList == null}">
                                                                        <li>
                                                                            <a href="${menu3.url}" onclick="activeMenu()">${menu3.name}</a>
                                                                        </li>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        <li>
                                                                            <a href="#">${menu3.name} <span class="fa arrow"></span></a>
                                                                            <ul class="nav nav-fouth-level">
                                                                                <li>
                                                                                    <a href="${menu4.url}" onclick="activeMenu()">${menu4.name}</a>
                                                                                </li>
                                                                            </ul>
                                                                        </li>
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </c:forEach>
                                                        </ul>
                                                    </li>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:forEach>
                                    </ul>
                                </li>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <li>
                        <a class="active-menu" href="#" onclick="activeMenu()">个人信息</a>
                    </li>
                    <li>
                        <a href="#">UI Elements <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Tabs & Panels</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">Multilevel Link <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Second Level Link</a>
                            </li>
                            <li>
                                <a href="#">Second Level Link<span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="#">Third Level Link</a>
                                    </li>
                                </ul>

                            </li>
                        </ul>
                    </li>
                </c:if>
            </ul>
        </div>

    </nav>
    <!-- /. NAV SIDE  -->
    <div id="page-wrapper">
        <div id="page-inner" >
            <iframe style="min-height: 700px;" width="100%" height="100%" src="login.jsp" scrolling="true" frameborder="0">
            </iframe>
        </div>

    <!-- /. PAGE INNER  -->
</div>
<!-- /. PAGE WRAPPER  -->
</div>

<!-- /. FOOTER  -->
<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
<!-- JQUERY SCRIPTS -->
<script src="assets/js/jquery-1.10.2.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="assets/js/bootstrap.js"></script>
<!-- METISMENU SCRIPTS -->
<script src="assets/js/jquery.metisMenu.js"></script>
<!-- CUSTOM SCRIPTS -->
<script src="assets/js/custom.js"></script>



</body>
</html>
