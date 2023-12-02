package com.adventofcode.year2022.models;

import com.adventofcode.year2022.day10.models.AddXCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddXCommandTest {

    @Test
    public void shouldParsePositiveAddXCommand() {
        AddXCommand command = new AddXCommand();

        Assertions.assertEquals(-11, command.addValueToRegister("addx -11"));
        Assertions.assertEquals(1, command.addValueToRegister("addx 1"));
    }
}