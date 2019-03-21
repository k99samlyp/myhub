package com.sam.uvb76.book.netty;

import com.sam.uvb76.book.netty.message.ChatMessages;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 *
 * @author LiYangpan
 * @date 2019-03-21  14:10
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class ServerChatHandler extends SimpleChannelInboundHandler<ChatMessages> {

    /**
     * <strong>Please keep in mind that this method will be renamed to
     * {@code messageReceived(ChannelHandlerContext, I)} in 5.0.</strong>
     * <p>
     * Is called for each message of type {@link I}.
     *
     * @param ctx the {@link ChannelHandlerContext} which this {@link SimpleChannelInboundHandler}
     *            belongs to
     * @param msg the message to handle
     * @throws Exception is thrown if an error occurred
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ChatMessages msg) throws Exception {

        System.out.println(System.currentTimeMillis() +  " 负载数据内容 --> " + msg.getContent());

    }
}
