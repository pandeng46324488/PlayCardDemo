package com.dpan.playingcard.event;

import java.util.Collection;
import java.util.Date;

/**
 * 事件
 */
public class Event<A,U,D> {

    /**
     * 发生时间
     */
    Date eventTime;


    /**
     * 事件主体
     */
    U actionMan;

    /**
     * 动作
     */
    A action;

    /**
     * 数据
     */
    Collection<D> data;
}
