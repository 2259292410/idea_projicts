package com.zzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
public class IndexController {

    @PostMapping("/upload")
    public String upload( @RequestPart("fileName") MultipartFile fileName) throws IOException {

        if(!fileName.isEmpty()){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String format = simpleDateFormat.format(date);
            String originalFilename = fileName.getOriginalFilename();
            File file = new File("E:\\"+format);
            if(!file.exists()){
                file.mkdir();
            }
            String finalPath="E:\\"+format+"\\"+originalFilename;
            fileName.transferTo(new File(finalPath));
        }
        return "success";
    }
}
