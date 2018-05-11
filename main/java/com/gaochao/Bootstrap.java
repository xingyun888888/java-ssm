package com.gaochao;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Created by smileMAC on 18/5/11.
 */
public class Bootstrap {
    public static void main(String[] args) throws Exception {
//        创建Server对象
        Server server = new Server();

        server.setStopAtShutdown(true);

        ServerConnector connector = new ServerConnector(server);

        connector.setPort(8080);

//        将Connector添加到server中
        server.setConnectors(new Connector[]{connector});


        String webappPath = "src/main/webapp";

//        创建web上下文对象
        WebAppContext ctx = new WebAppContext(webappPath,"");


        ctx.setDescriptor(webappPath+"/WEB-INF/web.xml");

//        设置web根目录
        ctx.setResourceBase(webappPath);

        ctx.setClassLoader(Thread.currentThread().getContextClassLoader());

//        将上下文与服务关联起来
        server.setHandler(ctx);

//       启动服务器
        server.start();

//       将子线程加入到主线程
        server.join();

    }
}
