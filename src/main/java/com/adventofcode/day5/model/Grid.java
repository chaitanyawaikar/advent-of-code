package com.adventofcode.day5.model;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Grid {

    private final Stack<Character> stack1;
    private final Stack<Character> stack2;
    private final Stack<Character> stack3;
    private final Stack<Character> stack4;
    private final Stack<Character> stack5;
    private final Stack<Character> stack6;
    private final Stack<Character> stack7;
    private final Stack<Character> stack8;
    private final Stack<Character> stack9;
    private final LinkedHashMap<Integer, Stack<Character>> mapping;

    public Grid(Stack<Character> stack1,
                Stack<Character> stack2,
                Stack<Character> stack3,
                Stack<Character> stack4,
                Stack<Character> stack5,
                Stack<Character> stack6,
                Stack<Character> stack7,
                Stack<Character> stack8,
                Stack<Character> stack9) {
        this.stack1 = stack1;
        this.stack2 = stack2;
        this.stack3 = stack3;
        this.stack4 = stack4;
        this.stack5 = stack5;
        this.stack6 = stack6;
        this.stack7 = stack7;
        this.stack8 = stack8;
        this.stack9 = stack9;
        mapping = new LinkedHashMap<>();
        mapping.put(1, stack1);
        mapping.put(2, stack2);
        mapping.put(3, stack3);
        mapping.put(4, stack4);
        mapping.put(5, stack5);
        mapping.put(6, stack6);
        mapping.put(7, stack7);
        mapping.put(8, stack8);
        mapping.put(9, stack9);
    }

    public void executeMoveInstruction(String moveInstruction, boolean preserveOrder) {
        Matcher matcher = Pattern.compile("\\d+").matcher(moveInstruction);
        Stack<Character> fromStack;
        Stack<Character> toStack;
        Stack<Character> temporaryStack = new Stack<>();
        int quantityToBeMoved;

        ArrayList<Integer> extractedIntegers = new ArrayList<>(3);
        while (matcher.find()) {
            extractedIntegers.add(Integer.parseInt(matcher.group()));
        }
        quantityToBeMoved = extractedIntegers.get(0);
        fromStack = mapping.get(extractedIntegers.get(1));
        toStack = mapping.get(extractedIntegers.get(2));

        if (preserveOrder) {
            int quantityToBeMoved1 = quantityToBeMoved;
            while (quantityToBeMoved1 > 0) {
                if (!fromStack.isEmpty()) {
                    temporaryStack.push(fromStack.pop());
                }
                quantityToBeMoved1--;
            }
            while (!temporaryStack.isEmpty()) {
                toStack.push(temporaryStack.pop());
            }
        } else {
            int quantityToBeMoved1 = quantityToBeMoved;
            while (quantityToBeMoved1 > 0) {
                if (!fromStack.isEmpty()) {
                    toStack.push(fromStack.pop());
                }
                quantityToBeMoved1--;
            }
        }
    }

    public String getTopCrateOfGrid() {
        StringBuilder sb = new StringBuilder("");
        IntStream
                .rangeClosed(1, 9)
                .forEach(stackNumber -> {
                    Stack<Character> characters = mapping.get(stackNumber);
                    if (!characters.isEmpty()) {
                        sb.append(characters.peek());
                    }
                });
        return sb.toString();
    }
}
