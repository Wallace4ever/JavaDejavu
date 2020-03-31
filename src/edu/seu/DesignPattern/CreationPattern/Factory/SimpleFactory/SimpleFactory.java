package edu.seu.DesignPattern.CreationPattern.Factory.SimpleFactory;

/**
 * 一个简单工厂就能完成多种产品的创建
 * 并向用户隐藏了具体的创建逻辑
 */
public class SimpleFactory {
    public static Car createCar(String brand){
        switch (brand){
            case "Audi":
                return new Audi();
            case "BYD":
                return new BYD();
            default:
                return null;
        }
    }
}
