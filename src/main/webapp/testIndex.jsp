<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2017/4/7
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <%@include file="/com/script.jsp"%>
    <%@include file="/com/style.jsp"%>
    <style>
        .centerdiv{
            position: absolute;
            width: 50%;
            height: 40%;
            margin-top: 12%;
            margin-bottom: 12%;
            margin-left: 25%;
            border-color: #1ab7ea;
            border-radius: 5px;
            border-width: thin;
            border-style: solid;
            overflow-y: auto;
        }

        .framediv{
            position: absolute;
            width: 60%;
            height: 60%;
            margin-top: 10%;
            /*margin-bottom: 10%;*/
            margin-left: 20%;
            align-content: center;
        }

        .contentdiv{
            border-color: #dff0d8;
            border-radius: 5px;
            border-width: thin;
            border-style: solid;
            margin-top: 5px;
            width: 100%;
        }

        .tablediv{
            display: table;
            min-width: 100%;
        }

        a{
            display: table-cell;
            /*align-content: center; 错误*/
            text-align: center;
            /*width: 300px;*/
        }
    </style>
</head>
<body style="width: 100%;height:100%;">

<div class="centerdiv">
    <div class="framediv">
        <div class="contentdiv">
            <div class="tablediv">
                <a href="test">addRole</a>
            </div>
        </div>
        <div class="contentdiv">
            <div class="tablediv">
                <a>addPermission</a>
            </div>
        </div>
        <div class="contentdiv">
            <div class="tablediv">
                <a>addUser</a>
            </div>
        </div>
        <div class="contentdiv">
            <div class="tablediv">
                <a href="login.jsp">login.jsp</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>
