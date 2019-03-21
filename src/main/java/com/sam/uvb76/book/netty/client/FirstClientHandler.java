package com.sam.uvb76.book.netty.client;

import com.alibaba.fastjson.JSON;
import com.sam.uvb76.book.netty.message.ChatMessages;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

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

//        ByteBuf byteBuf = ctx.alloc().buffer();
//        byteBuf.writeBytes("你好".getBytes(Charset.forName("utf-8")));
//        ctx.channel().writeAndFlush(byteBuf);
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

        int ret = readBuf.getByte(0);

        if (ret == 0){
            System.out.println(new Date() +  "登陆成功！！！");
            System.out.println("启动输入线程");
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        ByteBuf byteBuf = ctx.channel().alloc().buffer();
                        byteBuf.retain(20);
                        System.out.println("输入消息发送至服务端: ");
                        Scanner scanner = new Scanner(System.in);
                        String line = scanner.nextLine();

                        ChatMessages msg = new ChatMessages();

                        msg.setId(UUID.randomUUID().toString());
                        msg.setTime(System.currentTimeMillis());
                        msg.setContent(line);
                        msg.setLength(line.length());
                        msg.setFromToken("9900");
                        msg.setToToken("9800");
                        String jstring = JSON.toJSONString(msg);


                        byteBuf.writeByte(0x02);
                        byteBuf.writeBytes(jstring.getBytes(Charset.forName("utf-8")));
                        byteBuf.writeBytes(new byte[]{0x23,0x23});
                        byteBuf.writeByte(0x02);
                        byteBuf.writeBytes(jstring.getBytes(Charset.forName("utf-8")));
                        byteBuf.writeBytes(new byte[]{0x23,0x23});
                        byteBuf.writeByte(0x02);
                        byteBuf.writeBytes(jstring.getBytes(Charset.forName("utf-8")));
                        byteBuf.writeBytes(new byte[]{0x23,0x23});

                        ctx.channel().writeAndFlush(byteBuf);
                    }
                }
            }).start();

        }
        else {
            System.out.println(new Date() +  " 登录失败了！！！！ ");

        }
    }
}
