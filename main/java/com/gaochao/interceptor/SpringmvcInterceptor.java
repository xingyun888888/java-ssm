package com.gaochao.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

/**
 * Created by smileMAC on 18/4/25.
 */
public class SpringmvcInterceptor implements HandlerInterceptor {

    private Session session;

    private static final String INTERCEPTOR_URL = "/control/";
    //    方法前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//        System.out.println("进入了拦截器");

        Object user = request.getSession().getAttribute("user");


        String requestURI = request.getRequestURI();

        boolean flag = true;

//        System.out.println(requestURI);
        if(requestURI.startsWith(INTERCEPTOR_URL)){
            System.out.println(user);
            //必须登录
            if(null == user){
                response.sendRedirect("/login.do");
                flag =  false;
            }
        }
        return flag;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
