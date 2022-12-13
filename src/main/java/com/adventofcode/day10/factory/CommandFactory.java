package com.adventofcode.day10.factory;

import com.adventofcode.day10.models.AddXCommand;
import com.adventofcode.day10.models.Command;
import com.adventofcode.day10.models.NoopCommand;

public class CommandFactory implements AbstractFactory<Command> {

    @Override
    public Command create(String instruction) {
        if (instruction.contains("addx"))
            return new AddXCommand();
        else if (instruction.contains("noop"))
            return new NoopCommand();
        return null;
    }
}