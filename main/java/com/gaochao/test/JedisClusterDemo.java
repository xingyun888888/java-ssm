package com.gaochao.test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by smileMAC on 18/4/26.
 */
public class JedisClusterDemo {
    public static void main(String[] args){
//        System.out.println(new HostAndPort("127.0.0.1", 6379));
//        Set<HostAndPort> nodes = new HashSet<HostAndPort>();
//        JedisCluster jedisCluster = new JedisCluster(nodes);
////        写入数据
//        jedisCluster.set("xxsgsgsdg","sfslgjldfglfmgdlm高彩虹啊");
        Jedis jedis = new Jedis("127.0.0.1");
        jedis.set("leiTest", "localhost Connection  sucessfully");
        //获取一个
        String leite=jedis.get("leiTest");
        System.out.println("leiTest键值为: " +leite);


    }
}
