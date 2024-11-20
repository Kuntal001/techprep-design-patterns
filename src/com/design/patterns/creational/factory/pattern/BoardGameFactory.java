package com.design.patterns.creational.factory.pattern;

public class BoardGameFactory extends ToyFactory {
    @Override
    public void printToySpecs() {
        super.printToySpecs();
        Toy toy = new BoardGame();
        System.out.println(toy.action());
    }
}
