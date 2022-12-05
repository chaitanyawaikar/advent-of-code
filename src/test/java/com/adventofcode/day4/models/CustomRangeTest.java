package com.adventofcode.day4.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomRangeTest {

    @Test
    public void shouldTestTrueWhenCustomRangeIsInclusive() {
        CustomRange range1 = new CustomRange("2-5");
        CustomRange range2 = new CustomRange("1-7");

        Assertions.assertFalse(range1.containsRange(range2));
        Assertions.assertTrue(range2.containsRange(range1));
    }
}