package com.adventofcode.year2022.day10;

import com.adventofcode.year2022.day10.factory.CommandFactory;
import com.adventofcode.year2022.day10.models.Command;
import com.adventofcode.utils.FileReader;

import java.util.*;

import static com.adventofcode.utils.constants.Constants.INPUT_FOLDER_PATH;

public class CathodeRayTube {

    private int registerValue;
    private int cycleCount;
    private HashSet<Integer> cycleFrequencies;
    private CommandFactory commandFactory;
    public List<Integer> resultSignalStrengths;

    public CathodeRayTube() {
        this.registerValue = 1;
        this.cycleCount = 0;
        cycleFrequencies = new HashSet(Arrays.asList(20, 60, 100, 140, 180, 220));
        resultSignalStrengths = new ArrayList<>();
        commandFactory = new CommandFactory();
    }

    public void executeInstruction(String instruction) {
        Command command = commandFactory.create(instruction);
        int cycles = command.getCycles();
        while (cycles > 0) {
            if (cycleFrequencies.contains(cycleCount)) {
                resultSignalStrengths.add(cycleCount * registerValue);
            }
            cycles--;
            cycleCount++;
        }
        registerValue = registerValue + command.addValueToRegister(instruction);
    }


    public static void main(String[] args) {
        CathodeRayTube cathodeRayTube = new CathodeRayTube();
        List<String> inputData = FileReader.readInputFile(INPUT_FOLDER_PATH + "day10");

        inputData.forEach(cathodeRayTube::executeInstruction);
        System.out.println(cathodeRayTube.resultSignalStrengths.stream().mapToInt(i -> i).sum());
    }
}
