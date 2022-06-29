package com.dpan.playingcard.analyzer;

import com.dpan.playingcard.entity.Card;

/**
 * 牌组分析器
 */
public class CardTypeAnalyzer implements AnalyseCardType {

    /**
     * 分析链条指向器
     */
    protected CardTypeAnalyzer chain;

    /**
     * 分析方法
     */
    protected AnalyseCardType analyseCardType;


    public CardTypeAnalyzer(CardTypeAnalyzer n) {
        chain = n;
    }

    public CardTypeAnalyzer(CardTypeAnalyzer n, AnalyseCardType a) {
        chain = n;
        analyseCardType = a;
    }

    /**
     * 分析牌组枚举
     *
     * @param cards
     * @param flags
     */
    @Override
    public void analyseCardType(Card[] cards, Long flags) {

        if (analyseCardType != null) {
            analyseCardType(cards, flags);
        }

        if (chain != null) {
            chain.analyseCardType(cards, flags);
        }
    }

    /**
     * 注册下个分析器
     *
     * @param c
     */
    public void register(CardTypeAnalyzer c) {
        if (chain == null) {
            chain = c;
        } else {
            chain.register(c);
        }
    }

}
