package com.gaochao.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by smileMAC on 18/4/28.
 */
public class IniRealmTest {

    SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();





    @Test
    public void testAuthtication(){

        IniRealm  iniRealm  = new IniRealm("classpath:user.ini");

        //1.构建SecurityManager
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(iniRealm);

        //主题提交认证请求
        SecurityUtils.setSecurityManager(defaultSecurityManager);

        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("Mark","123456");

        subject.login(token);


        System.out.println(subject.isAuthenticated());

        subject.checkRole("admin");
        subject.checkPermission("user:update");

    }
}
