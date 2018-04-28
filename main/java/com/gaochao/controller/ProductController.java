package com.gaochao.controller;

import com.gaochao.bean.Camera;
import com.gaochao.redis.RedisCacheManager;
import com.gaochao.service.CameraServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.netty.util.internal.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by smileMAC on 4/21/18.
 */


@Controller
public class ProductController {

   @Autowired
   private CameraServiceImpl cameraServiceImpl;


   @RequestMapping(value="/control/index.do")
   @ResponseBody
    public PageInfo<Camera> index(ModelMap model){

       PageHelper.startPage(1,3);
       String a =  "这是我的第一个项目";
       StringUtils.isNotBlank(a);
       Map map  =  new HashMap();
       List<Camera>  list = cameraServiceImpl.getList();
       PageInfo<Camera> pageInfo = new PageInfo<Camera>(list);
       return pageInfo;
//       model.addAttribute("list",list);
//       return "index";
   }

   @RequestMapping(value="/control/by_id.do")
   public String index(ModelMap model,@RequestParam int id){
       Camera camera = cameraServiceImpl.getCameraById(id);
       model.addAttribute("camera",camera);
       return "index";
   }


   @RequestMapping(value="/control/update.do")
   @ResponseBody
   public Map update(ModelMap model, @RequestParam(required = false) int  id, @RequestParam(required = false) String name){

       cameraServiceImpl.updateCameraById(id,name);

       Map map = new HashMap();
       map.put("message","数据更新成功");
       return map;
   }


   @RequestMapping(value="/product/display.do")
   public String getIndex(ModelMap modelMap){
      modelMap.addAttribute("key",new Date().toString());
      return "index";
   }


   @RequestMapping(value="/control/detail.do")
    public String detail(){
        return "detail";
   }

}
