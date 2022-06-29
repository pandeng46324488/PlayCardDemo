package com.dpan.playingcard.rule.impl;

import com.dpan.playingcard.entity.Card;
import com.dpan.playingcard.rule.CardRule;
import com.dpan.playingcard.rule.GameRule;
import org.springframework.stereotype.Component;

/**
 * 卡牌游戏规则
 */
@Component
public class PlayerCardGameRule implements GameRule {


    @Override
    public int judge(Card[] a, Card[] b, CardRule cardRule) {

        return 0;
    }
}
