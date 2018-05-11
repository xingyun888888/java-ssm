package com.gaochao.test;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.omg.PortableInterceptor.ACTIVE;

import javax.jms.*;

/**
 * Created by smileMAC on 18/5/8.
 */
public class ActiveMqTest {

    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;

    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;

//    private static final String BROKEURL = ActiveMQConnection.DEFAULT_BROKER_URL;//连接地址
    private static final String BROKEURL = "failover://tcp://47.106.81.10:61616";//连接地址

    private static final int SENDNUM  = 10; //发送的消息数量

    public static void main(String args[]){

        ConnectionFactory connectionFactory; //连接工厂

        Connection connection = null;  //连接

        Session session; //会话接受或者发送消息的线程

        Destination destination;//消息的目的地

        MessageProducer messageProducer;//消息的生产者

        connectionFactory =  new ActiveMQConnectionFactory(ActiveMqTest.USERNAME,ActiveMqTest.PASSWORD,ActiveMqTest.BROKEURL);


        try {
            connection = connectionFactory.createConnection();//通过连接工厂

            connection.start();//启动连接

            session  = connection.createSession(Boolean.TRUE,Session.AUTO_ACKNOWLEDGE);//创建session 返回的是一个session对象

            destination  = session.createQueue("Queue1");//创建消息队列 返回的是一个
            messageProducer = session.createProducer(destination);//创建消息生产者

            //发送消息
            sendMessage(session,messageProducer);

            session.commit();


        } catch (JMSException e) {
            e.printStackTrace();
        }finally {
            if(connection!=null){
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    /**
     * 发送消息
     * @param session
     * @param messageProducer
     */
    public static void sendMessage(Session session,MessageProducer messageProducer) throws JMSException {
         for(int i = 0; i<ActiveMqTest.SENDNUM;i++){
             TextMessage message = session.createTextMessage("ActiveMQ 发送的消息"+i);
             System.out.println("发送消息"+"ActiveMQ 发送的消息"+i);
             messageProducer.send(message);
         }
    }
}
