package com.sam.uvb76.book.netty.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by LiYangpan on 2019-03-20  09:51.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */

@Getter
@Setter
@ToString
public class Message implements Serializable {

    public enum MSG_TYPE{
        login,

        text,

        error;
    }


    String id;

    MSG_TYPE msg_type;

    String content;

    int length;

}
