package edu.seu.DesignPattern.CreationPattern.Factory.AbstractFactory;

/**
 * 新增抽象工厂的新实现类可以增加产品族
 * 该产品族可以进一步结合建造者模式组装成一个整体产品比如Car
 * 所有种类的工厂模式都是为了分离创建者和调用者，工厂模式还可以和很多创建型模式相结合
 */
public class Client {
    public static void main(String[] args) {
        CarFactory f= new HighEndFactory();
        Engine e=f.createEngine();
        Tyre t=f.createTyre();
        e.start();
        t.scroll();
    }
}
