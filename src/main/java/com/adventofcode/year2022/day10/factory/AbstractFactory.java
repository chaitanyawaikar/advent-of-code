package com.adventofcode.year2022.day10.factory;

public interface AbstractFactory<T> {
    T create(String command);
}
