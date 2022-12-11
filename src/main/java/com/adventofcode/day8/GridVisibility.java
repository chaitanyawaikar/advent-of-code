package com.adventofcode.day8;

public class GridVisibility {

    public static boolean isVisibleFromTop(
            int[][] grid,
            int row,
            int column,
            int elementFromGrid
    ) {
        int rowIterator = row - 1;
        boolean isVisibleFromTop = true;

        while (rowIterator >= 0) {
            isVisibleFromTop = isVisibleFromTop & (grid[rowIterator][column] < elementFromGrid);
            rowIterator--;
        }
        return isVisibleFromTop;
    }

    public static boolean isVisibleFromBottom(
            int[][] grid,
            int row,
            int column,
            int elementFromGrid
    ) {
        int rowIterator = row + 1;
        boolean isVisibleFromBottom = true;

        while (rowIterator < grid[column].length) {
            isVisibleFromBottom = isVisibleFromBottom & (grid[rowIterator][column] < elementFromGrid);
            rowIterator++;
        }
        return isVisibleFromBottom;
    }

    public static boolean isVisibleFromLeft(
            int[][] grid,
            int row,
            int column,
            int elementFromGrid
    ) {
        int columnIterator = column - 1;
        boolean isVisibleFromLeft = true;

        while (columnIterator >= 0) {
            isVisibleFromLeft = isVisibleFromLeft & (grid[row][columnIterator] < elementFromGrid);
            columnIterator--;
        }
        return isVisibleFromLeft;
    }

    public static boolean isVisibleFromRight(
            int[][] grid,
            int row,
            int column,
            int elementFromGrid
    ) {
        int columnIterator = column + 1;
        boolean isVisibleFromRight = true;

        while (columnIterator < grid[row].length) {
            isVisibleFromRight = isVisibleFromRight & (grid[row][columnIterator] < elementFromGrid);
            columnIterator++;
        }
        return isVisibleFromRight;
    }

    public static int scenicScoreFromTop(
            int[][] grid,
            int row,
            int column,
            int elementFromGrid
    ) {
        int scenicScore = 0;
        int rowIterator = row - 1;

        while (rowIterator >= 0) {
            if (grid[rowIterator][column] == elementFromGrid) {
                scenicScore++;
                break;
            } else if (grid[rowIterator][column] < elementFromGrid) scenicScore++;
            else {
                scenicScore++;
                break;
            }
            rowIterator--;
        }
        return scenicScore;
    }

    public static int scenicScoreFromBottom(
            int[][] grid,
            int row,
            int column,
            int elementFromGrid
    ) {
        int scenicScore = 0;
        int rowIterator = row + 1;

        while (rowIterator < grid[column].length) {
            if (grid[rowIterator][column] == elementFromGrid) {
                scenicScore++;
                break;
            } else if (grid[rowIterator][column] < elementFromGrid) scenicScore++;
            else {
                scenicScore++;
                break;
            }
            rowIterator++;
        }
        return scenicScore;
    }

    public static int scenicScoreFromLeft(
            int[][] grid,
            int row,
            int column,
            int elementFromGrid
    ) {
        int scenicScore = 0;
        int columnIterator = column - 1;

        while (columnIterator >= 0) {
            if (grid[row][columnIterator] == elementFromGrid) {
                scenicScore++;
                break;
            } else if (grid[row][columnIterator] < elementFromGrid) scenicScore++;
            else {
                scenicScore++;
                break;
            }
            columnIterator--;
        }
        return scenicScore;
    }

    public static int scenicScoreFromRight(
            int[][] grid,
            int row,
            int column,
            int elementFromGrid
    ) {
        int columnIterator = column + 1;
        int scenicScore = 0;

        while (columnIterator < grid[row].length) {
            if (grid[row][columnIterator] == elementFromGrid) {
                scenicScore++;
                break;
            } else if (grid[row][columnIterator] < elementFromGrid) scenicScore++;
            else {
                scenicScore++;
                break;
            }
            columnIterator++;
        }
        return scenicScore;
    }
}
