package edu.seu.DesignPattern.StructurePattern.Decorator;

/**
 * 通过装饰动态地为具体构件角色NormalCar增加新的功能，缺点是会产生很多小对象，理论上过多小对象占用内存影响性能，且出错不易调试
 * Java io流就采用了这种设计模式
 */
public class Client {
    public static void main(String[] args) {
        NormalCar nc=new NormalCar();
        nc.move();
        FlyCar fc=new FlyCar(nc);
        fc.move();
        WaterCar wc=new WaterCar(nc);
        wc.move();

        Car fwc=new FlyCar(new WaterCar(new NormalCar()));
        fwc.move();
    }
}
