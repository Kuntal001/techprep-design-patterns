package com.design.patterns.creational.factory.pattern;

public class BoardGame implements Toy{
    @Override
    public String action() {
        return "It makes your mind work !";
    }
}
