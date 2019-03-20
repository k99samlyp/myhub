package com.sam.uvb76.book.netty;

import com.alibaba.fastjson.JSON;
import com.sam.uvb76.book.netty.message.AbstractMessage;
import com.sam.uvb76.book.netty.message.ChatMessages;
import com.sam.uvb76.book.netty.message.LoginMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.nio.charset.Charset;
import java.util.List;

public class PacketDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {

        System.out.println("Decoder输出：" +byteBuf.toString(Charset.forName("utf-8")));
        int msgtype = byteBuf.getByte(0);

        AbstractMessage resmsg = new AbstractMessage();
        if (msgtype == 1){
            byteBuf.skipBytes(1);
            Object foo = JSON.parse(byteBuf.toString(Charset.forName("utf-8")));
            resmsg = JSON.parseObject(foo.toString(),LoginMessage.class);
        }
        else if (msgtype == 2){
            byteBuf.skipBytes(1);
            Object foo = JSON.parse(byteBuf.toString(Charset.forName("utf-8")));
            resmsg = JSON.parseObject(foo.toString(),ChatMessages.class);
        }

        list.add(resmsg);

    }
}
