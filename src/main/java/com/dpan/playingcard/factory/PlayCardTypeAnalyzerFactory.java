package com.dpan.playingcard.factory;

import com.dpan.playingcard.analyzer.CardTypeAnalyzer;
import org.springframework.stereotype.Component;

/**
 * 牌组类型工厂
 */
@Component
public class PlayCardTypeAnalyzerFactory {

    protected CardTypeAnalyzer cardTypeAnalyzer = null;

    public PlayCardTypeAnalyzerFactory() {

//        cardTypeAnalyzer = getStraightAnalyzer();
//        cardTypeAnalyzer.register(getStraightAnalyzer());
//        cardTypeAnalyzer.register(getAABBAnalyzer()); //AABB
//        cardTypeAnalyzer.register(getAAAAnalyzer()); //AAA
//        cardTypeAnalyzer.register(getAAABAnalyzer()); //AAAB
//        cardTypeAnalyzer.register(getAAAAAnalyzer()); //AAAA
    }

    public PlayCardTypeAnalyzerFactory(CardTypeAnalyzer c) {
        cardTypeAnalyzer = c;
    }

    /**
     * 获取一个牌组分析器
     *
     * @return
     */
    public CardTypeAnalyzer getCardTypeAnalyzer() {
        return cardTypeAnalyzer;
    }

    /**
     * 生成顺子分析器
     *
     * @return
     */
    private CardTypeAnalyzer getStraightAnalyzer() {
        return null;
    }

    /**
     * 三不带
     *
     * @return
     */
    private CardTypeAnalyzer getAAAAnalyzer() {
        return null;
    }

    /**
     * 连对
     *
     * @return
     */
    private CardTypeAnalyzer getAABBAnalyzer() {
        return null;
    }

    /**
     * 三带一
     *
     * @return
     */
    private CardTypeAnalyzer getAAABAnalyzer() {
        return null;
    }


    /**
     * 生成炸弹分析器
     *
     * @return
     */
    private CardTypeAnalyzer getAAAAAnalyzer() {
        return null;
    }

}
