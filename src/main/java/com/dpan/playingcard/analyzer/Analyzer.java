package com.dpan.playingcard.analyzer;

import com.dpan.playingcard.entity.Player;

import java.util.List;

/**
 * 分析器
 */
public abstract class Analyzer {

    /**
     * 抽象分析方法
     *
     * @param cards   手牌
     * @param anybody 玩家
     * @param <T>
     * @param <V>
     * @return 返回分析结果
     */
    public <T, V> V analyse(List<T> cards, Player anybody) {
        return null;
    }

}
