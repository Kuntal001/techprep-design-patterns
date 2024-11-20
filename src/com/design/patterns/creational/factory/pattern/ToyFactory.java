package com.design.patterns.creational.factory.pattern;

public class ToyFactory {

    private Toy toy;

    public void printToySpecs() {
        System.out.println(toy.action());
    }

    public void createToyFactory(String toyType) {
        switch (toyType) {
            case "Vehicle" -> this.toy = new VehicleToyFactory().createToy();
            case "BoardGame" -> this.toy = new BoardGameFactory().createToy();
            default -> {
                System.out.println("Invalid toy type");
                throw new RuntimeException("Invalid toy type suggested !");
            }
        }
    }

}
