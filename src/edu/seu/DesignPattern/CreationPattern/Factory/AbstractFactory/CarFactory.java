package edu.seu.DesignPattern.CreationPattern.Factory.AbstractFactory;

/**
 *这里后面可以进一步结合建造者模式将返回的Engine和Tyre组装成Car
 */
public interface CarFactory {
    Engine createEngine();
    Tyre createTyre();
}

class HighEndFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new GoodEngine();
    }

    @Override
    public Tyre createTyre() {
        return new GoodTyre();
    }
}

class LowEndFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new CheapEngine();
    }

    @Override
    public Tyre createTyre() {
        return new CheapTyre();
    }
}

class MiddleFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new CheapEngine();
    }

    @Override
    public Tyre createTyre() {
        return new GoodTyre();
    }
}