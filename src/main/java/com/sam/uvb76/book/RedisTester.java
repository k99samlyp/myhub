package com.sam.uvb76.book;

import redis.clients.jedis.Jedis;

import java.util.Random;

public class RedisTester {

    public static void main(String[] args) throws Exception {

        Random random = new Random(90);

        Jedis ja = new Jedis("127.0.0.1",7100);

        while (true){
            ja.append(String.valueOf(System.currentTimeMillis()),String.valueOf(random.nextInt()));
            Thread.sleep(1000);

            


        }


    }
}
