package com.sam.uvb76.book.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Created by LiYangpan on 2019-03-18  14:56.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 * @author sam
 */
public class Uvb76Server {

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {

        NioEventLoopGroup bossLoopGroup = new NioEventLoopGroup();
        NioEventLoopGroup workerLoopGroup = new NioEventLoopGroup();


        ServerBootstrap serverBootstrap = new ServerBootstrap();

        serverBootstrap.group(bossLoopGroup,workerLoopGroup).channel(NioServerSocketChannel.class).childHandler(new ChannelInitializer<SocketChannel>() {

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
                ch.pipeline().addLast(new FirstServerHandler()).addLast(new SecondServerHandler());

            }
        });

        serverBootstrap.bind(9900);

    }

}
