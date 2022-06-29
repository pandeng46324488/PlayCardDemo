package com.dpan.playingcard.rule;

import com.dpan.playingcard.entity.Card;
import com.dpan.playingcard.rule.CardRule;

/**
 * 游戏规则
 */
public interface GameRule {

    /**
     * 判断给定两组牌组，a 小于 b 返回-1, a 等于 b返回0, a 大于 b 返回1
     *
     * @param a        牌组a
     * @param b        牌组b
     * @param cardRule 牌规则
     * @return
     */
    int judge(Card[] a, Card[] b, CardRule cardRule);
}
