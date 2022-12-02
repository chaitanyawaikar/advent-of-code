package com.adventofcode.day1;

import com.adventofcode.util.FileReader;

import java.util.*;

import static com.adventofcode.util.constants.Constants.INPUT_FOLDER_PATH;
import static java.util.Collections.reverseOrder;

public class CalorieCounting {

    private final static String INPUT_FILE = INPUT_FOLDER_PATH + "day1";

    public long getMaxCalorieCountOfElve(String inputFile) {
        List<String> inputData = FileReader.readInputFile(inputFile);
        Map<Integer, Long> elfCalorieMapping = parseInputData(inputData);

        return Collections.max(
                elfCalorieMapping.entrySet(),
                Comparator.comparingLong(Map.Entry::getValue)
        ).getValue();
    }

    public long getSumOfCaloriesOfTopThreeElves(String inputFile) {
        List<String> inputData = FileReader.readInputFile(inputFile);
        Map<Integer, Long> elfCalorieMapping = parseInputData(inputData);

        return elfCalorieMapping
                .entrySet()
                .stream()
                .sorted(reverseOrder(Map.Entry.comparingByValue()))
                .limit(3)
                .mapToLong(Map.Entry::getValue)
                .sum();
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

        System.out.println(calorieCounting.getMaxCalorieCountOfElve(INPUT_FILE));
    }
}
