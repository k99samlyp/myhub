package com.sam.uvb76.book.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * Created by LiYangpan on 2019-01-07  18:00.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class ClientTest {

    public static void main(String[] args) {

        NioEventLoopGroup ng = new NioEventLoopGroup();

        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(ng)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new FirstClientHandler());
//                        ch.pipeline().addLast(new SecondClientHandler());

                    }
                });

        bootstrap.connect("127.0.0.1",9800).addListener(ls -> {

            if (ls.isSuccess()){
                System.out.println("连接成功");
            }
            else {
                System.out.println("连接失败");
            }

        });

    }
}
