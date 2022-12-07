package com.adventofcode.day5;

import com.adventofcode.day5.model.Grid;
import com.adventofcode.day5.utils.InputData;

import java.util.List;

public class SupplyStacks {

    public static void main(String[] args) {
        Grid grid = InputData.generateCustomGridInput();
        List<String> moveInstructions = InputData.getMoveInstructions();

        moveInstructions
                .stream()
                .forEach(grid::executeMoveInstruction);
        System.out.println(grid.getTopCrateOfGrid());
    }
}
