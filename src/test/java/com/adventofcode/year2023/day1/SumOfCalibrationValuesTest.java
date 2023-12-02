package com.adventofcode.year2023.day1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.adventofcode.year2023.day1.SumOfCalibrationValues.calculate;
import static com.adventofcode.year2023.day1.SumOfCalibrationValues.getFirstAndLastDigitFromString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfCalibrationValuesTest {

    @Test
    public void shouldGetTheFirstAndLastDigitFromInput() {
        // Given
        String input = "1abc2";
        int expectedOutput = 12;

        //When
        int result = getFirstAndLastDigitFromString(input);

        // Then
        assertEquals(expectedOutput, result);
    }

    @Test
    public void shouldDuplicateTheDigitForSingleDigitInput() {
        // Given
        String input = "treb7uchet";
        int expectedOutput = 77;

        //When
        int result = getFirstAndLastDigitFromString(input);

        // Then
        assertEquals(expectedOutput, result);
    }

    @Test
    public void shouldCalculateTheSumOfAllInputs() {
        // Given
        List<String> input =
                List.of("1abc2",
                        "pqr3stu8vwx",
                        "a1b2c3d4e5f",
                        "treb7uchet");
        long expectedOutput = 142;

        //When
        long result = calculate(input);

        // Then
        assertEquals(expectedOutput, result);
    }
}