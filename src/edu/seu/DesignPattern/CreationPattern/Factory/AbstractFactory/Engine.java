package edu.seu.DesignPattern.CreationPattern.Factory.AbstractFactory;

public interface Engine {
    public void start();
}

class GoodEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Engine runs fast!");
    }
}

class CheapEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Engine runs slowly!");
    }
}