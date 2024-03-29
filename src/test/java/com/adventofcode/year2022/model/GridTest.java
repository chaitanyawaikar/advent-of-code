package com.adventofcode.year2022.model;

import com.adventofcode.year2022.day5.model.Grid;
import com.adventofcode.year2022.day5.utils.InputData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GridTest {

    @Test
    public void shouldParseAndExecuteMoveInstruction() {
        Grid grid = InputData.generateCustomGridInput();
        String moveInstruction = "move 1 from 2 to 1";
        boolean preserveOrder = false;

        // Before move instruction
        Assertions.assertEquals("RFQJBGLCS", grid.getTopCrateOfGrid());

        // After move instruction
        grid.executeMoveInstruction(moveInstruction, preserveOrder);
        Assertions.assertEquals("FSQJBGLCS", grid.getTopCrateOfGrid());
    }

    @Test
    public void shouldParseAndExecuteMoveInstructionByPreservingOrder() {
        Grid grid = InputData.generateCustomGridInput();
        boolean preserveOrder = true;

        // Before move instruction
        Assertions.assertEquals("RFQJBGLCS", grid.getTopCrateOfGrid());

        // After 1st move instruction
        grid.executeMoveInstruction("move 2 from 2 to 1", preserveOrder);
        Assertions.assertEquals("FLQJBGLCS", grid.getTopCrateOfGrid());
    }
}