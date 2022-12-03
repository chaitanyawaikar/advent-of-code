package com.adventofcode.day2.models;

public enum GameOutcome {
    LOST(0),
    DRAW(3),
    WON(6);

    private int value;

    GameOutcome(int value) {
        this.value = value;
    }

    public int getScore() {
        return value;
    }
}