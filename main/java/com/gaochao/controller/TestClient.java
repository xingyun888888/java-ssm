package com.gaochao.controller;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by smileMAC on 4/20/18.
 */
//@RunWith(SpringjUnit4ClassRunner.class)
//@ContextConfiguration(location = "class:application-context.xml")
public class TestClient {
    public static void main(String[] args){
      System.out.println("这是我的第一个程序");
    }

    public void testAdd(){
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("application-context.xml");
        applicationContext.getBean("");
    }
}
