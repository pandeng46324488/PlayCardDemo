package com.dpan.playingcard.controller;

import com.dpan.playingcard.entity.Steward;
import com.dpan.playingcard.factory.StewardFactory;
import com.dpan.playingcard.settings.PlayCardGameSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    StewardFactory stewardFactory;

    @RequestMapping("/index")
    public String index() {
        return "hello";
    }

    /**
     * 初始化
     */
    public void init() {

        Steward steward = stewardFactory.generateSteward(PlayCardGameSetting.getInstance());

        //初始化牌局
        steward.init();

        //开始游戏
        steward.startGame();

        return;
    }

    //机器人玩家
    public void robotPlayer() {
        return;
    }

    /**
     * 发牌
     */
    public void SplitCard() {


    }

}
