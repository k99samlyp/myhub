package com.sam.uvb76.book.netty.client;

import com.alibaba.fastjson.JSON;
import com.sam.uvb76.book.netty.message.LoginMessage;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.nio.charset.Charset;
import java.util.UUID;

/**
 * Created by LiYangpan on 2019-03-18  15:10.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 * @author sam
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {

        NioEventLoopGroup clietnGroop = new NioEventLoopGroup();

        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(clietnGroop).channel(NioSocketChannel.class).handler(new ChannelInitializer<SocketChannel>() {
            /**
             * This method will be called once the {@link Channel} was registered. After the method returns this instance
             * will be removed from the {@link ChannelPipeline} of the {@link Channel}.
             *
             * @param ch the {@link Channel} which was registered.
             * @throws Exception is thrown if an error occurs. In that case it will be handled by
             *                   {@link #exceptionCaught(ChannelHandlerContext, Throwable)} which will by default close
             *                   the {@link Channel}.
             */
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {

                ch.pipeline().addLast(new FirstClientHandler());

            }
        });

        bootstrap.connect("127.0.0.1",9900).addListener(future -> {

            if(future.isSuccess()){

                Channel channel = ((ChannelFuture) future).channel();

                System.out.println("连接成功，客户端开始登陆.....");
                ByteBuf byteBuf = channel.alloc().buffer();

                LoginMessage loginMessage  = new LoginMessage();
                loginMessage.setId(UUID.randomUUID().toString());
                loginMessage.setTime(System.currentTimeMillis());
                loginMessage.setUsername("lyp");
                loginMessage.setLength(98);
                loginMessage.setPassword("374886");
                loginMessage.setToken("9900");

                byteBuf.writeByte(0x01);
                byteBuf.writeBytes(JSON.toJSONString(loginMessage).getBytes(Charset.forName("utf-8")));
                byteBuf.writeBytes(new byte[]{0x23,0x23});
                channel.writeAndFlush(byteBuf);
            }
            else{
                System.out.println("连接失败！");
            }
        });

    }

}
