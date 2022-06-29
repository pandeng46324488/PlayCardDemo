package com.dpan.playingcard.rule;

import com.dpan.playingcard.entity.Card;

import java.util.Collection;

/**
 * 牌组规则
 */
public interface CardTypeRule {

    /**
     * 分析牌组
     *
     * @param cards
     * @param flags
     */
    void analyse(Collection<Card> cards, Long flags);
}
