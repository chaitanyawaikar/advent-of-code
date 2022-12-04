package com.adventofcode.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RucksackReorganizationTest {

    RucksackReorganization rucksackReorganization = new RucksackReorganization();

    @Test
    public void shouldReturnSingleCommonItem() {
        String inputString = "vJrwpWtwJgWrhcsFMMfFFhFp";
        String expectedCommonItem = "p";

        String commonItem = rucksackReorganization.getCommonItemFromRucksacks(inputString);

        assertEquals(expectedCommonItem, commonItem);
    }

    @Test
    public void shouldReturnBothCommonItems() {
        String inputString = "vJrwpWtwJgWrhcsFMMfFFrJp";
        String expectedCommonItem = "prJ";

        String commonItem = rucksackReorganization.getCommonItemFromRucksacks(inputString);

        assertEquals(expectedCommonItem, commonItem);
    }

    @Test
    public void shouldReturnCorrectPriorityOfInputString() {
        assertEquals(16, rucksackReorganization.calculateItemPriority("vJrwpWtwJgWrhcsFMMfFFhFp"));
        assertEquals(38, rucksackReorganization.calculateItemPriority("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"));
        assertEquals(42, rucksackReorganization.calculateItemPriority("PmmdzqPrVvPwwTWBwg"));
        assertEquals(22, rucksackReorganization.calculateItemPriority("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn"));
        assertEquals(20, rucksackReorganization.calculateItemPriority("ttgJtRGJQctTZtZT"));
        assertEquals(19, rucksackReorganization.calculateItemPriority("CrZsJsPPZsGzwwsLwLmpwMDw"));
    }
}