package cn.caozj.lesson4;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet("/servlet-life")
public class ServletLife extends GenericServlet {
    private int initCount = 0;
    private int serviceCount = 0;
    private int destroyCount = 0;

    @Override
    public void init(ServletConfig config){
        initCount++;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        serviceCount++;
        // 获取参数
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("<p>测试Servlet生命周期</p>");

        out.println("<ul>");
        out.printf("<li>init count: %d </li>", initCount);
        out.printf("<li>service count: %d </li>", serviceCount);
        out.printf("<li>destroy count: %d </li>", destroyCount);
        out.println("</ul>");
        out.println("<p><a href='window.location.reload();'>点击刷新页面，查看结果</a></p>");
        out.close();
    }

    @Override
    public void destroy(){
        destroyCount++;
    }

}