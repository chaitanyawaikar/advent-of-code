package com.adventofcode.day3;

import com.adventofcode.util.FileReader;
import org.assertj.core.util.VisibleForTesting;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.adventofcode.util.constants.Constants.INPUT_FOLDER_PATH;

public class RucksackReorganization {

    private final static String INPUT_FILE = INPUT_FOLDER_PATH + "day3";

    private long calculateSumOfPriorities(String inputFile) {
        List<String> inputData = FileReader.readInputFile(inputFile);

        return inputData
                .stream()
                .mapToLong(this::calculateItemPriority)
                .sum();
    }

    @VisibleForTesting
    long calculateItemPriority(String inputLine) {
        return getCommonItemFromRucksacks(inputLine)
                .chars()
                .map(c -> {
                    if (Character.isLowerCase(c)) return c - 'a' + 1;
                    else return c - 'A' + 27;
                })
                .sum();
    }

    @VisibleForTesting
    String getCommonItemFromRucksacks(String inputLine) {
        int midOfString = inputLine.length() / 2;
        HashSet<Character> resultSet = new HashSet<>();
        StringBuilder resultString = new StringBuilder();

        Set<Character> itemsFromFirstCompartment = IntStream
                .range(0, midOfString)
                .boxed()
                .map(inputLine::charAt)
                .collect(Collectors.toSet());

        IntStream
                .range(midOfString, inputLine.length())
                .boxed()
                .forEach(c -> {
                    char charAtIndex = inputLine.charAt(c);
                    if (itemsFromFirstCompartment.contains(charAtIndex))
                        resultSet.add(charAtIndex);
                });
        resultSet.forEach(resultString::append);
        return resultString.toString();
    }


    public static void main(String[] args) {
        RucksackReorganization calculator = new RucksackReorganization();
        long sum = calculator.calculateSumOfPriorities(INPUT_FILE);
        System.out.println(sum);
    }
}
