package com.adventofcode.day2;

import com.adventofcode.day2.models.GameMove;
import com.adventofcode.day2.models.GameOutcome;
import com.adventofcode.util.constants.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RockPaperScissorTest {

    private RockPaperScissor game = new RockPaperScissor();
    private static final String FILE_NAME = "day2";

    // Part 1 Tests
    @Test
    public void shouldReturnDrawWhenBothPlayerMovesAreRock() {
        String inputLine = "A X";
        int expectedScore = GameOutcome.DRAW.getScore() + GameMove.ROCK.getScore();

        int scoreFromOutcome = game.getScoreFromPlayerMovesPart1(inputLine);

        Assertions.assertEquals(expectedScore, scoreFromOutcome);
    }

    @Test
    public void shouldReturnWinWhenFirstPlayerHasRockAndSecondPlayerHasPaper() {
        String inputLine = "A Y";
        int expectedScore = GameOutcome.WON.getScore() + GameMove.PAPER.getScore();

        int scoreFromOutcome = game.getScoreFromPlayerMovesPart1(inputLine);

        Assertions.assertEquals(expectedScore, scoreFromOutcome);
    }

    @Test
    public void shouldReturnWinWhenFirstPlayerHasScissorAndSecondPlayerHasRock() {
        String inputLine = "C X";
        int expectedScore = GameOutcome.WON.getScore() + GameMove.ROCK.getScore();

        int scoreFromOutcome = game.getScoreFromPlayerMovesPart1(inputLine);

        Assertions.assertEquals(expectedScore, scoreFromOutcome);
    }

    @Test
    public void shouldReturnLossWhenFirstPlayerHasScissorAndSecondPlayerHasPaper() {
        String inputLine = "C Y";
        int expectedScore = GameOutcome.LOST.getScore() + GameMove.PAPER.getScore();

        int scoreFromOutcome = game.getScoreFromPlayerMovesPart1(inputLine);

        Assertions.assertEquals(expectedScore, scoreFromOutcome);
    }

    @Test
    public void shouldReturnSumOfScoresOfAllGames() {
        String inputFile = Constants.TEST_FOLDER_PATH + FILE_NAME;

        long scoreFromOutcome = game.getTotalScoreOfSecondPlayerPart1(inputFile);

        Assertions.assertEquals(15, scoreFromOutcome);
    }

    // Part 2 Tests
    @Test
    public void shouldReturnScore4BasedOnOutcomeAY() {
        String inputLine = "A Y";
        int expectedScore = GameOutcome.DRAW.getScore() + GameMove.ROCK.getScore();

        int scoreFromOutcome = game.getScoreFromPlayerMovesPart2(inputLine);

        Assertions.assertEquals(expectedScore, scoreFromOutcome);
    }

    @Test
    public void shouldReturnScore1BasedOnOutcomeBX() {
        String inputLine = "B X";
        int expectedScore = GameOutcome.LOST.getScore() + GameMove.ROCK.getScore();

        int scoreFromOutcome = game.getScoreFromPlayerMovesPart2(inputLine);

        Assertions.assertEquals(expectedScore, scoreFromOutcome);
    }

    @Test
    public void shouldReturnScore6BasedOnOutcomeCZ() {
        String inputLine = "C Z";
        int expectedScore = GameOutcome.WON.getScore() + GameMove.ROCK.getScore();

        int scoreFromOutcome = game.getScoreFromPlayerMovesPart2(inputLine);

        Assertions.assertEquals(expectedScore, scoreFromOutcome);
    }

    @Test
    public void shouldReturnSumOfScoresOfAllGamesPart2() {
        String inputFile = Constants.TEST_FOLDER_PATH + FILE_NAME;

        long scoreFromOutcome = game.getTotalScoreOfSecondPlayerPart2(inputFile);

        Assertions.assertEquals(12, scoreFromOutcome);
    }
}