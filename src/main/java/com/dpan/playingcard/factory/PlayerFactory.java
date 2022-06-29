package com.dpan.playingcard.factory;

import com.dpan.playingcard.entity.Player;
import com.dpan.playingcard.entity.RobotPlayer;
import com.dpan.playingcard.enums.GenderEnum;
import com.dpan.playingcard.utils.PersonNameUtils;
import com.dpan.playingcard.utils.RandomUtils;

import java.util.*;

/**
 * 玩家工厂
 */
public class PlayerFactory {


    public PlayerFactory() {
    }

    /**
     * 生成机器人
     *
     * @param num
     * @return
     */
    public static List<Player> generatePlayer(int num) {

        List<Player> person = new ArrayList<>(num);
        person.add(new RobotPlayer(PersonNameUtils.getChineseName(), RandomUtils.randomRangeNum(GenderEnum.MALE.getValue(), GenderEnum.PRIMARY.getValue() + 1)));
        person.add(new RobotPlayer(PersonNameUtils.getChineseName(), RandomUtils.randomRangeNum(GenderEnum.MALE.getValue(), GenderEnum.PRIMARY.getValue() + 1)));

        return person;
    }

}
