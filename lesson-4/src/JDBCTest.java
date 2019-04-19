package cn.caozj.lesson4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/database")
public class JDBCTest extends HttpServlet {
    private final String username = "root";
    private final String password = "cao622841";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/test";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Statement stm;
            String sql;

            resp.setContentType("text/html");
            resp.setCharacterEncoding("utf-8"); // 设置编码，否则会乱码
            PrintWriter out = resp.getWriter();

            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, password);
            stm = connection.createStatement();
            sql = "Select * from users";
            ResultSet result = stm.executeQuery(sql);

            out.println("<p>Users 表数据</p>");
            out.println("<table>");
            out.println("<thead><tr><th>ID</th><th>Name</th><th>Desc</th></tr></thead>");
            out.println("<tbody>");

            while(result.next()){
                int id = result.getInt(1);
                String name = result.getString("name");
                String desc = result.getString("description");
                out.printf("<tr><td>%d</td><td>%s</td><td>%s</td></tr>", id, name, desc);
                System.out.printf("%d %s %s", id, name, desc);
            }
            out.println("</tbody></table>");
            out.close();
            stm.close();
            connection.close();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");

        String name = req.getParameter("name");
        String desc = req.getParameter("desc");
        Integer id = Integer.parseInt(req.getParameter("id"));
        System.out.println("name :" + name);
        PrintWriter out = resp.getWriter();
        try{
            insert(id, name ,desc);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }

        out.write("{success:true'}");
        out.close();
    }

    public void insert(int id, String name, String desc) throws ClassNotFoundException,SQLException{
        PreparedStatement stm;
        String sql;
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, username, password);
        sql = "insert into users(id,name,description)values(?,?,?)";
        stm = connection.prepareStatement(sql);
        stm.setInt(1,id);
        stm.setString(2,name);
        stm.setString(3,desc);
        stm.execute();
        stm.close();
        connection.close();
    }
}
