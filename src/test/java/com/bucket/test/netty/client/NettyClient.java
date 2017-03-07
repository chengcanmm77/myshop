package com.bucket.test.netty.client;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;
import org.jboss.netty.handler.codec.serialization.ObjectDecoder;
import org.jboss.netty.handler.codec.serialization.ObjectEncoder;

import com.bucket.test.netty.User;

public class NettyClient {

    public static void main(String[] args) throws InterruptedException {

        ChannelFactory factory = new NioClientSocketChannelFactory(Executors.newCachedThreadPool(),
            Executors.newCachedThreadPool());

        ClientBootstrap bootstrap = new ClientBootstrap(factory);
        bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
            public ChannelPipeline getPipeline() {
                ChannelPipeline pipeline = Channels.pipeline();
                //ChannelBuffer limit = ChannelBuffers.copiedBuffer("\r\n".getBytes());
                pipeline.addLast("decoder", new ObjectDecoder());
                pipeline.addLast("encoder", new ObjectEncoder());
                pipeline.addLast("handler", new TimeClientHandler());
                return pipeline;
            }
        });

        bootstrap.setOption("tcpNoDelay", true);
        bootstrap.setOption("keepAlive", true);

        ChannelFuture future = bootstrap.connect(new InetSocketAddress("127.0.0.1", 8080));
        Channel channel = future.getChannel();
        while (!future.isSuccess()) {
            System.out.println("===" + channel.isConnected() + "==" + future.isSuccess());

            Thread.sleep(1000);
        }

        List<User> ss = new ArrayList<User>();
        for(int i=0;i<2;i++){
        User user = new User();
        user.setPassWord("123456");
        user.setUserName("程灿明");
        ss.add(user);
        }
        System.out.println("=="+ss.size());
        channel.write(ss);
        /* while (true) {
            Scanner scan = new Scanner(System.in);
            String ff = scan.nextLine();
        
            channel.write(ff);
        }*/
    }
}
