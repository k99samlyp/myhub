package com.sam.uvb76.book.netty;

import com.alibaba.fastjson.JSON;
import com.sam.uvb76.book.netty.message.ChatMessages;
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
public class SecondServerHandler extends ChannelInboundHandlerAdapter {

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
//        ByteBuf readBuf = (ByteBuf) msg;
//
//        System.out.println("协议类型：" + readBuf.getByte(0));
//
//        System.out.println("数据内容：" + readBuf.toString(Charset.forName("utf-8")));
//
//        readBuf.skipBytes(1);
//
//        Object o1 = JSON.parse(readBuf.toString(Charset.forName("utf-8")));
//
//        ChatMessages msgRecv = JSON.parseObject(o1.toString(),ChatMessages.class);
//
//        System.out.println(System.currentTimeMillis() +  " 负载数据内容 --> " + msgRecv.getContent());
    }
}
