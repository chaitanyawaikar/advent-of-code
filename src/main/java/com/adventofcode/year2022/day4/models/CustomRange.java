package com.adventofcode.year2022.day4.models;

public class CustomRange {

    private int lowerBound;
    private int upperBound;

    public CustomRange(String range) {
        String[] split = range.split("-");
        this.lowerBound = Integer.parseInt(split[0]);
        this.upperBound = Integer.parseInt(split[1]);
    }

    public boolean containsRange(CustomRange range) {
        return (range.lowerBound >= this.lowerBound) && (range.upperBound <= this.upperBound);
    }

    public boolean isOverlapping(CustomRange range) {
        return (
                (range.lowerBound >= this.lowerBound) && (range.lowerBound <= this.upperBound) ||
                        (range.upperBound >= this.lowerBound) && (range.upperBound <= this.upperBound)
        );
    }
}
