package com.dpan.playingcard.rule;

import com.dpan.playingcard.entity.Card;

import java.util.List;

/**
 * 卡牌规则
 */
public interface CardRule<T> {

    /**
     * 生成卡牌
     * @return
     */
    List<T> generateCards();

}
