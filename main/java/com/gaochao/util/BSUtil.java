package com.gaochao.util;

import com.gaochao.exception.BusinessException;

/**
 * Created by smileMAC on 4/23/18.
 */
public class BSUtil {
    public static  void isTrue(boolean expression,String error){
        if(!expression){
            throw new BusinessException(error);
        }
    }
}
