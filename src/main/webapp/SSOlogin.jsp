<%--
  Created by IntelliJ IDEA.
  User: rio
  Date: 2018/9/13
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<title>Title</title>

	<style>
		.formC {

		}
	</style>
</head>
<body>
<fieldset>
	<legend>login:</legend>
	<form action="/SSO/SSOLogin" method="post" class="formC">
	<span>
		name：<input type="text" name="username" >
	</span>
	<span>
		password：<input type="text" name="password">
	</span>
	<span>
		<input type="submit">
	</span>
	</form>
</fieldset>

</body>
</html>