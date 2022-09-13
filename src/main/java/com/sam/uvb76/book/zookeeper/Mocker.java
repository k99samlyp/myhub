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
public class Mocker implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(Mocker.class);

    Watcher radioWatcher = new RadioWatcher("Mocker watcher");


    @Override
    public void run() {

        try {
            ZooKeeper zk = new ZooKeeper("127.0.0.1:2181",6000,radioWatcher);

            Stat stat = zk.exists("/uvb76", false);

            if (stat == null){
                zk.create("/uvb76","sam5".getBytes(StandardCharsets.UTF_8), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            }
            else {
                LOGGER.info("/uvb76节点已经存在！version：" + stat.getVersion());

                while (true){
                    try {
                        stat = zk.exists("/uvb76", false);
                        Stat stat2 = zk.setData("/uvb76",("sam" + System.currentTimeMillis()).getBytes(StandardCharsets.UTF_8),stat.getVersion());
                        LOGGER.info("写入完成   最新version：" + stat2.getVersion());

                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}
