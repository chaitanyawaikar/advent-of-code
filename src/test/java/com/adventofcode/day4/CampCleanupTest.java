package com.adventofcode.day4;

import com.adventofcode.util.constants.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CampCleanupTest {

    private static final String FILE_NAME = "day4";

    @Test
    public void shouldReturnListOfAllInclusivePairs() {
        CampCleanup cleanup = new CampCleanup();
        String inputFile = Constants.TEST_FOLDER_PATH + FILE_NAME;
        long expectedNumberOfPairs = 2;

        long actualNumberOfPairs = cleanup.getTotalAssignmentPairs(inputFile);

        Assertions.assertEquals(expectedNumberOfPairs, actualNumberOfPairs);
    }
}