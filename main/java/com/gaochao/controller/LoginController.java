package com.gaochao.controller;

import com.gaochao.bean.User;
import com.gaochao.common.Md5Pwd;
import com.gaochao.service.BrandServceImpl;
import com.gaochao.web.session.SessionProvider;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @Value("${file.name}")
    private String name;


    @Value("${file.password}")
    private String password;


    @RequestMapping(value="/login.do")
    public String index(){
        return "login";
    }


    @RequestMapping(value="/login.do",method = RequestMethod.POST)
    @ResponseBody
    public Map index(HttpServletRequest request, @RequestParam(value = "name") String name,@RequestParam(value = "password") String password){
         System.out.println(mapWired.get("brandServceImpl").getPath("static"));


         Map map = new HashMap();

         Subject subject = null;
         System.out.println(name);
         System.out.println(password);
         if(name!=null&&password!=null){
             user = new User(name,md5Pwd.encode(password));
             httpSessionProvider.setAttribute(request,"user",user);
             UsernamePasswordToken token = new UsernamePasswordToken(name,password);
              subject = SecurityUtils.getSubject();
             try {
                 token.setRememberMe(true);
                 subject.login(token);
             }catch(AuthenticationException e){
                 map.put("error",e.getMessage());
                 System.out.println(e.getMessage());
                 return map;
             }
         }else{
             System.out.println("name为null,password为null");
             name = this.name;
             password = this.password;
             user = new User(name,md5Pwd.encode(password));
             httpSessionProvider.setAttribute(request,"user",user);
         }
         if(subject.hasRole("admin")){
             map.put("role","admin");
         }else{
             map.put("role","无角色权限");
         }
         map.put("message","登陆成功");
         return map;

    }


    @RequiresPermissions("update")
    @RequiresRoles("admin")
    @RequestMapping(value="/testRole.do",method= RequestMethod.GET)
    @ResponseBody
    public String testRole(){
        return "testRole success";
    }

}
