package com.design.patterns.creational.factory.pattern;

public class VehicleToyFactory extends ToyFactory{
    @Override
    public void printToySpecs() {
        super.printToySpecs();
        Toy toy = new VehicleToy();
        System.out.println(toy.action());
    }
}
