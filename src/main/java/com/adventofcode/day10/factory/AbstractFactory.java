package com.adventofcode.day10.factory;

public interface AbstractFactory<T> {
    T create(String command);
}
