package com.gaochao.test;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

/**
 * Created by smileMAC on 18/5/8.
 */
public class MailTest {
    public static void main(String args[]) throws UnsupportedEncodingException, MessagingException {
        Properties props = new Properties();

        props.setProperty("mail.transport.protocol", "smtp");   // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.smtp.host", "smtp.sina.com");   // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.auth", "true");            // 需要请求认证


        Session  session = Session.getInstance(props);

        session.setDebug(true);




        MimeMessage message = new MimeMessage(session);




        message.setFrom(new InternetAddress("xingyun_888888@sina.com","GAOCHAO","UTF-8"));

        message.setRecipient(MimeMessage.RecipientType.TO,new InternetAddress("gaochao_888888@sina.com","AAA","UTF-8"));

        message.setSubject("TEST邮件主题", "UTF-8");

        // 5. Content: 邮件正文（可以使用html标签）
        message.setContent("TEST这是邮件正文。。。", "text/html;charset=UTF-8");

        // 6. 设置显示的发件时间
        message.setSentDate(new Date());

        // 7. 保存前面的设置
        message.saveChanges();


        // 4. 根据 Session 获取邮件传输对象
        Transport transport = session.getTransport();

        transport.connect("xingyun_888888@sina.com", "xyXY147258");

        transport.sendMessage(message, message.getAllRecipients());

        // 7. 关闭连接
        transport.close();

    }
}
