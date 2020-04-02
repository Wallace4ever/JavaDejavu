package edu.seu.DesignPattern.ActionPattern.Strategy;

/**
 * 分离策略算法，选择实现
 */
public class Client {
    public static void main(String[] args) {
        Context vip=new Context(new AggressiveStrategy());
        Context nvip=new Context(new ConventionalStrategy());
        vip.printPrice(100);
        nvip.printPrice(100);
    }
}
