package com.adventofcode.day8;

import com.adventofcode.utils.FileReader;

import java.util.List;

import static com.adventofcode.day8.GridVisibility.*;
import static com.adventofcode.utils.constants.Constants.INPUT_FOLDER_PATH;

public class TreeTopHouse {

    private int[][] parseInput(List<String> inputFile) {
        int numOfRows = inputFile.size();
        int numOfColumns = inputFile.get(0).length();
        int[][] grid = new int[numOfRows][numOfColumns];

        for (int i = 0; i < inputFile.size(); i++) {
            String chars = inputFile.get(i);
            int[] rowArray = new int[chars.length()];

            for (int j = 0; j < chars.length(); j++) {
                rowArray[j] = Integer.parseInt(chars.charAt(j) + "");
            }
            grid[i] = rowArray;
        }
        return grid;
    }

    // Part 1
    public int calculateVisibleTreesFromOutside(int[][] grid) {
        int result = 0;
        int rows = grid.length;
        int columns = grid[0].length;

        // Edges
        result = result + 2 * ((grid.length - 2) + grid[0].length);

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < columns - 1; j++) {
                if (isTreeVisible(grid, i, j)) result++;
            }
        }
        return result;
    }

    // Part 2
    public long calculateMaxScenicScore(int[][] grid) {
        long max;
        long maxSoFar = Integer.MIN_VALUE;
        int rows = grid.length;
        int columns = grid[0].length;

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < columns - 1; j++) {
                max = scenicScoreForCurrentPosition(grid, i, j);
                if (max > maxSoFar) maxSoFar = max;
            }
        }
        return maxSoFar;
    }

    private long scenicScoreForCurrentPosition(int[][] grid, int row, int column) {
        int elementFromGrid = grid[row][column];
        int topScenicScore = scenicScoreFromTop(grid, row, column, elementFromGrid);
        int bottomScenicScore = scenicScoreFromBottom(grid, row, column, elementFromGrid);
        int leftScenicScore = scenicScoreFromLeft(grid, row, column, elementFromGrid);
        int rightScenicScore = scenicScoreFromRight(grid, row, column, elementFromGrid);
        return (long) topScenicScore * bottomScenicScore * leftScenicScore * rightScenicScore;
    }

    private boolean isTreeVisible(int[][] grid, int row, int column) {
        int elementFromGrid = grid[row][column];
        boolean top = isVisibleFromTop(grid, row, column, elementFromGrid);
        boolean bottom = isVisibleFromBottom(grid, row, column, elementFromGrid);
        boolean left = isVisibleFromLeft(grid, row, column, elementFromGrid);
        boolean right = isVisibleFromRight(grid, row, column, elementFromGrid);
        return top || left || bottom || right;
    }

    public static void main(String[] args) {
        TreeTopHouse treeTopHouse = new TreeTopHouse();
        List<String> inputData = FileReader.readInputFile(INPUT_FOLDER_PATH + "day8");

        int[][] grid = treeTopHouse.parseInput(inputData);
        int resultPart1 = treeTopHouse.calculateVisibleTreesFromOutside(grid);
        System.out.println(resultPart1);
        long resultPart2 = treeTopHouse.calculateMaxScenicScore(grid);
        System.out.println(resultPart2);
    }
}
