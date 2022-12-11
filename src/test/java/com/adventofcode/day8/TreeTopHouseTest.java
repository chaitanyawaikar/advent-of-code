package com.adventofcode.day8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TreeTopHouseTest {

    private TreeTopHouse treeTopHouse = new TreeTopHouse();

    @Test
    public void shouldCalculateVisibleTreesCorrectly() {
        int[][] grid = {
                {3, 0, 3, 7, 3},
                {2, 5, 5, 1, 2},
                {6, 5, 3, 3, 2},
                {3, 3, 5, 4, 9},
                {3, 5, 3, 9, 0}
        };
        int expectedVisibleTrees = 21;

        int actualVisibleTrees = treeTopHouse.calculateVisibleTreesFromOutside(grid);

        Assertions.assertEquals(expectedVisibleTrees, actualVisibleTrees);
    }

    @Test
    public void shouldCalculateTheMaxScenicScore() {
        int[][] grid = {
                {3, 0, 3, 7, 3},
                {2, 5, 5, 1, 2},
                {6, 5, 3, 3, 2},
                {3, 3, 5, 4, 9},
                {3, 5, 3, 9, 0}
        };
        long expectedScenicScore = 8;

        long actualScenicScore = treeTopHouse.calculateMaxScenicScore(grid);

        Assertions.assertEquals(expectedScenicScore, actualScenicScore);
    }
}