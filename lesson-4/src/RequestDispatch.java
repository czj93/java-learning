package cn.caozj.lesson4;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/request-dispatch")
public class RequestDispatch extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String username = "caozhijian";
        servletRequest.setAttribute("username", username);
        ServletContext context = getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher("/hello");
        servletResponse.getWriter().write("output before forward request");
        System.out.println("output before forward request");

        dispatcher.forward(servletRequest, servletResponse);


        servletResponse.getWriter().write("output after forward request");
        System.out.println("output after forward request");
    }
}
