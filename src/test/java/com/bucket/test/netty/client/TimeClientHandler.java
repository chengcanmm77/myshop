package com.bucket.test.netty.client;

import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

public class TimeClientHandler extends SimpleChannelHandler {

    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        /*   ChannelBuffer buf = (ChannelBuffer) e.getMessage();
        long currentTimeMillis = buf.readInt() * 1000L;
        System.out.println(new Date(currentTimeMillis));*/
        /* Channel ch = e.getChannel();
        
        ChannelBuffer buffer = ChannelBuffers.buffer("say hello".length());
        buffer.writeBytes("say hello".getBytes());
        ch.write(buffer);*/

        //String msg = (String) e.getMessage();
        System.out.println(e.getMessage());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {
        e.getCause().printStackTrace();
        System.out.println("=====");
        e.getChannel().close();
    }

}
