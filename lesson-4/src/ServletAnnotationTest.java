package cn.caozj.lesson4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/annotation-test")
public class ServletAnnotationTest extends HttpServlet {

    @Override
    public void init(){
        System.out.println("init ServletAnnotationTest");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<p>Test ServletAnnotation</p>");
    }

}
