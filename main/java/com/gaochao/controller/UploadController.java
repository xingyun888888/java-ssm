package com.gaochao.controller;

/**
 * Created by smileMAC on 4/21/18.
 */


import com.gaochao.exception.BusinessException;
import com.gaochao.util.BSUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
    private static Logger logger = Logger.getLogger(UploadController.class);

    //上传图片
    @RequestMapping(value="/control/upload.do",method = RequestMethod.POST)
    public void upload(@RequestParam(value="file") MultipartFile file){
       if(!file.isEmpty()){
           System.out.println(file.getOriginalFilename());
       }
       logger.info(file);
       BSUtil.isTrue(false,"adfdfdfd");

       //return "index";
    }
}
