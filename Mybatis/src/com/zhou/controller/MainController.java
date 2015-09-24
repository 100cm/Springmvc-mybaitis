package com.zhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import util.SomeUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by icepoint on 8/14/15.
 */
@Controller
public class MainController{



 private SomeUtil util;


//    //传递对象
//    @RequestMapping(value="/test1")
//    public String test3(@RequestBody Users user){
//        System.out.print(user);
//        return "index";
//    }
//    //传递对象json
//    @RequestMapping(value="/test3")
//    public String  test(@RequestBody Map<String,BIConversion.User> user){
//        System.out.print(user.get("user"));
//        return "index";
//    }
//    //传递数组
//    @RequestMapping (value="/test2")
//    public String test2(@RequestBody List<Users> user) {
//        for(Users obj:user){
//            System.out.println(obj);
//        }
//        return LIST_PAGE;
//    }
//    上传文件
    @RequestMapping("/upload")
    public String upload(@RequestParam("desc") String desc,@RequestParam("file") MultipartFile file,HttpServletRequest request)
            throws IllegalStateException, IOException {
        String filename=file.getOriginalFilename();
        if(!file.isEmpty()){
            System.out.print(desc);
            //获取路径
            File f = new File(request.getSession().getServletContext().getRealPath("/")+"uploadfile/"+file.getOriginalFilename());
            //处理同样的文件名 _x_y_z的格式
            if (f.exists()){
                filename=util.getFileNameNoEx(filename)+"_"+util.getTimenow()+"."+util.getExtensionName(filename);
            }
            else
            {
                //文件名不变
                filename=file.getOriginalFilename();
            }
            //存到项目路径下为uploadfile的文件中
            file.transferTo(new File(request.getSession().getServletContext().getRealPath("/")+"uploadfile/"+filename));

        }

        return "index";
    }



}






