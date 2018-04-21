package com.gaochao.controller;

/**
 * Created by smileMAC on 4/21/18.
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * 上传图片
 * 商品
 * 品牌
 * 商品介绍
 */
@Controller
public class UploadController {


    //上传图片
    @RequestMapping(value="/control/upload.do",method = RequestMethod.POST)
    public void upload(@RequestParam(required = true) MultipartFile file){
        System.out.println(file.getOriginalFilename());
    }
}
