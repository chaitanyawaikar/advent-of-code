package com.adventofcode.year2022.day5.utils;

import com.adventofcode.year2022.day5.model.Grid;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static java.util.Arrays.asList;

public class InputData {

    // TODO :- Remove the hardcoded input data and parse it from file"
    public static Grid generateCustomGridInput() {
        Grid grid = new Grid(
                getStackFromList(asList('H', 'C', 'R')),
                getStackFromList(asList('B', 'J', 'H', 'L', 'S', 'F')),
                getStackFromList(asList('R', 'M', 'D', 'H', 'J', 'T', 'Q')),
                getStackFromList(asList('S', 'G', 'R', 'H', 'Z', 'B', 'J')),
                getStackFromList(asList('R', 'P', 'F', 'Z', 'T', 'D', 'C', 'B')),
                getStackFromList(asList('T', 'H', 'C', 'G')),
                getStackFromList(asList('S', 'N', 'V', 'Z', 'B', 'P', 'W', 'L')),
                getStackFromList(asList('R', 'J', 'Q', 'G', 'C')),
                getStackFromList(asList('L', 'D', 'T', 'R', 'H', 'P', 'F', 'S'))
        );
        return grid;
    }

    private static Stack<Character> getStackFromList(List<Character> elements) {
        Stack<Character> stack = new Stack<>();
        elements.forEach(stack::push);
        return stack;
    }

    // TODO :- Remove the hardcoded input data and parse it from file"
    public static List<String> getMoveInstructions() {
        return Arrays.asList(
                "move 8 from 7 to 1",
                "move 9 from 1 to 9",
                "move 4 from 5 to 4",
                "move 4 from 6 to 1",
                "move 3 from 8 to 5",
                "move 6 from 5 to 9",
                "move 1 from 5 to 1",
                "move 4 from 4 to 9",
                "move 7 from 3 to 7",
                "move 6 from 7 to 3",
                "move 1 from 8 to 7",
                "move 2 from 7 to 6",
                "move 1 from 8 to 9",
                "move 1 from 6 to 3",
                "move 4 from 3 to 5",
                "move 5 from 1 to 3",
                "move 1 from 1 to 8",
                "move 2 from 3 to 4",
                "move 1 from 4 to 1",
                "move 7 from 9 to 2",
                "move 1 from 6 to 3",
                "move 2 from 1 to 9",
                "move 20 from 9 to 7",
                "move 6 from 4 to 9",
                "move 1 from 2 to 9",
                "move 6 from 9 to 4",
                "move 1 from 4 to 6",
                "move 1 from 8 to 6",
                "move 1 from 4 to 7",
                "move 5 from 2 to 3",
                "move 2 from 6 to 4",
                "move 3 from 9 to 5",
                "move 5 from 3 to 5",
                "move 3 from 3 to 8",
                "move 3 from 5 to 6",
                "move 1 from 9 to 8",
                "move 5 from 4 to 5",
                "move 3 from 4 to 9",
                "move 1 from 8 to 2",
                "move 2 from 8 to 2",
                "move 11 from 5 to 6",
                "move 16 from 7 to 1",
                "move 2 from 1 to 7",
                "move 14 from 6 to 1",
                "move 11 from 1 to 6",
                "move 2 from 1 to 4",
                "move 4 from 3 to 4",
                "move 9 from 2 to 4",
                "move 2 from 4 to 8",
                "move 2 from 5 to 3",
                "move 9 from 4 to 7",
                "move 2 from 3 to 2",
                "move 1 from 2 to 7",
                "move 1 from 8 to 4",
                "move 4 from 1 to 4",
                "move 1 from 9 to 1",
                "move 7 from 4 to 7",
                "move 2 from 6 to 5",
                "move 1 from 8 to 6",
                "move 1 from 4 to 2",
                "move 10 from 1 to 6",
                "move 5 from 7 to 3",
                "move 1 from 4 to 7",
                "move 2 from 1 to 2",
                "move 2 from 2 to 4",
                "move 4 from 3 to 4",
                "move 18 from 7 to 6",
                "move 6 from 6 to 4",
                "move 1 from 7 to 4",
                "move 1 from 7 to 6",
                "move 11 from 4 to 5",
                "move 14 from 5 to 9",
                "move 1 from 8 to 7",
                "move 8 from 6 to 2",
                "move 2 from 4 to 5",
                "move 7 from 9 to 1",
                "move 6 from 9 to 7",
                "move 5 from 1 to 8",
                "move 1 from 3 to 6",
                "move 10 from 6 to 3",
                "move 1 from 9 to 6",
                "move 1 from 5 to 4",
                "move 4 from 3 to 8",
                "move 1 from 5 to 9",
                "move 9 from 2 to 3",
                "move 1 from 9 to 5",
                "move 4 from 8 to 4",
                "move 1 from 5 to 3",
                "move 5 from 8 to 7",
                "move 5 from 7 to 2",
                "move 3 from 4 to 1",
                "move 8 from 6 to 5",
                "move 1 from 7 to 9",
                "move 4 from 1 to 3",
                "move 2 from 4 to 6",
                "move 5 from 5 to 2",
                "move 4 from 6 to 9",
                "move 1 from 1 to 2",
                "move 1 from 5 to 6",
                "move 7 from 2 to 8",
                "move 5 from 6 to 8",
                "move 4 from 7 to 9",
                "move 15 from 3 to 9",
                "move 1 from 7 to 3",
                "move 1 from 5 to 3",
                "move 6 from 2 to 6",
                "move 1 from 5 to 2",
                "move 2 from 3 to 9",
                "move 1 from 6 to 8",
                "move 5 from 8 to 9",
                "move 2 from 3 to 8",
                "move 3 from 3 to 6",
                "move 11 from 9 to 4",
                "move 1 from 2 to 1",
                "move 2 from 8 to 4",
                "move 1 from 1 to 4",
                "move 7 from 4 to 7",
                "move 9 from 6 to 3",
                "move 4 from 7 to 8",
                "move 4 from 7 to 6",
                "move 19 from 9 to 4",
                "move 7 from 8 to 5",
                "move 5 from 3 to 6",
                "move 6 from 6 to 9",
                "move 3 from 3 to 5",
                "move 1 from 3 to 9",
                "move 8 from 4 to 5",
                "move 2 from 9 to 6",
                "move 3 from 8 to 2",
                "move 1 from 8 to 4",
                "move 1 from 2 to 5",
                "move 19 from 4 to 1",
                "move 2 from 5 to 7",
                "move 2 from 2 to 4",
                "move 13 from 5 to 2",
                "move 1 from 5 to 1",
                "move 2 from 6 to 9",
                "move 1 from 8 to 7",
                "move 9 from 9 to 3",
                "move 2 from 3 to 8",
                "move 1 from 4 to 2",
                "move 5 from 6 to 7",
                "move 1 from 4 to 6",
                "move 2 from 8 to 7",
                "move 7 from 1 to 5",
                "move 1 from 6 to 7",
                "move 10 from 1 to 8",
                "move 1 from 1 to 3",
                "move 1 from 1 to 2",
                "move 6 from 5 to 3",
                "move 4 from 5 to 3",
                "move 5 from 7 to 1",
                "move 3 from 1 to 2",
                "move 4 from 7 to 5",
                "move 8 from 3 to 6",
                "move 2 from 1 to 7",
                "move 4 from 5 to 8",
                "move 7 from 3 to 5",
                "move 3 from 7 to 2",
                "move 1 from 7 to 3",
                "move 12 from 2 to 8",
                "move 23 from 8 to 2",
                "move 16 from 2 to 6",
                "move 1 from 9 to 6",
                "move 7 from 5 to 7",
                "move 7 from 2 to 4",
                "move 2 from 3 to 8",
                "move 1 from 1 to 9",
                "move 5 from 8 to 1",
                "move 2 from 3 to 9",
                "move 2 from 7 to 1",
                "move 4 from 1 to 3",
                "move 4 from 7 to 2",
                "move 2 from 1 to 4",
                "move 11 from 2 to 9",
                "move 3 from 3 to 4",
                "move 1 from 9 to 1",
                "move 2 from 2 to 7",
                "move 4 from 4 to 8",
                "move 2 from 9 to 5",
                "move 2 from 5 to 7",
                "move 4 from 4 to 6",
                "move 1 from 3 to 8",
                "move 1 from 9 to 8",
                "move 4 from 4 to 2",
                "move 2 from 1 to 3",
                "move 1 from 8 to 4",
                "move 2 from 3 to 5",
                "move 3 from 9 to 7",
                "move 2 from 8 to 9",
                "move 1 from 9 to 6",
                "move 2 from 7 to 3",
                "move 2 from 8 to 1",
                "move 1 from 4 to 9",
                "move 18 from 6 to 2",
                "move 1 from 6 to 5",
                "move 1 from 5 to 9",
                "move 18 from 2 to 3",
                "move 1 from 8 to 7",
                "move 2 from 5 to 9",
                "move 1 from 1 to 4",
                "move 3 from 2 to 1",
                "move 9 from 9 to 4",
                "move 7 from 4 to 6",
                "move 2 from 7 to 3",
                "move 2 from 4 to 9",
                "move 7 from 6 to 7",
                "move 3 from 7 to 2",
                "move 7 from 6 to 3",
                "move 2 from 6 to 9",
                "move 24 from 3 to 9",
                "move 2 from 6 to 8",
                "move 1 from 4 to 2",
                "move 2 from 8 to 5",
                "move 31 from 9 to 3",
                "move 6 from 7 to 4",
                "move 35 from 3 to 7",
                "move 1 from 1 to 8",
                "move 1 from 5 to 7",
                "move 1 from 5 to 4",
                "move 1 from 3 to 9",
                "move 1 from 8 to 2",
                "move 3 from 1 to 7",
                "move 7 from 4 to 5",
                "move 1 from 9 to 8",
                "move 4 from 5 to 6",
                "move 2 from 5 to 2",
                "move 6 from 2 to 5",
                "move 2 from 5 to 7",
                "move 2 from 2 to 1",
                "move 2 from 5 to 4",
                "move 1 from 8 to 4",
                "move 3 from 4 to 6",
                "move 4 from 6 to 7",
                "move 1 from 5 to 2",
                "move 2 from 6 to 9",
                "move 1 from 6 to 4",
                "move 1 from 4 to 8",
                "move 2 from 9 to 6",
                "move 1 from 8 to 9",
                "move 34 from 7 to 9",
                "move 6 from 7 to 3",
                "move 1 from 7 to 2",
                "move 1 from 5 to 8",
                "move 1 from 8 to 6",
                "move 6 from 7 to 4",
                "move 1 from 7 to 3",
                "move 7 from 3 to 5",
                "move 6 from 4 to 6",
                "move 31 from 9 to 1",
                "move 3 from 5 to 7",
                "move 24 from 1 to 3",
                "move 1 from 2 to 4",
                "move 3 from 9 to 1",
                "move 14 from 3 to 5",
                "move 1 from 4 to 3",
                "move 1 from 9 to 7",
                "move 8 from 3 to 7",
                "move 1 from 2 to 9",
                "move 7 from 1 to 5",
                "move 3 from 6 to 8",
                "move 3 from 6 to 1",
                "move 1 from 1 to 3",
                "move 4 from 3 to 2",
                "move 4 from 2 to 3",
                "move 2 from 5 to 1",
                "move 9 from 7 to 4",
                "move 1 from 6 to 5",
                "move 1 from 1 to 7",
                "move 3 from 8 to 9",
                "move 5 from 4 to 2",
                "move 3 from 2 to 3",
                "move 1 from 2 to 3",
                "move 2 from 4 to 1",
                "move 2 from 9 to 4",
                "move 1 from 9 to 3",
                "move 1 from 6 to 1",
                "move 1 from 9 to 6",
                "move 25 from 5 to 4",
                "move 4 from 1 to 9",
                "move 2 from 3 to 7",
                "move 2 from 6 to 9",
                "move 2 from 9 to 5",
                "move 6 from 7 to 1",
                "move 5 from 3 to 6",
                "move 10 from 4 to 3",
                "move 10 from 4 to 8",
                "move 2 from 4 to 2",
                "move 5 from 1 to 9",
                "move 2 from 6 to 4",
                "move 6 from 9 to 6",
                "move 7 from 6 to 4",
                "move 3 from 9 to 4",
                "move 3 from 2 to 4",
                "move 4 from 3 to 8",
                "move 2 from 5 to 3",
                "move 10 from 4 to 9",
                "move 4 from 9 to 7",
                "move 5 from 9 to 5",
                "move 4 from 5 to 1",
                "move 9 from 4 to 6",
                "move 10 from 1 to 3",
                "move 1 from 5 to 4",
                "move 3 from 4 to 5",
                "move 2 from 5 to 7",
                "move 1 from 7 to 3",
                "move 1 from 6 to 9",
                "move 11 from 8 to 6",
                "move 14 from 6 to 5",
                "move 1 from 4 to 7",
                "move 7 from 5 to 3",
                "move 3 from 5 to 4",
                "move 2 from 9 to 5",
                "move 2 from 4 to 3",
                "move 2 from 7 to 4",
                "move 11 from 3 to 9",
                "move 2 from 8 to 2",
                "move 2 from 2 to 3",
                "move 1 from 8 to 2",
                "move 1 from 2 to 9",
                "move 3 from 4 to 5",
                "move 2 from 6 to 9",
                "move 1 from 1 to 8",
                "move 10 from 9 to 7",
                "move 2 from 9 to 3",
                "move 23 from 3 to 9",
                "move 4 from 6 to 4",
                "move 9 from 5 to 6",
                "move 1 from 5 to 3",
                "move 5 from 6 to 7",
                "move 1 from 1 to 7",
                "move 1 from 3 to 9",
                "move 4 from 6 to 7",
                "move 1 from 8 to 7",
                "move 1 from 7 to 5",
                "move 1 from 5 to 1",
                "move 12 from 7 to 6",
                "move 9 from 9 to 3",
                "move 6 from 6 to 4",
                "move 8 from 7 to 3",
                "move 3 from 7 to 4",
                "move 6 from 3 to 1",
                "move 10 from 4 to 8",
                "move 10 from 8 to 7",
                "move 2 from 3 to 7",
                "move 9 from 3 to 8",
                "move 2 from 6 to 3",
                "move 10 from 7 to 1",
                "move 3 from 4 to 6",
                "move 5 from 8 to 5",
                "move 3 from 5 to 7",
                "move 1 from 3 to 2",
                "move 1 from 2 to 6",
                "move 6 from 9 to 1",
                "move 12 from 1 to 3",
                "move 3 from 6 to 9",
                "move 3 from 1 to 7",
                "move 1 from 3 to 2",
                "move 7 from 1 to 7",
                "move 1 from 2 to 7",
                "move 2 from 6 to 4",
                "move 1 from 4 to 5",
                "move 3 from 8 to 7",
                "move 2 from 6 to 3",
                "move 2 from 6 to 1",
                "move 1 from 3 to 8",
                "move 5 from 3 to 4",
                "move 2 from 8 to 5",
                "move 14 from 7 to 4",
                "move 1 from 3 to 2",
                "move 1 from 3 to 7",
                "move 7 from 7 to 4",
                "move 2 from 5 to 3",
                "move 2 from 1 to 4",
                "move 9 from 4 to 6",
                "move 1 from 1 to 2",
                "move 4 from 9 to 4",
                "move 8 from 9 to 3",
                "move 2 from 2 to 7",
                "move 13 from 4 to 8",
                "move 4 from 4 to 1",
                "move 2 from 7 to 6",
                "move 12 from 3 to 2",
                "move 11 from 2 to 9",
                "move 6 from 4 to 9",
                "move 18 from 9 to 4",
                "move 2 from 1 to 6",
                "move 6 from 8 to 1",
                "move 13 from 6 to 5",
                "move 8 from 4 to 5",
                "move 1 from 2 to 9",
                "move 8 from 1 to 4",
                "move 7 from 4 to 8",
                "move 4 from 3 to 5",
                "move 10 from 8 to 5",
                "move 13 from 5 to 8",
                "move 12 from 4 to 5",
                "move 2 from 9 to 8",
                "move 29 from 5 to 9",
                "move 24 from 9 to 2",
                "move 23 from 2 to 4",
                "move 5 from 9 to 2",
                "move 7 from 5 to 7",
                "move 1 from 5 to 1",
                "move 7 from 4 to 8",
                "move 14 from 8 to 1",
                "move 5 from 2 to 6",
                "move 16 from 4 to 7",
                "move 8 from 1 to 6",
                "move 1 from 2 to 8",
                "move 20 from 7 to 6",
                "move 11 from 6 to 4",
                "move 3 from 1 to 5",
                "move 3 from 4 to 3",
                "move 8 from 4 to 9",
                "move 8 from 6 to 1",
                "move 2 from 1 to 4",
                "move 3 from 5 to 2",
                "move 12 from 8 to 2",
                "move 1 from 7 to 1",
                "move 1 from 3 to 5",
                "move 1 from 7 to 8",
                "move 1 from 7 to 3",
                "move 12 from 2 to 8",
                "move 13 from 6 to 4",
                "move 2 from 1 to 9",
                "move 3 from 2 to 6",
                "move 3 from 9 to 7",
                "move 5 from 9 to 1",
                "move 4 from 6 to 4",
                "move 2 from 3 to 6",
                "move 1 from 5 to 9",
                "move 1 from 6 to 7",
                "move 9 from 1 to 5",
                "move 11 from 8 to 3",
                "move 1 from 6 to 8",
                "move 3 from 7 to 1",
                "move 1 from 8 to 7",
                "move 2 from 8 to 9",
                "move 7 from 1 to 2",
                "move 17 from 4 to 7",
                "move 1 from 8 to 6",
                "move 4 from 7 to 2",
                "move 4 from 9 to 7",
                "move 4 from 2 to 3",
                "move 1 from 1 to 4",
                "move 2 from 4 to 3",
                "move 9 from 5 to 4",
                "move 1 from 6 to 8",
                "move 6 from 2 to 1",
                "move 5 from 1 to 9",
                "move 9 from 4 to 3",
                "move 1 from 4 to 6",
                "move 2 from 9 to 7",
                "move 1 from 1 to 5",
                "move 1 from 2 to 7",
                "move 1 from 8 to 9",
                "move 1 from 6 to 8",
                "move 1 from 5 to 4",
                "move 1 from 8 to 7",
                "move 23 from 3 to 7",
                "move 36 from 7 to 6",
                "move 33 from 6 to 1",
                "move 1 from 4 to 8",
                "move 7 from 1 to 5",
                "move 1 from 8 to 1",
                "move 3 from 7 to 2",
                "move 24 from 1 to 3",
                "move 7 from 7 to 3",
                "move 3 from 5 to 1",
                "move 4 from 5 to 3",
                "move 1 from 9 to 8",
                "move 2 from 9 to 6",
                "move 1 from 8 to 5",
                "move 3 from 2 to 5",
                "move 30 from 3 to 5",
                "move 1 from 6 to 7",
                "move 6 from 1 to 8",
                "move 7 from 3 to 2",
                "move 1 from 7 to 5",
                "move 2 from 3 to 2",
                "move 2 from 6 to 8",
                "move 1 from 6 to 1",
                "move 7 from 5 to 8",
                "move 8 from 8 to 7",
                "move 20 from 5 to 8",
                "move 2 from 9 to 7",
                "move 8 from 2 to 1",
                "move 7 from 7 to 3",
                "move 1 from 2 to 1",
                "move 3 from 7 to 9",
                "move 4 from 8 to 3",
                "move 5 from 5 to 6",
                "move 1 from 5 to 9",
                "move 4 from 9 to 4",
                "move 1 from 5 to 9",
                "move 2 from 3 to 6",
                "move 1 from 5 to 8",
                "move 7 from 6 to 3",
                "move 1 from 4 to 1",
                "move 7 from 3 to 2",
                "move 3 from 3 to 5",
                "move 2 from 4 to 7"
        );
    }
}