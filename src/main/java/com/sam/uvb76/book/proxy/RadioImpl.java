package com.sam.uvb76.book.proxy;

/**
 * 接口
 */
public class RadioImpl implements Radio{

    /**
     * 发送消息
     */
    @Override
    public void sendMessage() {
        System.out.println("发送消息");
    }
}
