package com.dpan.playingcard.entity;

import com.dpan.playingcard.enums.PlayCardColorEnum;
import com.dpan.playingcard.enums.PlayCardTypeEnum;
import lombok.Data;

/**
 * 扑克牌
 */
@Data
public class PlayCard extends Card {

    /**
     * 花色： 4 黑桃  3 红桃， 2 梅花， 1 方块
     */
    protected PlayCardColorEnum color;

    /**
     * 默认卡牌规则
     */
    public PlayCard() {
        super();
    }

    /**
     * 构建函数
     *
     * @param color    花色
     * @param weight   权重
     * @param fullName 牌名称，比如“黑桃3"
     */
    public PlayCard(int weight, PlayCardColorEnum color, String fullName) {
        super(weight, fullName);
        this.color = color;
    }

    /**
     * 重写比较规则
     *
     * @param card
     * @return
     */
    @Override
    public int compareTo(Card card) {
        return this.weight - card.weight;
    }

}
