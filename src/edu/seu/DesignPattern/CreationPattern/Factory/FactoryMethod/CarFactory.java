package edu.seu.DesignPattern.CreationPattern.Factory.FactoryMethod;

public interface CarFactory {
    public Car createCar();
}

class AudiFactory implements CarFactory{

    @Override
    public  Car createCar() {
        return new Audi();
    }
}

class BYDFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new BYD();
    }
}