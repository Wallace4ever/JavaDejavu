package edu.seu.DesignPattern.CreationPattern.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton s=Singleton.getInstance();
        s.printName();

        HungryLoader h=HungryLoader.getInstance();
        h.printName();

        EnumSingleton.instance.printName();
    }
}
