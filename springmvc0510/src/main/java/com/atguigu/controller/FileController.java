package com.atguigu.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Controller
public class FileController {
    @RequestMapping("/testFileUpload")
    public String testFileUpload(@RequestParam("desc") String desc, @RequestParam("filename") MultipartFile file, HttpSession session) throws IOException {
        System.out.println("文件的描述信息是：" + desc);
        //获取文件名
        String fileName = file.getOriginalFilename();
        //获取文件的类型
        String contentType = file.getContentType();
        //获取文件的大小
        long size = file.getSize();
        System.out.println("文件名是：" + fileName);
        System.out.println("文件的类型是：" + contentType);
        System.out.println("文件的大小是：" + size + " 个字节");
        //获取文件上传的真实路径，这里获取servletContext对象时，HttpSession或HttpServletRequest都可以获取到
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("/upload");
        //创建路径
        File upload = new File(realPath);
        if (!upload.exists()) {
            upload.mkdirs();
        }
        //上传文件
        file.transferTo(new File(realPath + "/" + fileName));
        return "success";
    }

    @RequestMapping("/testFileUpload2")
    public String filesUpload(@RequestParam String desc, @RequestPart("filename") MultipartFile[] multipartFiles, HttpServletRequest request) throws IOException {

        for (MultipartFile multipartFile : multipartFiles) {
            // 如何限定文件的类型
            // 1 后缀名
            // 2 文件的媒体类型， 如果上传的是图片时,文件contentType="image/jpeg"
           /* String contentType = multipartFile.getContentType();
            if(!contentType.startsWith("image/")){
                continue;
            }*/

            // 限定文件大小
            /*long size = multipartFile.getSize();
            if (size>=3000) {
                continue;
            }*/

            String originalFilename = multipartFile.getOriginalFilename();
            // 处理原始文件名 logo.jpg
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
            String uuid = UUID.randomUUID().toString();
            String newFileName = uuid.replace("-", "").concat(suffix);
            ServletContext servletContext = request.getServletContext();
            String realPath = servletContext.getRealPath("/upload");

            // 创建目标存储位置
            File upload = new File(realPath);
            if (!upload.exists()) {
                upload.mkdirs();
            }
            // 向目标位置存储文件
            multipartFile.transferTo(new File(realPath + "/" + newFileName));
        }
        return "success";
    }

    @RequestMapping(value = "/testResponseEntity")
    public ResponseEntity<byte[]> testResponseEntity(HttpServletRequest request) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = request.getServletContext();
        String fileName = "1.jpg";
        //获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("/image/" + fileName);
        System.out.println(realPath);
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载的文件的名字
        headers.add("Content-Disposition", "attachment;filename=" + fileName);
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }
}
