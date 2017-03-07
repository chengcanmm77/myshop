package com.bucket.test.netty.server;

import java.util.List;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

import com.bucket.test.netty.User;

public class DiscardServerHandler extends SimpleChannelHandler {

    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        /* ChannelBuffer buf = (ChannelBuffer) e.getMessage();
        while (buf.readable()) {
            System.out.println((char) buf.readByte());
            System.out.flush();
        }
        ChannelBuffer buffer = ChannelBuffers.buffer("say hello".length());
        buffer.writeBytes("say hello".getBytes());
        ch.write(buffer);*/
        /*Channel ch = e.getChannel();
        String ss = (String) e.getMessage();
        System.out.println(ss);
        ch.write("i Received ====" + ss);*/
        System.out.println(e.getMessage());
        List<User> ss = (List<User>) e.getMessage();
        System.out.println("=="+ss.size());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {
        e.getCause().printStackTrace();
        Channel ch = e.getChannel();
        ch.close();
    }

    @Override
    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        Channel ch = e.getChannel();

        ChannelBuffer time = ChannelBuffers.buffer(4);
        time.writeInt((int) (System.currentTimeMillis() / 1000L + 2208988800L));

        //ChannelFuture f = ch.write(time);

        /* f.addListener(new ChannelFutureListener() {
            public void operationComplete(ChannelFuture future) {
                Channel ch = future.getChannel();
                ch.close();
            }
        });*/
    }

}
