package com.dpan.playingcard.entity;


import com.dpan.playingcard.enums.GenderEnum;
import lombok.Data;

/**
 * 玩家
 */
@Data
public abstract class Player {

    public Player() {
        this("", GenderEnum.PRIMARY.getValue(), "");
    }

    public Player(String name) {
        this(name, GenderEnum.PRIMARY.getValue(), "");
    }

    public Player(String name, int gender, String p) {
        this.nickName = name;
        this.gender = gender;
        this.portrait = p;
    }

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别
     */
    private int gender;

    /**
     * 头像
     */
    private String portrait;
}
