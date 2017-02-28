<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<div id="headerDiv" class=headerDiv">
    <div id="headTableCellDiv">
        <span id="logoSpan" class="logoSpan">
            Logo
        </span>
        <span class="userInfoSpan" id="userInfoSpan">
            <span id="imgLableSpan">
                <img src="/img/130641932834908062.jpg" id="headImg">
                <label id="nameLabel">name</label>
            </span>
            <span class="downItem">
                <ul id="userInfoMenu">
                    <li ng-click="changeUserInfo()">个人信息</li>
                    <li  ng-click="changeHeadImg()">修改头像</li>
                    <li  ng-click="loginOut()">安全退出</li>
                </ul>
            </span>
        </span>
    </div>
</div>
