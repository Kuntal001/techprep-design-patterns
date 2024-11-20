package com.design.patterns.creational.factory.pattern;

public class VehicleToyFactory extends ToyFactory{
    public Toy createToy() {
        return new VehicleToy();
    }
}
