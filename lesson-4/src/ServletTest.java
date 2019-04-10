package cn.caozj.ServletTest;

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
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("<p>test servlet</p>");
    }

    @Override
    public void destroy(){

    }

}