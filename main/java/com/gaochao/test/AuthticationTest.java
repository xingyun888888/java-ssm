package com.gaochao.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by smileMAC on 18/4/28.
 */
public class AuthticationTest {

    SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();


    @Before
    public  void addUser(){
        simpleAccountRealm.addAccount("Mark","123456","admin");
    }


    @Test
    public void testAuthtication(){
        //构建securityManager环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();

        defaultSecurityManager.setRealm(simpleAccountRealm);

        //主题提交认证请求
        SecurityUtils.setSecurityManager(defaultSecurityManager);

        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("Mark","123456");

        subject.login(token);


        System.out.println(subject.isAuthenticated());

        subject.checkRole("admin1");

    }
}
