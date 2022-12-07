package com.adventofcode.day2;

import com.adventofcode.day2.models.GameMove;
import com.adventofcode.day2.models.GameOutcome;
import com.adventofcode.utils.FileReader;
import org.assertj.core.util.VisibleForTesting;

import java.util.List;

import static com.adventofcode.day2.models.GameMove.fromString;
import static com.adventofcode.utils.constants.Constants.BLANK_SPACE;
import static com.adventofcode.utils.constants.Constants.INPUT_FOLDER_PATH;

public class RockPaperScissor {

    private final static String INPUT_FILE = INPUT_FOLDER_PATH + "day2";

    public long getTotalScoreOfSecondPlayerPart1(String inputFile) {
        List<String> inputData = FileReader.readInputFile(inputFile);

        return inputData
                .stream()
                .mapToInt(this::getScoreFromPlayerMovesPart1)
                .sum();
    }

    @VisibleForTesting
    int getScoreFromPlayerMovesPart1(String inputLine) {
        int totalScore = 0;
        String[] playerMoves = inputLine.split(BLANK_SPACE);
        GameMove firstPlayerMove = fromString(playerMoves[0]);
        GameMove secondPlayerMove = fromString(playerMoves[1]);

        if (firstPlayerMove == secondPlayerMove)
            totalScore = firstPlayerMove.getScore() + GameOutcome.DRAW.getScore();
        else {
            if (firstPlayerMove.equals(GameMove.ROCK) && secondPlayerMove.equals(GameMove.SCISSOR)) {
                totalScore = secondPlayerMove.getScore() + GameOutcome.LOST.getScore();
            } else if (firstPlayerMove.equals(GameMove.ROCK) && secondPlayerMove.equals(GameMove.PAPER)) {
                totalScore = secondPlayerMove.getScore() + GameOutcome.WON.getScore();
            } else if (firstPlayerMove.equals(GameMove.PAPER) && secondPlayerMove.equals(GameMove.SCISSOR)) {
                totalScore = secondPlayerMove.getScore() + GameOutcome.WON.getScore();
            } else if (firstPlayerMove.equals(GameMove.PAPER) && secondPlayerMove.equals(GameMove.ROCK)) {
                totalScore = secondPlayerMove.getScore() + GameOutcome.LOST.getScore();
            } else if (firstPlayerMove.equals(GameMove.SCISSOR) && secondPlayerMove.equals(GameMove.ROCK)) {
                totalScore = secondPlayerMove.getScore() + GameOutcome.WON.getScore();
            } else if (firstPlayerMove.equals(GameMove.SCISSOR) && secondPlayerMove.equals(GameMove.PAPER)) {
                totalScore = secondPlayerMove.getScore() + GameOutcome.LOST.getScore();
            }
        }
        return totalScore;
    }

    public long getTotalScoreOfSecondPlayerPart2(String inputFile) {
        List<String> inputData = FileReader.readInputFile(inputFile);

        return inputData
                .stream()
                .mapToInt(this::getScoreFromPlayerMovesPart2)
                .sum();
    }

    @VisibleForTesting
    int getScoreFromPlayerMovesPart2(String inputLine) {
        int totalScore = 0;
        String[] playerMoveAndResult = inputLine.split(BLANK_SPACE);
        GameMove firstPlayerMove = fromString(playerMoveAndResult[0]);
        GameOutcome endResult = GameOutcome.fromString(playerMoveAndResult[1]);

        if (endResult == GameOutcome.DRAW) {
            totalScore = GameOutcome.DRAW.getScore() + firstPlayerMove.getScore();
        } else if (endResult == GameOutcome.WON) {
            if (firstPlayerMove == GameMove.ROCK)
                totalScore = GameOutcome.WON.getScore() + GameMove.PAPER.getScore();
            else if (firstPlayerMove == GameMove.PAPER)
                totalScore = GameOutcome.WON.getScore() + GameMove.SCISSOR.getScore();
            else if (firstPlayerMove == GameMove.SCISSOR)
                totalScore = GameOutcome.WON.getScore() + GameMove.ROCK.getScore();
        } else if (endResult == GameOutcome.LOST) {
            if (firstPlayerMove == GameMove.ROCK)
                totalScore = GameOutcome.LOST.getScore() + GameMove.SCISSOR.getScore();
            else if (firstPlayerMove == GameMove.PAPER)
                totalScore = GameOutcome.LOST.getScore() + GameMove.ROCK.getScore();
            else if (firstPlayerMove == GameMove.SCISSOR)
                totalScore = GameOutcome.LOST.getScore() + GameMove.PAPER.getScore();
        }
        return totalScore;
    }

    public static void main(String[] args) {
        RockPaperScissor rockPaperScissor = new RockPaperScissor();

        long resultPart1 = rockPaperScissor.getTotalScoreOfSecondPlayerPart1(INPUT_FILE);
        System.out.println(resultPart1);

        long resultPart2 = rockPaperScissor.getTotalScoreOfSecondPlayerPart2(INPUT_FILE);
        System.out.println(resultPart2);
    }
}
