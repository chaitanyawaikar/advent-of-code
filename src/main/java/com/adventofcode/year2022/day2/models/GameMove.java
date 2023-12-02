package com.adventofcode.year2022.day2.models;

public enum GameMove {
    ROCK(1),
    PAPER(2),
    SCISSOR(3);

    private int value;

    GameMove(int value) {
        this.value = value;
    }

    public static GameMove fromString(String playerMove) {
        switch (playerMove) {
            case "A":
            case "X":
                return GameMove.ROCK;
            case "B":
            case "Y":
                return GameMove.PAPER;
            case "C":
            case "Z":
                return GameMove.SCISSOR;
            default:
                throw new IllegalArgumentException(String.format("Illegal move %s", playerMove));
        }
    }

    public int getScore() {
        return this.value;
    }
}
