package com.gaochao.controller;

import io.netty.util.internal.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by smileMAC on 4/21/18.
 */


@Controller
@RequestMapping("/control")
public class ProductController {

   @RequestMapping(value="/index.do")
    public String index(ModelMap model){
       String a =  "这是我的第一个项目";
       StringUtils.isNotBlank(a);
       Map map  =  new HashMap();
       model.addAttribute("pagination",a);
       return "index";
   }

   @RequestMapping(value="/detail.do")
    public String detail(){
        return "detail";
   }

}
