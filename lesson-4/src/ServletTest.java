package cn.caozj.lesson4;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet("/servlet")
public class ServletTest extends GenericServlet {
    @Override
    public void init(ServletConfig config){

    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException{
        // 获取参数
        String username = req.getParameter("username");
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("<p>test servlet</p>");
        if(username!=null){
            out.println("<p>hello "+ username +"</p>");
        }
        out.close();
    }

    @Override
    public void destroy(){

    }

}