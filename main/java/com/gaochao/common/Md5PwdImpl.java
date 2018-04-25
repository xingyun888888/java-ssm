package com.gaochao.common;

import org.apache.commons.codec.binary.Hex;
import org.springframework.stereotype.Component;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by smileMAC on 18/4/24.
 */


@Component
public class Md5PwdImpl implements Md5Pwd{

    // 加密
    public String encode(String password){

        String algorithm = "MD5";

        //加盐 abcdefg

        String salt  = "123456";

        MessageDigest instance = null;

        try {
            instance = MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = instance.digest(password.getBytes());

        char[] encodeHex = Hex.encodeHex(digest);

        return new String(encodeHex);
    }
}
