package com.design.patterns.creational.factory.pattern;

public class BoardGameFactory extends ToyFactory {
    public Toy createToy() {
        return new BoardGame();
    }
}
