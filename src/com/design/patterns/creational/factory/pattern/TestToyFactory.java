package com.design.patterns.creational.factory.pattern;

public class TestToyFactory {

    public static void main(String[] args) {
        ToyFactory tf = new ToyFactory();
        tf.createToyFactory("Vehicle");
        tf.printToySpecs();

        tf.createToyFactory("BoardGame");
        tf.printToySpecs();

        tf.createToyFactory("Absurd");
        tf.printToySpecs();
    }
}
