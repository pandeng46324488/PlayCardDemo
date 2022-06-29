package com.dpan.playingcard;

import com.dpan.playingcard.entity.PlayCard;
import com.dpan.playingcard.rule.impl.PlayCardGameRule;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PlayingcardApplicationTests {

    @Test
    void contextLoads() {

        PlayCardGameRule p = new PlayCardGameRule();
        List<PlayCard> cards = p.generateCards();

        for (PlayCard c : cards) {
            System.out.println(c.getFullName());
        }
    }

}
