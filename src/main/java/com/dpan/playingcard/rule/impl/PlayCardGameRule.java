package com.dpan.playingcard.rule.impl;

import com.dpan.playingcard.entity.PlayCard;
import com.dpan.playingcard.enums.PlayCardColorEnum;
import com.dpan.playingcard.rule.CardRule;

import java.util.*;

/**
 * 扑克牌规则
 */
public class PlayCardGameRule implements CardRule<PlayCard> {

    private final static int commonCardNum = 13;

    private final static int colorNum = 4;

    private final static int specialCardNum = 2;

    private final static String RedJoker = "RedJoker"; //大王

    private final static String BlackJoker = "BlackJoker"; //小王


    /**
     * 权重映射器
     */
    private static Map<String, Integer> weightMapper;

    /**
     * 权重反向映射器
     */
    private static Map<Integer, String> weightReverseMapper;

    static {
        weightMapper = new LinkedHashMap<>();
        weightReverseMapper = new LinkedHashMap<>();

        int i = 3;
        for (i = 3; i <= 9; i++) {
            weightMapper.put(Integer.toString(i), i);
            weightReverseMapper.put(i, Integer.toString(i));
        }

        weightReverseMapper.put(i, "J");
        weightMapper.put("J", i++);

        weightReverseMapper.put(i, "Q");
        weightMapper.put("Q", i++);

        weightReverseMapper.put(i, "K");
        weightMapper.put("K", i++);

        weightReverseMapper.put(i, "A");
        weightMapper.put("A", i++);

        weightReverseMapper.put(i, "2");
        weightMapper.put("2", i++);

        weightReverseMapper.put(i, BlackJoker);
        weightMapper.put(BlackJoker, i++);

        weightReverseMapper.put(i, RedJoker);
        weightMapper.put(RedJoker, i);
    }

    public PlayCardGameRule() {
    }


    @Override
    public List<PlayCard> generateCards() {
        List<PlayCard> cards = new ArrayList<>(getCardNum());

        //大小王
        cards.add(new PlayCard(weightMapper.get(RedJoker), PlayCardColorEnum.JOKER, RedJoker));
        cards.add(new PlayCard(weightMapper.get(BlackJoker), PlayCardColorEnum.JOKER, BlackJoker));

        for (int i = 3; i < weightMapper.get(BlackJoker); i++) {
            for (PlayCardColorEnum color : PlayCardColorEnum.values()) {
                if (color.getWeight() == PlayCardColorEnum.JOKER.getWeight()) {
                    break;
                }
                cards.add(new PlayCard(i, color, color.getChineseName() + weightReverseMapper.get(i)));
            }
        }
        return cards;
    }

    public int getCardNum() {
        return commonCardNum * colorNum + specialCardNum;
    }

    /**
     * 根据权重得知
     *
     * @param t 点数大小
     * @return
     */
    public static int applyNum(int t) {
        return t;
    }

    /**
     * @param c 花色
     * @return
     */
    public static int applyColor(int c) {
        return c;
    }


}
