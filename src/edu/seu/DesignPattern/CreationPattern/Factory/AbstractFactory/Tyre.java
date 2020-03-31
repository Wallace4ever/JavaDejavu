package edu.seu.DesignPattern.CreationPattern.Factory.AbstractFactory;

public interface Tyre {
    public void scroll();
}

class GoodTyre implements Tyre{

    @Override
    public void scroll() {
        System.out.println("Tyre wears out slowly!");
    }
}

class CheapTyre implements Tyre{

    @Override
    public void scroll() {
        System.out.println("Tyre wears out fast!");
    }
}
