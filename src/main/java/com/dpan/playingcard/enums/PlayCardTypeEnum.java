package com.dpan.playingcard.enums;

/**
 * 牌组类型
 */
public enum PlayCardTypeEnum {

    Straight("顺子", 1),
    AA("对子", 2),
    AAA("三不带", 3),
    AAAB("三带一", 4),
    AAABB("三带二", 5),
    Bomb("炸弹", 6);

    /**
     * 位标记
     */
    private int weight;

    /**
     * 名称
     */
    private String name;

    PlayCardTypeEnum(String n, int w) {
        this.name = n;
        this.weight = 1 << w;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
