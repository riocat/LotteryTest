<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2017/6/1
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <div>
        <form action="test/uploadtest" method="post" enctype="multipart/form-data">
            <input type="file" name="file">
            <input type="submit">
        </form>
    </div>
    <div>
        <a href="test/downloadtest">Download</a>
    </div>

</body>
</html>
