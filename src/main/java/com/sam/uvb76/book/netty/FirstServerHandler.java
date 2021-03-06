package com.sam.uvb76.book.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.Charset;
import java.util.Date;

/**
 * Created by LiYangpan on 2019-03-18  15:06.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class FirstServerHandler extends ChannelInboundHandlerAdapter {

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

        System.out.println(new Date() +  " Client --> " + readBuf.toString(Charset.forName("utf-8")));

//        ByteBuf byteBuf = ctx.alloc().buffer();
//
//        byteBuf.writeBytes(readBuf);
//
//        ctx.channel().writeAndFlush(byteBuf);

        ctx.fireChannelRead(msg);

    }
}
