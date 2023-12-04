package com.adventofcode.year2023.day2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.adventofcode.year2023.day2.CubeConundrum.solvePart1;
import static com.adventofcode.year2023.day2.CubeConundrum.solvePart2;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CubeConundrumTest {

    @Test
    public void shouldReturnZeroForImpossibleGame() {
        // Given
        List<String> input = List.of("Game 1: 15 blue, 4 red; 1 red, 2 green, 6 blue; 2 green");
        long expectedOutput = 0;

        //When
        long result = solvePart1(input);

        // Then
        assertEquals(expectedOutput, result);
    }

    @Test
    public void shouldReturnTheGameIdForPossibleGame() {
        // Given
        List<String> input = List.of("Game 12: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green");
        long expectedOutput = 12;

        //When
        long result = solvePart1(input);

        // Then
        assertEquals(expectedOutput, result);
    }

    @Test
    public void shouldCalculateTheSumOfAllGameIdsForAllPossibleGame() {
        // Given
        List<String> input = List.of(
                "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green",
                "Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue",
                "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red",
                "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red",
                "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green"
        );
        long expectedOutput = 8;

        //When
        long result = solvePart1(input);

        // Then
        assertEquals(expectedOutput, result);
    }


    @Test
    public void shouldReturnProductForMinimumCubes() {
        // Given
        List<String> input = List.of("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green");
        long expectedOutput = 48;

        //When
        long result = solvePart2(input);

        // Then
        assertEquals(expectedOutput, result);
    }

    @Test
    public void shouldCalculateTheSumOfAllMinimumCubes() {
        // Given
        List<String> input = List.of(
                "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green",
                "Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue",
                "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red",
                "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red",
                "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green"
        );
        long expectedOutput = 2286;

        //When
        long result = solvePart2(input);

        // Then
        assertEquals(expectedOutput, result);
    }
}