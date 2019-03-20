package com.sam.uvb76.book.netty.client;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by LiYangpan on 2019-03-18  16:03.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 * @author sam
 */
public class FirstClientHandler extends ChannelInboundHandlerAdapter {

    /**
     * Calls {@link ChannelHandlerContext#fireChannelActive()} to forward
     * to the next {@link ChannelInboundHandler} in the {@link ChannelPipeline}.
     * <p>
     * Sub-classes may override this method to change behavior.
     *
     * @param ctx
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        ByteBuf byteBuf = ctx.alloc().buffer();
        byteBuf.writeBytes("你好".getBytes(Charset.forName("utf-8")));
        ctx.channel().writeAndFlush(byteBuf);
    }

    /**
     * Calls {@link ChannelHandlerContext#fireChannelRead(Object)} to forward
     * to the next {@link ChannelInboundHandler} in the {@link ChannelPipeline}.
     * <p>
     * Sub-classes may override this method to change behavior.
     *
     * @param ctx
     * @param msg
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf readBuf = (ByteBuf) msg;

        System.out.println(new Date() +  " server收到了，内容是 -->  " + readBuf.toString(Charset.forName("utf-8")));
    }
}
