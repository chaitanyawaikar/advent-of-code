package com.adventofcode.day5.model;

import com.adventofcode.day5.utils.InputData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Arrays.asList;

class GridTest {

    @Test
    public void shouldParseAndExecuteMoveInstruction() {
        Grid grid = InputData.generateCustomGridInput();
        String moveInstruction = "move 1 from 2 to 1";

        // Before move instruction
        Assertions.assertEquals("RFQJBGLCS", grid.getTopCrateOfGrid());

        // After move instruction
        grid.executeMoveInstruction(moveInstruction);
        Assertions.assertEquals("FSQJBGLCS", grid.getTopCrateOfGrid());
    }
}