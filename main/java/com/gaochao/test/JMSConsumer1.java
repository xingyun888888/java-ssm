package com.gaochao.test;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by smileMAC on 18/5/8.
 */
public class JMSConsumer1 implements MessageListener{

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

        MessageConsumer messageConsumer;//消息的消费者


        connectionFactory = new ActiveMQConnectionFactory(JMSConsumer1.USERNAME,JMSConsumer1.PASSWORD,JMSConsumer1.BROKEURL);


        try {
            connection = connectionFactory.createConnection();
            connection.start();
            session  = connection.createSession(Boolean.FALSE,Session.AUTO_ACKNOWLEDGE);
            destination = session.createTopic("topic1");

            messageConsumer = session.createConsumer(destination);

            messageConsumer.setMessageListener(new JMSConsumer1());


//            while(true) {
//                TextMessage textMessage = (TextMessage)messageConsumer.receive(100000);
//                if(textMessage!=null){
//                    System.out.println(textMessage.getText());
//                }else{
//                    break;
//                }
//            }


        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("订阅者1收到的消息:"+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
