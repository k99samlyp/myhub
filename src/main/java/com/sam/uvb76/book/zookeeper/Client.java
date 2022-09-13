package com.sam.uvb76.book.zookeeper;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author sam
 */
@Service
public class Client implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

    ClientWatcher clientWatcher = new ClientWatcher("Client watcher");

    @Override
    public void run() {

        try {
            ZooKeeper zk = new ZooKeeper("127.0.0.1:2181",6000,clientWatcher);
            clientWatcher.setZk(zk);
//            Stat stat = zk.exists("/uvb76", true);
//
//            byte[] bbb = zk.getData("/uvb76",clientWatcher,stat);
//            LOGGER.info(new String(bbb,StandardCharsets.UTF_8));


//            while (true){
//                Stat stat = zk.exists("/uvb76", true);
////                bbb = zk.getData("/uvb76",radioWatcher,stat);
////                LOGGER.info(new String(bbb,StandardCharsets.UTF_8));
//                Thread.sleep(1000);
//            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
