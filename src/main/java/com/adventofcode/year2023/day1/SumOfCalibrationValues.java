package com.adventofcode.year2023.day1;

import com.adventofcode.utils.FileReader;

import java.util.List;

public class SumOfCalibrationValues {

    public static final String INPUT_FOLDER_PATH = "./src/main/resources/inputfiles/";

    public static long calculate(List<String> input) {
        return input
                .stream()
                .map(SumOfCalibrationValues::getFirstAndLastDigitFromString)
                .reduce(0, Integer::sum);
    }

    static int getFirstAndLastDigitFromString(String input) {
        String digits = input.replaceAll("[a-zA-Z]", "");

        if (digits.length() == 1) {
            int digit = Integer.parseInt(digits);
            return digit + (digit * 10);
        } else {
            int firstDigit = Integer.parseInt(String.valueOf(digits.charAt(0)));
            int lastDigit = Integer.parseInt(String.valueOf(digits.charAt(digits.length() - 1)));
            return (firstDigit * 10) + lastDigit;
        }
    }

    public static void main(String[] args) {
        String inputFile = INPUT_FOLDER_PATH + "day1";
        List<String> inputData = FileReader.readInputFile(inputFile);
        System.out.println(calculate(inputData));
    }
}
