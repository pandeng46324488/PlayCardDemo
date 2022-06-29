package com.dpan.playingcard.analyzer;

import com.dpan.playingcard.entity.Card;

/**
 * 分析牌组动作
 */
public interface AnalyseCardType {

    /**
     * 分析牌组枚举
     *
     * @param cards
     * @param flags
     */
    void analyseCardType(Card[] cards, Long flags);
}
