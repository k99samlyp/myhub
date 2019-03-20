package com.sam.uvb76.book.netty.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by LiYangpan on 2019-03-20  16:03.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */

@Getter
@Setter
@ToString
public class LoginMessage extends AbstractMessage {

    String username;

    String password;

    String token;
}
