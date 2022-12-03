package com.adventofcode.day2.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameMoveTest {

    @Test
    public void shouldReturnRockWhenPlayerMoveIsAorX() {
        Assertions.assertEquals(GameMove.fromString("A"), GameMove.ROCK);
        Assertions.assertEquals(GameMove.fromString("X"), GameMove.ROCK);
    }

    @Test
    public void shouldReturnPaperWhenPlayerMoveIsBorY() {
        Assertions.assertEquals(GameMove.fromString("B"), GameMove.PAPER);
        Assertions.assertEquals(GameMove.fromString("Y"), GameMove.PAPER);
    }

    @Test
    public void shouldReturnScissorWhenPlayerMoveIsCorZ() {
        Assertions.assertEquals(GameMove.fromString("C"), GameMove.SCISSOR);
        Assertions.assertEquals(GameMove.fromString("Z"), GameMove.SCISSOR);
    }

    @Test
    public void shouldThrowExceptionWhenIllegalCharacter() {
        String illegalCharacter = "a";
        String expectedErrorMessage = "Illegal move " + illegalCharacter;
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            GameMove.fromString(illegalCharacter);
        });

        Assertions.assertEquals(expectedErrorMessage, exception.getMessage());
    }
}