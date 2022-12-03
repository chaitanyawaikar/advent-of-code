package com.adventofcode.day2.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EnumBehaviourTest {

    @Test
    public void shouldReturnCorrectValueOfEnumState() {
        Assertions.assertEquals(GameMove.ROCK.getScore(), 1);
        Assertions.assertEquals(GameMove.PAPER.getScore(), 2);
        Assertions.assertEquals(GameMove.SCISSOR.getScore(), 3);
    }

    @Test
    public void shouldReturnCorrectValueOfEnumGameOutcome() {
        Assertions.assertEquals(GameOutcome.LOST.getScore(), 0);
        Assertions.assertEquals(GameOutcome.DRAW.getScore(), 3);
        Assertions.assertEquals(GameOutcome.WON.getScore(), 6);
    }
}