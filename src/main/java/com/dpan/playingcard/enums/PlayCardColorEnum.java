package com.dpan.playingcard.enums;

import com.dpan.playingcard.entity.PlayCard;

/**
 * 花色枚举
 */
public enum PlayCardColorEnum {

    SPADE("spade", 4, "黑桃"),
    HEART("heart", 3, "红桃"),
    CLUB("club", 2, "梅花"),
    DIAMOND("spade", 1, "方块"),
    JOKER("joker", 5, "王");

    private int weight;

    private String fullName;

    private String chineseName;

    PlayCardColorEnum(String fullName, int weight, String chineseName) {
        this.chineseName = chineseName;
        this.fullName = fullName;
        this.weight = weight;
    }

    public String getFullName() {
        return fullName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public int getWeight() {
        return weight;
    }

    /**
     * 根据权重获取花色名称
     *
     * @param w
     * @return
     */
    public String getColorNameByWeight(int w) {
        PlayCardColorEnum color = getEnumByWeight(w);
        if (color != null) {
            return color.getChineseName();
        }
        return "";
    }

    /**
     * 根据权重获取枚举
     *
     * @param w
     * @return
     */
    public PlayCardColorEnum getEnumByWeight(int w) {
        for (PlayCardColorEnum color : PlayCardColorEnum.values()) {
            if (color.getWeight() == w) {
                return color;
            }
        }
        return null;
    }
}
