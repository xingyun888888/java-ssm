package com.gaochao.test;

/**
 * Created by smileMAC on 18/5/9.
 */
public class MyArrayList {

    Object[] objs = new Object[4];

    int size = 0; //集合的大小

    public int get(){
        return size;
    }

    public void add(Object value){
       //如果放不放的下 判断size
        if(size>=objs.length){
            Object[] temp = new Object[objs.length*3/2+1];
            //搬家
            for(int i = 0; i < objs.length; i++){
                temp[i] = objs[i];
            }
            objs = temp;
        }
       objs[size] = value;
       size++;
    }

    public void set(int index,Object value) throws Exception{
        if(index >= size || index < 0){
               throw new Exception("超出范围");
        }
        objs[index] = value;
    }


}
