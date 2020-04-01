package edu.seu.DesignPattern.StructurePattern.Decorator;

/**
 * Concrete Component 具体构件角色，真实的功能完整，自身稳定
 */
public class NormalCar implements Car {
    @Override
    public void move() {
        System.out.println("This is a normal car moving normally.");
    }
}
