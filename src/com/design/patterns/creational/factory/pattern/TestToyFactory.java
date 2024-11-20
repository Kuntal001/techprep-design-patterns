package com.design.patterns.creational.factory.pattern;

public class TestToyFactory {

    public static void main(String[] args) {
        ToyFactory tf = new ToyFactory();
        tf.createToyFactory("Vehicle").printToySpecs();

        tf.createToyFactory("BoardGame").printToySpecs();

        tf.createToyFactory("Absurd").printToySpecs();
    }
}
