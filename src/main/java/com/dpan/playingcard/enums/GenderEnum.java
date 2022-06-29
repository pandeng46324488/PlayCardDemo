package com.dpan.playingcard.enums;

/**
 * 性别
 */
public enum GenderEnum {

    MALE(1,"男"),
    FEMALE(2,"女"),
    PRIMARY(3,"保密");

    private int value;

    private String name;

    GenderEnum(int v, String n){
        this.value = v;
        this.name = n;
    }

    public int getValue(){
        return this.value;
    }

    public String getName() {
        return name;
    }
}
