package cn.caozj.lesson4;

import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

@WebServlet("/download-file")
public class DownloadFile extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        OutputStream out;
        Long contentLength;

        out = res.getOutputStream();
        // 获取文件名
        String fileName = req.getParameter("filename");
        // 设置文件夹路径
        String filepath = "/Users/caozhijian/code/learn/java-learning/lesson-4/";

        System.out.println("real path:" + getServletContext().getRealPath("/src"));
        System.out.println("Resource path:" + getServletContext().getResource("/"));

        if(fileName == null){
            out.write("Plaease input filename".getBytes());
            out.close();
            return;
        }
        File file = new File(filepath + fileName);
        // 判断文件是否存在
        if(file.exists()){
            contentLength = file.length();
            res.setContentType("application/force-download");
            res.setHeader("Content-Length", String.valueOf(contentLength));
            res.addHeader("Content-Disposition", "attachment; filename=" + fileName);
            FileInputStream fileInputStream=new FileInputStream(file);
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
            int size;
            byte[] b=new byte[4096];
            while ((size=bufferedInputStream.read(b))!=-1) {
                out.write(b, 0, size);
            }
            bufferedInputStream.close();
        }else{
            out.write("file not exist".getBytes());
        }
        out.close();
    }
}
