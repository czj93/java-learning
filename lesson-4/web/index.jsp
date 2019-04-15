<%--
  Created by IntelliJ IDEA.
  User: caozhijian
  Date: 2019/4/9
  Time: 下午6:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Tomcat+Servlet java应用</title>
  </head>
  <body>
    <p>Hello World</p>
    <ul>
        <li><a href="./servlet">servlet test Page</a></li>
        <li><a href="./child.jsp">child Page</a></li>
        <li><a href="./hello" target="_blank">hello world</a></li>
        <li><a href="./annotation-test" target="_blank">测试WebServlet注解</a></li>
        <li><a href="./hello?username=world" target="_blank">页面传递参数</a></li>
        <li><a href="./servlet-life" target="_blank">测试servlet 生命周期</a></li>
        <li><a href="./download-file?filename=README.md">README 文件下载</a></li>
        <li><a href="./test-upload.jsp">文件上传</a></li>
    </ul>
  </body>
</html>
