package com.adventofcode.day1;

import com.adventofcode.util.constants.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalorieCountingTest {

    private static final String FILE_NAME = "day1";

    @Test
    void shouldReturnSecondElfTotalCalories() {
        CalorieCounting calorieCounting = new CalorieCounting();
        String inputFile = Constants.TEST_FOLDER_PATH + FILE_NAME;

        long result = calorieCounting.solve(inputFile);

        Assertions.assertEquals(15, result);
    }
}