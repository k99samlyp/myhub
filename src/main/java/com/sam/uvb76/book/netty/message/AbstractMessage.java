package com.sam.uvb76.book.netty.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by LiYangpan on 2019-03-20  09:51.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 * @author sam
 */

@Getter
@Setter
@ToString
public class AbstractMessage implements Serializable {

    String version = "1859-1";

    String id;

    int length;

    long time;

}
