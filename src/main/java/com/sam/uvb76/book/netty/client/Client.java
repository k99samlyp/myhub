package com.sam.uvb76.book.netty.client;

import com.alibaba.fastjson.JSON;
import com.sam.uvb76.book.netty.message.Message;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.apache.logging.log4j.util.Chars;

import java.nio.charset.Charset;
import java.util.Scanner;
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
                System.out.println("启动输入线程");
                Channel channel = ((ChannelFuture) future).channel();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true){
                            ByteBuf byteBuf = channel.alloc().buffer();
                            System.out.println("输入消息发送至服务端: ");
                            Scanner scanner = new Scanner(System.in);
                            String line = scanner.nextLine();

                            Message msg = new Message();

                            msg.setMsg_type(Message.MSG_TYPE.text);
                            msg.setId(UUID.randomUUID().toString());
                            msg.setContent(line);
                            msg.setLength(line.length());
                            String jstring = JSON.toJSONString(msg);

                            byteBuf.writeBytes(jstring.getBytes(Charset.forName("utf-8")));
                            channel.writeAndFlush(byteBuf);
                        }
                    }
                }).start();
            }
            else{
                System.out.println("连接失败！");
            }
        });

    }

}
