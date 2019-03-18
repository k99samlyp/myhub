package com.sam.uvb76.book.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * Created by LiYangpan on 2019-03-18  15:10.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
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

            }
        });

        bootstrap.connect("127.0.0.1",9900).addListener(future -> {
            System.out.println(future.isSuccess());
        });



    }

}
