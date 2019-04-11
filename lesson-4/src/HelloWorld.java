package cn.caozj.lesson4;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {

    @Override
    public void init(){
        System.out.println("Init Hello world");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        //设置响应内容类型
        res.setContentType("text/html");
        //设置逻辑实现
        PrintWriter out = res.getWriter();
        out.println("<h3>Hello World</h3>");
        out.close();
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
