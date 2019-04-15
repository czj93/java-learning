package cn.caozj.lesson4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookie")
public class CookieOperation extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        Cookie cookies[] = req.getCookies();
        Cookie cookieTest = null;
        //设置响应内容类型
        res.setContentType("text/html");
        //设置逻辑实现
        PrintWriter out = res.getWriter();

        out.println("<ul><p>cookies list</p>");
        for(int i=0; i<cookies.length;i++){
            if(cookies[i].getName().equals("cookie_test")){
                cookieTest = cookies[i];
            }
            out.println("<li>Cookie name:" + cookies[i].getName() + " Cookie value: " + cookies[i].getValue() + "</li>");
        }
        cookieHandle(cookieTest,res);
        out.println("</ul>");

        out.close();
    }

    public void cookieHandle(Cookie cookie, HttpServletResponse res){
        if(cookie == null){ // 没有就新建
            cookie = new Cookie("cookie_test", "1");
            cookie.setMaxAge(10*60); // 单位秒
        }else{  // value 加一
            int count = Integer.parseInt(cookie.getValue());
            if(count < 3){
                count++;
                cookie.setValue(String.valueOf(count));
            }else{
                cookie.setMaxAge(0); // 删除cookie
            }
        }
        res.addCookie(cookie);
    }

}

