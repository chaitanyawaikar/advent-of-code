package com.adventofcode.day2;

import com.adventofcode.day2.models.GameMove;
import com.adventofcode.day2.models.GameOutcome;
import com.adventofcode.util.constants.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class RockPaperScissorTest {

    private RockPaperScissor game = new RockPaperScissor();
    private static final String FILE_NAME = "day2";

    @Test
    public void shouldReturnDrawWhenBothPlayerMovesAreRock() {
        String inputLine = "A X";
        int expectedScore = GameOutcome.DRAW.getScore() + GameMove.ROCK.getScore();

        int scoreFromOutcome = game.getScoreFromOutcome(inputLine);

        Assertions.assertEquals(expectedScore, scoreFromOutcome);
    }

    @Test
    public void shouldReturnWinWhenFirstPlayerHasRockAndSecondPlayerHasPaper() {
        String inputLine = "A Y";
        int expectedScore = GameOutcome.WON.getScore() + GameMove.PAPER.getScore();

        int scoreFromOutcome = game.getScoreFromOutcome(inputLine);

        Assertions.assertEquals(expectedScore, scoreFromOutcome);
    }

    @Test
    public void shouldReturnWinWhenFirstPlayerHasScissorAndSecondPlayerHasRock() {
        String inputLine = "C X";
        int expectedScore = GameOutcome.WON.getScore() + GameMove.ROCK.getScore();

        int scoreFromOutcome = game.getScoreFromOutcome(inputLine);

        Assertions.assertEquals(expectedScore, scoreFromOutcome);
    }

    @Test
    public void shouldReturnLossWhenFirstPlayerHasScissorAndSecondPlayerHasPaper() {
        String inputLine = "C Y";
        int expectedScore = GameOutcome.LOST.getScore() + GameMove.PAPER.getScore();

        int scoreFromOutcome = game.getScoreFromOutcome(inputLine);

        Assertions.assertEquals(expectedScore, scoreFromOutcome);
    }

    @Test
    public void shouldReturnSumOfScoresOfAllGames() {
        String inputFile = Constants.TEST_FOLDER_PATH + FILE_NAME;

        long scoreFromOutcome = game.getTotalScoreOfSecondPlayer(inputFile);

        Assertions.assertEquals(15, scoreFromOutcome);
    }
}