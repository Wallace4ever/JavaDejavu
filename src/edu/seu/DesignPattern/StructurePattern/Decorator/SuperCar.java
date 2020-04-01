package edu.seu.DesignPattern.StructurePattern.Decorator;

/**
 * Decorator 装饰角色
 */
public abstract class SuperCar implements Car {
    Car c;

    public SuperCar(Car c) {
        this.c = c;
    }

    public void move(){
        c.move();
    }
}

/**
 * Concrete Decorator 具体装饰角色
 */
class FlyCar extends SuperCar{
    public FlyCar(Car c) {
        super(c);
    }

    private void fly(){
        System.out.println("Now this car is able to fly!");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

class WaterCar extends SuperCar{

    public WaterCar(Car c) {
        super(c);
    }

    private void swim(){
        System.out.println("Now this car is able to swim!");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
