package com.dpan.playingcard.factory;

import com.dpan.playingcard.entity.PlayCard;
import com.dpan.playingcard.entity.Player;
import com.dpan.playingcard.entity.Steward;
import com.dpan.playingcard.enums.PlayCardActionEnum;
import com.dpan.playingcard.record.Recorder;
import com.dpan.playingcard.rule.impl.PlayCardGameRule;
import com.dpan.playingcard.settings.PlayCardGameSetting;
import org.springframework.stereotype.Component;

/**
 * 管家工厂
 */
@Component
public class StewardFactory {

    /**
     * 生成什么类型的管家？可能牌局规则不一样
     *
     * @return
     */
    public Steward generateSteward(PlayCardGameSetting setting) {

        Steward steward = new Steward(setting);

        //设置机器人
        steward.setPlayers(PlayerFactory.generatePlayer(setting.getPlayerNumber()));

        //设置牌池
        PlayCardGameRule playCardGameRule = new PlayCardGameRule();
        steward.setCardPool(playCardGameRule.generateCards());

        //设置事件记录器
        steward.setEventRecord(new Recorder<PlayCardActionEnum, Player, PlayCard>());

        return steward;
    }


}
