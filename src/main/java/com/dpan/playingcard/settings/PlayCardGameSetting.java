package com.dpan.playingcard.settings;

import lombok.Data;

/**
 * 扑克牌游戏设置
 */
@Data
public class PlayCardGameSetting {

    private static PlayCardGameSetting defaultSettings = null;

    public PlayCardGameSetting() {

    }

    public static PlayCardGameSetting getInstance() {

        if (defaultSettings == null) {
            synchronized (PlayCardGameSetting.class) {
                if (defaultSettings == null) {
                    defaultSettings = new PlayCardGameSetting();
                    defaultSettings.allowSpreadSpan = 5L;
                    defaultSettings.spreadMultipleNum = 1;
                    defaultSettings.multipleUpper = 0;

                    defaultSettings.round = 6;
                    defaultSettings.standByTimeout = 20L;
                    defaultSettings.playerNumber = 3;
                }
            }
        }
        return defaultSettings;
    }

    /**
     * 局数
     */
    private int round;

    /**
     * 明牌思考时间（单位:秒）（为0则不允许明牌）
     */
    private Long allowSpreadSpan;

    /**
     * 明牌分数翻倍倍数
     */
    private double spreadMultipleNum;

    /**
     * 封顶倍数(0则不封顶）
     */
    private int multipleUpper;

    /**
     * 待时机长（超出则自动托管）（设置为0则不托管)
     */
    private Long standByTimeout;

    /**
     * 玩家数量
     */
    private Integer playerNumber;
}
