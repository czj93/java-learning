package cn.caozj.lesson4;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/upload")
public class Upload extends HttpServlet {
    private String filePath = "/Users/caozhijian/code/temp/";
    private final int TOTAL_FILE_SIZE_MAX = 5 * 1024 * 1024;
    private final int SINGLE_FILE_SIZE_MAX = 20*1024*1024;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DiskFileItemFactory factory = new DiskFileItemFactory();

        ServletFileUpload upload = new ServletFileUpload(factory);

        upload.setFileSizeMax(TOTAL_FILE_SIZE_MAX);

        upload.setSizeMax(SINGLE_FILE_SIZE_MAX);

        upload.setHeaderEncoding("utf-8");

        if(ServletFileUpload.isMultipartContent(req)){
            try{
                List<FileItem> list = upload.parseRequest(req);
                for (FileItem item : list) {
                    if(item.isFormField()){
                        String name = item.getFieldName();
                        String value = item.getString("UTF-8");
                        System.out.println(name + " : " + value);
                    }else{
                        String fileName = item.getName();

                        File file = new File(filePath, fileName);

                        item.write(file);
                        item.delete();

                        PrintWriter out = resp.getWriter();
                        out.print("file upload success");
                    }
                }

            }catch (FileUploadException e){
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            resp.getWriter().write("cannot deal this request");
        }
    }
}
