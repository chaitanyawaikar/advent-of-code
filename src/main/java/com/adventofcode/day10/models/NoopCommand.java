package com.adventofcode.day10.models;

public class NoopCommand implements Command {

    @Override
    public int addValueToRegister(String command) {
        return 0;
    }

    @Override
    public int getCycles() {
        return 1;
    }
}
