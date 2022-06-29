package com.dpan.playingcard.entity;

import com.dpan.playingcard.enums.PlayCardColorEnum;
import lombok.Data;

/**
 * 卡牌
 */
@Data
public abstract class Card implements Comparable<Card> {

    public Card() {

    }

    /**
     * @param weight   大小
     * @param fullName
     */
    public Card(int weight, String fullName) {
        this.weight = weight;
        this.fullName = fullName;
    }


    /**
     * 大小：3-10，11为J, 12为Q, 13为K, 14为A, 15为2, 16为大小王（根据花色分大小）
     */
    protected int weight;

    /**
     * 全名称
     */
    protected String fullName;


    @Override
    public int compareTo(Card card) {
        return this.weight - card.weight;
    }
}
