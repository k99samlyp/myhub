package com.sam.uvb76.book.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Created by LiYangpan on 2019-01-08  09:45.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class SecondServerHandler extends ChannelInboundHandlerAdapter {
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

        byteBuf.writeBytes("hello22222".getBytes("UTF-8"));

        ctx.channel().writeAndFlush(byteBuf);

    }
}
