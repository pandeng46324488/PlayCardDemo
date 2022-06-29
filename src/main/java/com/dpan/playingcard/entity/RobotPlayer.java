package com.dpan.playingcard.entity;

import com.dpan.playingcard.enums.GenderEnum;
import com.dpan.playingcard.utils.RandomUtils;
import lombok.Data;

import java.util.Date;

/**
 * 机器人
 */
@Data
public class RobotPlayer extends Player {

    public RobotPlayer() {
        super();
    }

    public RobotPlayer(String name) {
        this(name, GenderEnum.PRIMARY.getValue());
    }

    public RobotPlayer(String name, int gender) {
        this(name, gender, "");
    }

    public RobotPlayer(String name, int gender, String portrait) {
        super(name, gender, portrait);
        createTime = new Date();
        num = "R" + RandomUtils.randomStringNum(8, true);
    }

    /**
     * 编号
     */
    private String num;

    /**
     * 创建时间
     */
    private Date createTime;
}
