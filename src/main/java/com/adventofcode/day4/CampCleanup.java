package com.adventofcode.day4;

import com.adventofcode.day4.models.CustomRange;
import com.adventofcode.util.FileReader;

import java.util.List;

import static com.adventofcode.util.constants.Constants.COMMA_SEPARATOR;
import static com.adventofcode.util.constants.Constants.INPUT_FOLDER_PATH;

public class CampCleanup {

    private final static String INPUT_FILE = INPUT_FOLDER_PATH + "day4";

    public long getTotalAllInclusivePairs(String inputFile) {
        List<String> inputData = FileReader.readInputFile(inputFile);

        return inputData.stream().filter(x -> {
            String[] splitRangesByComma = x.split(COMMA_SEPARATOR);
            CustomRange range1 = new CustomRange(splitRangesByComma[0]);
            CustomRange range2 = new CustomRange(splitRangesByComma[1]);

            return range1.containsRange(range2) | range2.containsRange(range1);
        }).count();
    }

    public long getTotalOverlappingPairs(String inputFile) {
        List<String> inputData = FileReader.readInputFile(inputFile);

        return inputData.stream().filter(x -> {
            String[] splitRangesByComma = x.split(COMMA_SEPARATOR);
            CustomRange range1 = new CustomRange(splitRangesByComma[0]);
            CustomRange range2 = new CustomRange(splitRangesByComma[1]);

            return range1.isOverlapping(range2) || range2.isOverlapping(range1);
        }).count();
    }

    public static void main(String[] args) {
        CampCleanup cleanup = new CampCleanup();
        long totalAssignmentPairs = cleanup.getTotalOverlappingPairs(INPUT_FILE);
        System.out.println(totalAssignmentPairs);
    }
}
