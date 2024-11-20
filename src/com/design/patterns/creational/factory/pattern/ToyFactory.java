package com.design.patterns.creational.factory.pattern;

public class ToyFactory {

    public void printToySpecs() {
        System.out.println("Determining the toy type !");
    }
    public ToyFactory createToyFactory(String toyType) {
        return switch (toyType) {
            case "Vehicle" -> new VehicleToyFactory();
            case "BoardGame" -> new BoardGameFactory();
            default -> {
                System.out.println("Invalid toy type");
                throw new RuntimeException("Invalid toy type suggested !");
            }
        };
    }
}
