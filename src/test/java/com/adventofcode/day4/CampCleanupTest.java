package com.adventofcode.day4;

import com.adventofcode.utils.constants.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CampCleanupTest {

    private static final String FILE_NAME = "day4";
    private final CampCleanup cleanup = new CampCleanup();
    private final String inputFile = Constants.TEST_FOLDER_PATH + FILE_NAME;

    @Test
    public void shouldReturnNumberOfAllInclusivePairs() {
        long expectedNumberOfPairs = 2;

        long actualNumberOfPairs = cleanup.getTotalAllInclusivePairs(inputFile);

        Assertions.assertEquals(expectedNumberOfPairs, actualNumberOfPairs);
    }

    @Test
    public void shouldReturnNumberOfOverlappingPairs() {
        long expectedNumberOfPairs = 4;

        long actualNumberOfPairs = cleanup.getTotalOverlappingPairs(inputFile);

        Assertions.assertEquals(expectedNumberOfPairs, actualNumberOfPairs);
    }
}