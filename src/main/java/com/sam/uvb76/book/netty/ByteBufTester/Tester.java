package com.sam.uvb76.book.netty.ByteBufTester;

import com.sam.uvb76.book.netty.FirstServerHandler;
import com.sam.uvb76.book.netty.SecondServerHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.nio.charset.Charset;

/**
 * Created by LiYangpan on 2019-03-18  14:56.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 * @author sam
 */
public class Tester {

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {


        ByteBuf buf = ByteBufAllocator.DEFAULT.buffer(5,200);
        buf.writeBytes("123".getBytes(Charset.forName("utf-8")));


        System.out.println("buf.capacity() :" + buf.capacity());
        System.out.println("buf.maxCapacity() :" + buf.maxCapacity());
        System.out.println("buf.readerIndex() :" + buf.readerIndex());
        System.out.println("buf.writerIndex() :" + buf.writerIndex());


        ByteBuf b2 = buf.copy();

        System.out.println("b2.capacity() :" + b2.capacity());
        System.out.println("b2.maxCapacity() :" + b2.maxCapacity());
        System.out.println("b2.readerIndex() :" + b2.readerIndex());
        System.out.println("b2.writerIndex() :" + b2.writerIndex());

        System.out.println("--------------------------------------");

        b2.writeBytes("456".getBytes(Charset.forName("utf-8")));


        System.out.println("buf.capacity() :" + buf.capacity());
        System.out.println("buf.maxCapacity() :" + buf.maxCapacity());
        System.out.println("buf.readerIndex() :" + buf.readerIndex());
        System.out.println("buf.writerIndex() :" + buf.writerIndex());


        System.out.println("b2.capacity() :" + b2.capacity());
        System.out.println("b2.maxCapacity() :" + b2.maxCapacity());
        System.out.println("b2.readerIndex() :" + b2.readerIndex());
        System.out.println("b2.writerIndex() :" + b2.writerIndex());






    }








}
