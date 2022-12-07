package com.adventofcode.day5;

import com.adventofcode.day5.model.Grid;
import com.adventofcode.day5.utils.InputData;

import java.util.List;

public class SupplyStacks {

    public static void main(String[] args) {
        Grid grid = InputData.generateCustomGridInput();
        List<String> moveInstructions = InputData.getMoveInstructions();

        // Part 1
        moveInstructions
                .forEach(
                        moveInstruction ->
                                grid.executeMoveInstruction(moveInstruction, false)
                );
        System.out.println(grid.getTopCrateOfGrid());

        // Part 2
        moveInstructions
                .forEach(
                        moveInstruction ->
                                grid.executeMoveInstruction(moveInstruction, true)
                );
        System.out.println(grid.getTopCrateOfGrid());

    }
}
