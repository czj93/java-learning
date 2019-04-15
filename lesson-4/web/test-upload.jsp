<%--
  Created by IntelliJ IDEA.
  User: caozhijian
  Date: 2019/4/15
  Time: 下午2:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <form method="post" enctype="multipart/form-data" action="./upload">
            <label>用户名：<input type="text" name="username" /></label><br />
            <label>文&nbsp;&nbsp;件：<input type="file" name="file01" /></label><br />
            <input type="submit" />
        </form>
    </div>
</body>
</html>
