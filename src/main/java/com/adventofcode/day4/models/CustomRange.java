package com.adventofcode.day4.models;

public class CustomRange {

    private int lowerBound;
    private int upperBound;

    public CustomRange(String range) {
        String[] split = range.split("-");
        this.lowerBound = Integer.parseInt(split[0]);
        this.upperBound = Integer.parseInt(split[1]);
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public boolean containsRange(CustomRange range) {
        return (range.lowerBound >= this.lowerBound) && (range.upperBound <= this.upperBound);
    }
}
