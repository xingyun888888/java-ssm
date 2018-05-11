package com.gaochao.test;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Created by smileMAC on 18/5/9.
 */
public class WebAppContextWithWarServerTest {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        WebAppContext context = new WebAppContext();
        context.setContextPath("/myapp");
        context.setWar("/Users/zhimaiMAC/Desktop/web/comgaochaocore/target/com.gaochao.core.war");
        server.setHandler(context);

        server.start();
        server.join();
    }
}
