package edu.seu.DesignPattern.CreationPattern.Factory.SimpleFactory;

/**
 * Client只需要知道工厂和Car接口即可，不需要知道具体的产品实现类，如Audi
 */
public class Client {
    public static void main(String[] args) {
        Car car=SimpleFactory.createCar("Audi");
        car.start();
    }
}
