package com.dpan.playingcard.rule.impl;

import com.dpan.playingcard.entity.Card;
import com.dpan.playingcard.rule.CardTypeRule;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 连对规则
 */
@Service
public class PairsRuleImpl implements CardTypeRule {

    /**
     * 连对
     *
     * @param cards
     * @param flags
     */
    @Override
    public void analyse(Collection<Card> cards, Long flags) {

        //必须要求是偶数对
        if (cards == null || cards.size() < 2 || cards.size() % 2 != 0) {
            return;
        }

        //根据大小分组
        Map<Integer, List<Card>> nums = cards.stream().collect(Collectors.groupingBy(Card::getWeight));

        //
    }
}
