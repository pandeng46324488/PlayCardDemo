package com.dpan.playingcard.entity;

import com.dpan.playingcard.enums.PlayCardActionEnum;
import com.dpan.playingcard.record.Recorder;
import com.dpan.playingcard.settings.PlayCardGameSetting;
import com.dpan.playingcard.utils.RandomUtils;
import lombok.Data;

import java.util.List;

/**
 * 管家
 * 记录事件和分数还有已出的牌
 */
@Data
public class Steward {

    /**
     * 设置
     */
    private PlayCardGameSetting gameSetting;

    /**
     * 玩家
     */
    private List<Player> players;

    /**
     * 事件记录器
     */
    private Recorder<PlayCardActionEnum, Player, PlayCard> eventRecord;

    public Steward(PlayCardGameSetting setting) {
        this.gameSetting = setting;
    }

    /**
     * 牌组
     */
    private List<PlayCard> cardPool;

    /**
     * 洗牌牌组
     */
    private int[] cardPos;

    /**
     * 预留牌
     */
    private int[] reservedCardPos;

    /**
     * 初始化
     */
    public void init() {
        cardPos = new int[cardPool.size()];
        reservedCardPos = new int[3];
        for (int i = 0; i < cardPos.length; i++) {
            cardPos[i] = i;
        }
    }

    /**
     * 开始游戏
     */
    public void startGame() {

    }

    /**
     *
     */
    public void ending() {

        //清理记录器
        eventRecord.clearRecord();

        //洗牌
        shuffle();
    }

    /**
     * 洗牌
     */
    private void shuffle() {
        for (int i = 0; i < cardPos.length; i++) {
            int pos = (int) Math.floor(Math.random() * i);
            int temp = cardPos[pos];
            cardPos[pos] = cardPos[i];
            cardPos[i] = temp;
        }
    }

    /**
     * 发牌
     */
    public void dealCards() {

//        //随机预留三个位置上的牌
//        for (int i = 0, j = cardPos.length / 3; i < reservedCardPos.length; i++) {
//            reservedCardPos[i] = cardPos[RandomUtils.randomRangeNum(j * i, j * i + j)];
//        }



    }

}
