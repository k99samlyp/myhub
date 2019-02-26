package com.sam.uvb76.book.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.Charset;

/**
 * Created by LiYangpan on 2019-01-08  09:58.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class FirstServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

    }


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println(((ByteBuf) msg).toString(Charset.forName("utf-8")));

        ByteBuf byteBuf = ctx.alloc().buffer();

        byteBuf.writeBytes("hello2222".getBytes("UTF-8"));

        ctx.channel().writeAndFlush(byteBuf);
    }
}
