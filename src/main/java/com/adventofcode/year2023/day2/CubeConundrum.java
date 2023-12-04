package com.adventofcode.year2023.day2;

import com.adventofcode.utils.FileReader;

import java.util.Arrays;
import java.util.List;

import static com.adventofcode.utils.constants.Constants.INPUT_FOLDER_PATH;
import static com.adventofcode.year2023.day2.CubesConfiguration.*;

public class CubeConundrum {

    public static int solvePart1(List<String> input) {
        return input.stream().filter(CubeConundrum::isGamePossible).map(game -> game.split(":")[0].split(" ")[1]).map(Integer::parseInt).reduce(0, Integer::sum);
    }

    public static long solvePart2(List<String> inputLines) {
        return inputLines.stream().map(line -> {
            long blue = 1;
            long red = 1;
            long green = 1;
            String[] games = line.split(":")[1].trim().split(";");
            for (String game : games) {
                for (String s : game.trim().split(",")) {
                    int i = Integer.parseInt(s.trim().split(" ")[0]);
                    String color = s.trim().split(" ")[1];
                    switch (color) {
                        case "red" -> {
                            if (i > red) {
                                red = i;
                            }
                        }
                        case "blue" -> {
                            if (i > blue) {
                                blue = i;
                            }
                        }
                        case "green" -> {
                            if (i > green) {
                                green = i;
                            }
                        }
                        default -> throw new IllegalStateException("Unknown color " + color);
                    }
                }
            }
            return red * blue * green;
        }).reduce(0L, Long::sum);
    }

    private static boolean isGamePossible(String game) {
        String gameDetails = game.split(":")[1].trim();
        String[] draws = gameDetails.split(";");

        return Arrays.stream(draws).flatMap(d -> Arrays.stream(d.trim().split(","))).noneMatch(CubeConundrum::isThresholdExceeded);
    }

    private static boolean isThresholdExceeded(String draw) {
        String[] split = draw.trim().split(" ");
        int number = Integer.parseInt(split[0]);

        return switch (split[1]) {
            case "red" -> number > MAX_RED_CUBES;
            case "blue" -> number > MAX_BLUE_CUBES;
            case "green" -> number > MAX_GREEN_CUBES;
            default -> throw new IllegalStateException("Unexpected value: " + split[1]);
        };
    }

    public static void main(String[] args) {
        String inputFile = INPUT_FOLDER_PATH + "day2";
        List<String> inputData = FileReader.readInputFile(inputFile);
        System.out.println(solvePart2(inputData));
    }
}
