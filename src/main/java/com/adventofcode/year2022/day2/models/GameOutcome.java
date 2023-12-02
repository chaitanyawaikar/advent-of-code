package com.adventofcode.year2022.day2.models;

public enum GameOutcome {
    LOST(0),
    DRAW(3),
    WON(6);

    private int value;

    GameOutcome(int value) {
        this.value = value;
    }

    public static GameOutcome fromString(String result) {
        switch (result) {
            case "X":
                return GameOutcome.LOST;
            case "Y":
                return GameOutcome.DRAW;
            case "Z":
                return GameOutcome.WON;
            default:
                throw new IllegalArgumentException(String.format("Illegal outcome %s", result));
        }
    }

    public int getScore() {
        return value;
    }
}