package com.sam.uvb76.book.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sam
 */
public class RadioWatcher implements Watcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(RadioWatcher.class);

    private String watcherName;

    RadioWatcher(String name){
        this.watcherName = name;
    }


    @Override
    public void process(WatchedEvent watchedEvent) {
        LOGGER.info(this.watcherName + "watcher process");

        if (watchedEvent.getState().equals(Event.KeeperState.SyncConnected)){
            LOGGER.info(this.watcherName + "SyncConnected!!!!!");
        }

        if (watchedEvent.getType().equals(Event.EventType.NodeDataChanged)){
            try {
                LOGGER.info(this.watcherName + "NodeDataChanged!!!!!!");

            } catch (Exception e) {

                LOGGER.error("monitor node exception. " , e);
            }
        }

    }
}
