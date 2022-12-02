package com.adventofcode.util;

import com.adventofcode.day1.CalorieCounting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReader {

    private final static Logger LOGGER = Logger.getLogger(CalorieCounting.class.getName());

    public static List<String> readInputFile(String inputFile) {
        try {
            return Files.readAllLines(Paths.get(inputFile));
        } catch (IOException e) {
            LOGGER.log(
                    Level.WARNING,
                    String.format("Error parsing file %s. Error message is %s", inputFile, e.toString())
            );
        }
        return List.of();
    }
}
