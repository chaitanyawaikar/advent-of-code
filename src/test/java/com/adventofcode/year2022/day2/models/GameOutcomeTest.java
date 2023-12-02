package com.adventofcode.year2022.day2.models;

import com.adventofcode.year2022.day2.models.GameOutcome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameOutcomeTest {

    @Test
    public void shouldReturnLostWhenGameOutcomeIsX() {
        Assertions.assertEquals(GameOutcome.fromString("X"), GameOutcome.LOST);
    }

    @Test
    public void shouldReturnDrawWhenGameOutcomeIsY() {
        Assertions.assertEquals(GameOutcome.fromString("Y"), GameOutcome.DRAW);
    }

    @Test
    public void shouldReturnWinWhenGameOutcomeIsZ() {
        Assertions.assertEquals(GameOutcome.fromString("Z"), GameOutcome.WON);
    }

    @Test
    public void shouldThrowExceptionWhenIllegalCharacter() {
        String illegalCharacter = "a";
        String expectedErrorMessage = "Illegal outcome " + illegalCharacter;
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> GameOutcome.fromString(illegalCharacter));

        Assertions.assertEquals(expectedErrorMessage, exception.getMessage());
    }
}