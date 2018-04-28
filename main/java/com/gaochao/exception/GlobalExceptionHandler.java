package com.gaochao.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by smileMAC on 4/23/18.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    String handlerException(Exception e){
//        return "Exception Deal"+e.getMessage();
//    }


//    @ExceptionHandler(RuntimeException.class)
//    @ResponseBody
//    Map handleBusinessException(RuntimeException e){
//        System.out.println("已经处理到这里了");
//        Map map = new HashMap();
//        map.put("message",e.getMessage());
//        return map;
//    }
}
