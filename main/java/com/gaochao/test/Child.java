package com.gaochao.test;

/**
 * Created by smileMAC on 18/4/29.
 */
public class Child extends Parent {

    public static void main(String[] args){

        Child  child = new Child();

        child.setAaa("ddd");

        System.out.println(child.aaa);
        System.out.println(child.getAaa());

    }
}
