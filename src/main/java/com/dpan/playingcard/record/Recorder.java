package com.dpan.playingcard.record;

import com.dpan.playingcard.event.Event;
import org.springframework.util.Assert;

import java.util.Collection;

/**
 * 记录器
 */
public class Recorder<A, U, D> {

    /**
     * 历史记录器
     */
    private Collection<Event<A, U, D>> history;

    /**
     * 添加记录
     *
     * @param event
     */
    public void addRecord(Event<A, U, D> event) {
        Assert.notNull(history, "未初始化历史记录器");
        history.add(event);
    }

    /**
     * 清理记录
     */
    public void clearRecord() {
        history = null;
    }

}
