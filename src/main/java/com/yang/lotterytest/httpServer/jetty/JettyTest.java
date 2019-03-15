package com.yang.lotterytest.httpServer.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;

/**
 * Created by rio on 2019/3/15.
 */
public class JettyTest {

    public static void main(String[] args) throws Exception {
        Server server = new Server(80);
        ContextHandler ch = new ContextHandler();
        ch.setContextPath("/gisCoreJ");
        ch.setHandler(new JettyHandler());
        server.setHandler(ch);
        server.start();
        server.join();
    }
}
