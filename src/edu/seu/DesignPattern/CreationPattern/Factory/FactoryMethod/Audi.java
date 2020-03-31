package edu.seu.DesignPattern.CreationPattern.Factory.FactoryMethod;

public class Audi implements Car {
    @Override
    public void start() {
        System.out.println("This is Audi running!");
    }
}
