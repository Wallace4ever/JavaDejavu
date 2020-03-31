package edu.seu.DesignPattern.CreationPattern.Factory.FactoryMethod;

/**
 * 客户端只需要具体创建某一类型产品的构件工厂即可
 */
public class Client {
    public static void main(String[] args) {
        CarFactory cf = new AudiFactory();
        Car c=cf.createCar();
    }
}
