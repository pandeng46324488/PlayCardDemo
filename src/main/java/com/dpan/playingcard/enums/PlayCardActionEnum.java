package com.dpan.playingcard.enums;

/**
 * 扑克牌事件枚举
 */
public enum PlayCardActionEnum {

    GameInit(10001, "牌局初始化"),
    DealerInit(10011, "荷官初始化"),

    StartGame(30001, "开始牌局"),
    GameOver(3002, "牌局结束"),

    Play(50001, "玩家出牌"),
    Discard(50002, "玩家弃牌"),

    Opening(80001, "开局"),
    Ending(80004, "结局"),
    Shuffle(80012, "洗牌"),
    DealCards(8013, "发牌");


    private int value;

    private String name;

    PlayCardActionEnum(int v, String n) {
        this.value = v;
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
