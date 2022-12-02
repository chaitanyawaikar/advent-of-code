package com.adventofcode.day1;

import com.adventofcode.util.FileReader;

import java.util.*;

import static com.adventofcode.util.constants.Constants.INPUT_FOLDER_PATH;

public class CalorieCounting {

    private final static String INPUT_FILE = INPUT_FOLDER_PATH + "day1";

    public long solve(String inputFile) {
        List<String> inputData = FileReader.readInputFile(inputFile);
        Map<Integer, Long> elfCalorieMapping = parseInputData(inputData);

        return getMaxCalorieCount(elfCalorieMapping);
    }

    private long getMaxCalorieCount(Map<Integer, Long> elfCalorieMapping) {
        return Collections.max(
                elfCalorieMapping.entrySet(),
                Comparator.comparingLong(Map.Entry::getValue)
        ).getValue();
    }

    private Map<Integer, Long> parseInputData(List<String> inputData) {
        Map<Integer, Long> elfCalorieMapping = new HashMap<>();
        int elfCount = 0;
        long totalCalories = 0;

        for (String calorieCount : inputData) {
            if (calorieCount.isEmpty()) {
                elfCalorieMapping.put(elfCount, totalCalories);
                totalCalories = 0;
                elfCount++;
                continue;
            }
            totalCalories = totalCalories + Long.parseLong(calorieCount);
        }
        return elfCalorieMapping;
    }

    public static void main(String[] args) {
        CalorieCounting calorieCounting = new CalorieCounting();

        System.out.println(calorieCounting.solve(INPUT_FILE));
    }
}
