package com.gaochao.exception;

/**
 * Created by smileMAC on 4/23/18.
 */
public class BusinessException extends RuntimeException{
   public BusinessException(String message){
       super(message);
   }
}
