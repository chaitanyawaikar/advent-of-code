package com.adventofcode.year2022.day10.models;

import com.adventofcode.utils.constants.Constants;

public class AddXCommand implements Command {

    @Override
    public int addValueToRegister(String command) {
        String addToRegisterValue = command.split(Constants.BLANK_SPACE)[1];
        return Integer.parseInt(addToRegisterValue);
    }

    @Override
    public int getCycles() {
        return 2;
    }
}
