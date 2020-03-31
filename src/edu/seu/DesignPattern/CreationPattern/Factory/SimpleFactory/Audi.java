package edu.seu.DesignPattern.CreationPattern.Factory.SimpleFactory;

public class Audi implements Car{
    @Override
    public void start() {
        System.out.println("This is Audi running!");
    }
}
