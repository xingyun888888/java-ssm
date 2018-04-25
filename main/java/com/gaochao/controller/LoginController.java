package com.gaochao.controller;

import com.gaochao.bean.User;
import com.gaochao.common.Md5Pwd;
import com.gaochao.service.BrandServceImpl;
import com.gaochao.web.session.SessionProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by smileMAC on 18/4/24.
 */
@Controller
public class LoginController {

    @Autowired
    private Md5Pwd md5Pwd;

    @Autowired
    private Map<String, BrandServceImpl> mapWired;

    @Autowired
    private SessionProvider httpSessionProvider;

    private User user;

    @RequestMapping(value="/login.do")
    @ResponseBody
    public Map index(HttpServletRequest request, @RequestParam(required = false) String name,@RequestParam(required = false) String password){
         System.out.println(mapWired.get("brandServceImpl").getPath("static"));

         if(name!=null&&password!=null){
             user = new User(name,md5Pwd.encode(password));
             httpSessionProvider.setAttribute(request,"user",user);
         }
         Map map = new HashMap();
         map.put("message", mapWired.get("brandServceImpl").getPath("static"));
         return map;
    }


}
