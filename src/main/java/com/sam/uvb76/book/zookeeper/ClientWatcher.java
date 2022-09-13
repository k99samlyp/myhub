package com.sam.uvb76.book.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

/**
 * @author sam
 */
public class ClientWatcher implements Watcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientWatcher.class);

    private ZooKeeper zk;

    private String watcherName;

    ClientWatcher(String name){
        this.watcherName = name;
    }

    public ZooKeeper getZk() {
        return zk;
    }

    public void setZk(ZooKeeper zk) {
        this.zk = zk;
    }

    private Stat stat;

    @Override
    public void process(WatchedEvent watchedEvent) {
        LOGGER.info(this.watcherName + "client watcher process");
        try {
            stat = zk.exists("/uvb76", true);
            LOGGER.info("收到，先再次监听");
        } catch (Exception e) {
            LOGGER.error("monitor node exception. " , e);
        }

        if (watchedEvent.getState().equals(Event.KeeperState.SyncConnected)){
            LOGGER.info(this.watcherName + "SyncConnected!!!!!");
        }

        if (watchedEvent.getType().equals(Event.EventType.NodeDataChanged)){
            try {
                LOGGER.info(this.watcherName + "节点值变化了！");
                byte[] bbb = zk.getData("/uvb76",this,stat);
                LOGGER.info("当前版本：" + stat.getVersion() + "当前值：" +  new String(bbb, StandardCharsets.UTF_8));
//                LOGGER.info("再次监听");
//                stat = zk.exists("/uvb76", true);
            } catch (Exception e) {

                LOGGER.error("monitor node exception. " , e);
            }
        }

    }
}
